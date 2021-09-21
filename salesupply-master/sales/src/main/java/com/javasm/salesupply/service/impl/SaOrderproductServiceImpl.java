package com.javasm.salesupply.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.criteria.SaOrderproductCriteria;
import com.javasm.salesupply.domain.entity.SaOrderproduct;
import com.javasm.salesupply.domain.entity.SpAbnormalcomplaint;
import com.javasm.salesupply.mapper.SaOrderproductMapper;
import com.javasm.salesupply.service.SaOrderproductService;
import com.javasm.salesupply.service.base.impl.BaseServiceImpl;
import com.javasm.salesupply.transfer.SaOrderproductTransfer;
import com.javasm.salesupply.vo.SaOrderproductVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author whl
 * @since 2021-07-12
 */
@Service
@Transactional
@RequiredArgsConstructor
public class SaOrderproductServiceImpl extends BaseServiceImpl<SaOrderproduct> implements SaOrderproductService {
    private final SaOrderproductMapper saOrderproductMapper;

    private final SaOrderproductTransfer saOrderproductTransfer;

    @Override
    public PageResult<SaOrderproductVo> searchPageByCriteria(SaOrderproductCriteria saOrderproductCriteria) {

        Integer currentPage = saOrderproductCriteria.getCurrentPage();
        Integer pageSize = saOrderproductCriteria.getPageSize();

        if (StringUtils.isEmpty(pageSize)){
            currentPage =1;
        }
        if (StringUtils.isEmpty(pageSize)){
            pageSize = 5;
        }

        PageHelper.startPage(currentPage,pageSize);
        LocalDateTime startTime = saOrderproductCriteria.getStartTime();
        LocalDateTime endTime = saOrderproductCriteria.getEndTime();
        Integer orderId = saOrderproductCriteria.getOrderId();

        QueryWrapper<SaOrderproduct> saOrderproductQueryWrapper = new QueryWrapper<SaOrderproduct>();
        LambdaQueryWrapper<SaOrderproduct> lambda = saOrderproductQueryWrapper.lambda();


        //拼接sql的
        if (startTime!=null &&endTime != null){
            lambda.between(SaOrderproduct::getOrderCreateTime,startTime,endTime);
        }

        if (!StringUtils.isEmpty(orderId)){
            lambda.like(SaOrderproduct::getOrderId, orderId);
        }


        List<SaOrderproduct> saOrderproductList = saOrderproductMapper.selectList(saOrderproductQueryWrapper);

        PageInfo<SaOrderproduct> saOrderproductPageInfo = new PageInfo<>(saOrderproductList);

        long total = saOrderproductPageInfo.getTotal();

        //brandList ------>brandVoList

        List<SaOrderproductVo> saOrderproductVoList = saOrderproductTransfer.toVO(saOrderproductList);


        return new PageResult<SaOrderproductVo>(total,saOrderproductVoList);

    }

}
