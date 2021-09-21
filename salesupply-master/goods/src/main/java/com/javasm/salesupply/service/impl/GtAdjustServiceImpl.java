package com.javasm.salesupply.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.AdjustCriteria;
import com.javasm.salesupply.domain.entity.GdGoods;
import com.javasm.salesupply.domain.entity.GtAdjust;
import com.javasm.salesupply.domain.entity.PromoteApproval;
import com.javasm.salesupply.domain.vo.AdjustVO;
import com.javasm.salesupply.mapper.GdGoodsDao;
import com.javasm.salesupply.mapper.GtAdjustMapper;
import com.javasm.salesupply.mapper.PromoteApprovalDao;
import com.javasm.salesupply.service.IGtAdjustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author chy
 * @since 2021-07-17
 */
@Service
public class GtAdjustServiceImpl extends ServiceImpl<GtAdjustMapper, GtAdjust> implements IGtAdjustService {

    @Autowired
    private GtAdjustMapper gtAdjustMapper;
    @Autowired
    private PromoteApprovalDao promoteApprovalDao;
    @Autowired
    private GdGoodsDao gdGoodsDao;


    @Override
    public Boolean saveAndCreateApproval(GtAdjust gtAdjust) {
        boolean b = false;
        PromoteApproval promoteApproval = new PromoteApproval();
        promoteApproval.setApprovalStatus(0);
        Integer adjustGoodid = gtAdjust.getAdjustGoodid();
        GdGoods gdGoods = gdGoodsDao.queryById(adjustGoodid);

        /**
         * sbwy
         */
        if (gtAdjust.getAdjustMkAdjustpricetype() == 1) {
            if (Integer.parseInt(gdGoods.getGoodsMarketprice()) / gtAdjust.getAdjustMkProprice().intValue() >= 5) {
                promoteApproval.setApprovalLevel("2");
            } else if (Integer.parseInt(gdGoods.getGoodsMarketprice()) / gtAdjust.getAdjustMkProprice().intValue() < 5 &&
                    Integer.parseInt(gdGoods.getGoodsMarketprice()) / gtAdjust.getAdjustMkProprice().intValue() > 1) {
                promoteApproval.setApprovalLevel("1");
            } else {
                promoteApproval.setApprovalLevel("0");
            }
        }
        promoteApprovalDao.insert(promoteApproval);
        int insert = promoteApprovalDao.selectMaxId();
        gtAdjust.setAdjustApprovaid(insert);
        int insert1 = gtAdjustMapper.insert(gtAdjust);
        if (insert1 > 0) {
            b = true;
        }
        return b;
    }

    @Override
    public PageResult<AdjustVO> searchPageByCriteria(AdjustCriteria adjustCriteria) {
        Integer currentPage = adjustCriteria.getCurrentPage();
        Integer pageSize = adjustCriteria.getPageSize();

        if (StringUtils.isEmpty(currentPage)) {
            currentPage = 1;
        }
        if (StringUtils.isEmpty(pageSize)) {
            pageSize = 5;
        }
        PageHelper.startPage(currentPage, pageSize);
        List<AdjustVO> adjustVOS = gtAdjustMapper.selectVO(adjustCriteria);
        PageInfo<AdjustVO> adjustVOPageInfo = new PageInfo<>(adjustVOS);
        long total = adjustVOPageInfo.getTotal();
        return new PageResult<>(total, adjustVOS);
    }
}
