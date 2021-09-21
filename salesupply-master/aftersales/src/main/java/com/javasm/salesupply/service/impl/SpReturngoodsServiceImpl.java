package com.javasm.salesupply.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.SpReturngoodsCriteria;
import com.javasm.salesupply.domain.entity.SpReturngoods;
import com.javasm.salesupply.domain.entity.StGodown;
import com.javasm.salesupply.domain.vo.SpReturngoodsVo;
import com.javasm.salesupply.mapper.SpReturngoodsMapper;
import com.javasm.salesupply.service.SpReturngoodsService;
import com.javasm.salesupply.service.base.impl.BaseServiceImpl;
import com.javasm.salesupply.transfer.SpReturngoodsTransfer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author：戈李阳
 * @Version：1.0
 * @Date：2021/7/12-19:08
 * @Since:jdk1.8
 * @Description:TODO
 */
@Service
@Transactional
@RequiredArgsConstructor
public class SpReturngoodsServiceImpl extends BaseServiceImpl<SpReturngoods> implements SpReturngoodsService {

    private final SpReturngoodsMapper spReturngoodsMapper;

    private final SpReturngoodsTransfer spReturngoodsTransfer;

    @Override
    public PageResult<SpReturngoodsVo> searchPageByCriteria(SpReturngoodsCriteria spReturngoodsCriteria) {

        Integer currentPage = spReturngoodsCriteria.getCurrentPage();
        Integer pageSize =spReturngoodsCriteria.getPageSize();

        if (StringUtils.isEmpty(pageSize)){
            currentPage =1;
        }
        if (StringUtils.isEmpty(pageSize)){
            pageSize = 5;
        }

        PageHelper.startPage(currentPage,pageSize);
        LocalDateTime startTime = spReturngoodsCriteria.getStartTime();
        LocalDateTime endTime = spReturngoodsCriteria.getEndTime();
        String spOrderid = spReturngoodsCriteria.getSpOrderid();

        QueryWrapper<SpReturngoods> spReturngoodsQueryWrapper = new QueryWrapper<SpReturngoods>();
        LambdaQueryWrapper<SpReturngoods> lambda = spReturngoodsQueryWrapper.lambda();


        //拼接sql的
        if (startTime!=null &&endTime != null){
            lambda.between(SpReturngoods::getSpCreateDate,startTime,endTime);
        }

        if (!StringUtils.isEmpty(spOrderid)){
            lambda.like(SpReturngoods::getSpOrderid, spOrderid);
        }


        List<SpReturngoods>spReturngoodsList = spReturngoodsMapper.selectList(spReturngoodsQueryWrapper);

        PageInfo<SpReturngoods> spReturngoodsPageInfo = new PageInfo<>(spReturngoodsList);

        long total = spReturngoodsPageInfo.getTotal();

        //brandList ------>brandVoList

        List<SpReturngoodsVo> spReturngoodsVoList = spReturngoodsTransfer.toVO(spReturngoodsList);


        return new PageResult<SpReturngoodsVo>(total,spReturngoodsVoList);
    }

    @Override
    public boolean addcheck(SpReturngoodsCriteria spReturngoodsCriteria) {

        SpReturngoods spReturngoods=new SpReturngoods();

        spReturngoods.setSpSellsid(spReturngoodsCriteria.getOrderId().toString());
        spReturngoods.setSpGoodsid(spReturngoodsCriteria.getProductId().toString());
        spReturngoods.setSpGoodsname(spReturngoodsCriteria.getProductName());
        spReturngoods.setSpGoodsprice(spReturngoodsCriteria.getProductPrice().toString());
        spReturngoods.setSpGoodsiemi(spReturngoodsCriteria.getOrderImei().toString());
        spReturngoods.setSpGoodscolor(spReturngoodsCriteria.getOrderGoodscolor());
        spReturngoods.setSpGoodstype(spReturngoodsCriteria.getOrderGoodstype());

        spReturngoods.setSpOrderid(spReturngoodsCriteria.getOrderId());
        spReturngoods.setSpApplicationid(spReturngoodsCriteria.getSpApplicationid());
        spReturngoods.setSpAddtion(spReturngoodsCriteria.getSpAddtion());
        spReturngoods.setSpCauses(spReturngoodsCriteria.getSpCauses());
        spReturngoods.setSpCreateBy(spReturngoodsCriteria.getSpCreateBy());
        spReturngoods.setSpCreateDate(spReturngoodsCriteria.getSpCreateDate());
        spReturngoods.setSpGoodscost(spReturngoodsCriteria.getSpGoodscost());
        spReturngoods.setSpHandletype(spReturngoodsCriteria.getSpHandletype());
        spReturngoods.setSpMaintenanceid(spReturngoodsCriteria.getSpMaintenanceid());
        spReturngoods.setSpMaintenancestatus(spReturngoodsCriteria.getSpMaintenancestatus());
        spReturngoods.setSpOrderstatus(spReturngoodsCriteria.getSpOrderstatus());


//        System.out.println("4396"+spReturngoods);
        int insert = spReturngoodsMapper.insert(spReturngoods);
        return insert>0;
    }


}
