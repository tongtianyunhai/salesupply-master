package com.javasm.salesupply.service.impl;




import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.criteria.SaReturnedCriteria;
import com.javasm.salesupply.domain.entity.SaReturned;
import com.javasm.salesupply.domain.entity.SaReturned;
import com.javasm.salesupply.mapper.SaOrderMapper;
import com.javasm.salesupply.mapper.SaReturnedMapper;
import com.javasm.salesupply.service.SaReturnedService;
import com.javasm.salesupply.service.base.impl.BaseServiceImpl;
import com.javasm.salesupply.transfer.OrderTransfer;
import com.javasm.salesupply.transfer.SaReturnedTransfer;
import com.javasm.salesupply.vo.OrderVo;
import com.javasm.salesupply.vo.SaReturnedVo;
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
 * @author wq
 * @since 2021-07-12
 */
@Service
@Transactional
@RequiredArgsConstructor
public class SaReturnedServiceImpl extends BaseServiceImpl<SaReturned> implements SaReturnedService {
    private final SaReturnedMapper saReturnedMapper;
    private final SaReturnedTransfer saReturnedTransfer;

    @Override
    public PageResult<SaReturnedVo> searchPageByCriteria(SaReturnedCriteria saReturnedCriteria) {
        Integer currentPage = saReturnedCriteria.getCurrentPage();
        Integer pageSize = saReturnedCriteria.getPageSize();

        PageHelper.startPage(currentPage, pageSize);


        Integer orderId = saReturnedCriteria.getOrderId();

        String deliveryUsername = saReturnedCriteria.getDeliveryUsername();
        String deliveryAddress = saReturnedCriteria.getDeliveryAddress();
        String rejectCause = saReturnedCriteria.getRejectCause();

        LocalDateTime startTime = saReturnedCriteria.getStartTime();
        LocalDateTime endTime = saReturnedCriteria.getEndTime();

        LocalDateTime startTime2 = saReturnedCriteria.getStartTime2();
        LocalDateTime endTime2 = saReturnedCriteria.getEndTime2();

        LocalDateTime startTime3 = saReturnedCriteria.getStartTime3();
        LocalDateTime endTime3 = saReturnedCriteria.getStartTime3();

        LocalDateTime startTime4 = saReturnedCriteria.getStartTime4();
        LocalDateTime endTime4= saReturnedCriteria.getStartTime4();

        String orderType = saReturnedCriteria.getOrderType();
        String orderPayment = saReturnedCriteria.getOrderPayment();
        String orderBusinesstype = saReturnedCriteria.getOrderBusinesstype();

        String orderAction = saReturnedCriteria.getOrderAction();
        String orderStatus = saReturnedCriteria.getOrderStatus();


        QueryWrapper<SaReturned> saReturnedQueryWrapper = new QueryWrapper<SaReturned>();
        LambdaQueryWrapper<SaReturned> lambda = saReturnedQueryWrapper.lambda();
////    @ApiModelProperty(value = "下单日期")
//        private LocalDateTime orderTime;
//        /**
//         * 拒收时间
//         */
//        private LocalDateTime rejectTime;
//
//        /**
//         * 发货时间
//         */
//        private LocalDateTime deliverTime;
//
//        /**
//         * 签收时间
//         */
//        private LocalDateTime signfoTime;

        //拼接sql的
        if (startTime != null && endTime != null) {
            lambda.between(SaReturned::getOrderTime, startTime, endTime);
        }
        if (startTime2 != null && endTime2 != null) {
            lambda.between(SaReturned::getRejectTime, startTime2, endTime2);
        }
        if (startTime3 != null && endTime3 != null) {
            lambda.between(SaReturned::getDeliverTime, startTime3, endTime3);
        }
        if (startTime4 != null && endTime4 != null) {
            lambda.between(SaReturned::getSignfoTime, startTime4, endTime4);
        }

        if (!StringUtils.isEmpty(orderId)) {
            lambda.like(SaReturned::getOrderId, orderId);
        }
        if (!StringUtils.isEmpty(deliveryUsername)) {
            lambda.like(SaReturned::getDeliveryUsername, deliveryUsername);
        }
        if (!StringUtils.isEmpty(deliveryAddress)) {
            lambda.like(SaReturned::getDeliveryAddress, deliveryAddress);

        }
        if (!StringUtils.isEmpty(rejectCause)) {
            lambda.like(SaReturned::getRejectCause, rejectCause);
        }


        if (!StringUtils.isEmpty(orderType)) {
            lambda.like(SaReturned::getOrderType, orderType);
        }
        if (!StringUtils.isEmpty(orderPayment)) {
            lambda.like(SaReturned::getOrderPayment, orderPayment);
        }
        if (!StringUtils.isEmpty(orderBusinesstype)) {
            lambda.like(SaReturned::getOrderBusinesstype, orderBusinesstype);
        }

        if (!StringUtils.isEmpty(orderAction)) {
            lambda.like(SaReturned::getOrderAction, orderAction);
        }
        if (!StringUtils.isEmpty(orderStatus)) {
            lambda.like(SaReturned::getOrderStatus, orderStatus);
        }
       


        List<SaReturned> saReturnedList = saReturnedMapper.selectList(saReturnedQueryWrapper);

        PageInfo<SaReturned> saReturnedPageInfo = new PageInfo<>(saReturnedList);

        long total = saReturnedPageInfo.getTotal();


        List<SaReturnedVo> orderVoList = saReturnedTransfer.toVO(saReturnedList);

        return new PageResult<SaReturnedVo>(total, orderVoList);


    }
}
