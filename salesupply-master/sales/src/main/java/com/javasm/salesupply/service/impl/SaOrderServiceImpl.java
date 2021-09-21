package com.javasm.salesupply.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.criteria.OrderCriteria;
import com.javasm.salesupply.domain.entity.SaOrder;
import com.javasm.salesupply.mapper.SaOrderMapper;
import com.javasm.salesupply.service.SaOrderService;
import com.javasm.salesupply.service.base.impl.BaseServiceImpl;
import com.javasm.salesupply.transfer.OrderTransfer;
import com.javasm.salesupply.vo.OrderVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author wq
 * @since 2021-07-12
 */
@Service
@Transactional
@RequiredArgsConstructor
public class SaOrderServiceImpl extends BaseServiceImpl<SaOrder> implements SaOrderService {
    private final SaOrderMapper saOrderMapper;
    private final OrderTransfer orderTransfer;


    @Override
    public PageResult<OrderVo> searchPageByCriteria(OrderCriteria orderCriteria) {

        Integer currentPage = orderCriteria.getCurrentPage();
        Integer pageSize = orderCriteria.getPageSize();

        PageHelper.startPage(currentPage, pageSize);
        LocalDateTime startTime = orderCriteria.getStartTime();
        LocalDateTime endTime = orderCriteria.getEndTime();

        Integer orderId = orderCriteria.getOrderId();
        String orderType = orderCriteria.getOrderType();
        String orderPayment = orderCriteria.getOrderPayment();
        String orderBusinesstype = orderCriteria.getOrderBusinesstype();
        LocalDateTime orderTime = orderCriteria.getOrderTime();
        String orderAction = orderCriteria.getOrderAction();
        String orderStatus = orderCriteria.getOrderStatus();
        String productName = orderCriteria.getProductName();

        QueryWrapper<SaOrder> orderQueryWrapper = new QueryWrapper<SaOrder>();
        LambdaQueryWrapper<SaOrder> lambda = orderQueryWrapper.lambda();


        //拼接sql的
        if (startTime != null && endTime != null) {
            lambda.between(SaOrder::getOrderTime, startTime, endTime);
        }

        if (!StringUtils.isEmpty(orderId)) {
            lambda.like(SaOrder::getOrderId, orderId);
        }
        if (!StringUtils.isEmpty(orderType)) {
            lambda.like(SaOrder::getOrderType, orderType);
        }

        if (!StringUtils.isEmpty(orderPayment)) {
            lambda.like(SaOrder::getOrderPayment, orderPayment);
        }
        if (!StringUtils.isEmpty(orderBusinesstype)) {
            lambda.like(SaOrder::getOrderBusinesstype, orderBusinesstype);
        }
        if (!StringUtils.isEmpty(orderTime)) {
            lambda.like(SaOrder::getOrderTime, orderTime);
        }
        if (!StringUtils.isEmpty(orderAction)) {
            lambda.like(SaOrder::getOrderAction, orderAction);
        }
        if (!StringUtils.isEmpty(orderStatus)) {
            lambda.like(SaOrder::getOrderStatus, orderStatus);
        }
        if (!StringUtils.isEmpty(productName)) {
            lambda.like(SaOrder::getProductName, productName);
        }


        List<SaOrder> orderList = saOrderMapper.selectList(orderQueryWrapper);

        PageInfo<SaOrder> brandPageInfo = new PageInfo<>(orderList);

        long total = brandPageInfo.getTotal();


        List<OrderVo> orderVoList = orderTransfer.toVO(orderList);


        return new PageResult<OrderVo>(total, orderVoList);

    }

    @Override
    public PageResult<OrderVo> searchPageByCriteria2(OrderCriteria orderCriteria) {

        Integer currentPage = orderCriteria.getCurrentPage();
        Integer pageSize = orderCriteria.getPageSize();

        PageHelper.startPage(currentPage, pageSize);
        LocalDateTime startTime = orderCriteria.getStartTime();
        LocalDateTime endTime = orderCriteria.getEndTime();

        Integer orderId = orderCriteria.getOrderId();
        String orderType = orderCriteria.getOrderType();
        String orderPayment = orderCriteria.getOrderPayment();
        String orderBusinesstype = orderCriteria.getOrderBusinesstype();
        LocalDateTime orderTime = orderCriteria.getOrderTime();
        String orderAction = orderCriteria.getOrderAction();
        String orderStatus = orderCriteria.getOrderStatus();
        String productName = orderCriteria.getProductName();

        QueryWrapper<SaOrder> orderQueryWrapper = new QueryWrapper<SaOrder>();
        LambdaQueryWrapper<SaOrder> lambda = orderQueryWrapper.lambda();


        //拼接sql的
        if (startTime != null && endTime != null) {
            lambda.between(SaOrder::getOrderTime, startTime, endTime);
        }

        if (!StringUtils.isEmpty(orderId)) {
            lambda.like(SaOrder::getOrderId, orderId);
        }

        lambda.like(SaOrder::getOrderType, "网店");
        if (!StringUtils.isEmpty(orderPayment)) {
            lambda.like(SaOrder::getOrderPayment, orderPayment);
        }
        if (!StringUtils.isEmpty(orderBusinesstype)) {
            lambda.like(SaOrder::getOrderBusinesstype, orderBusinesstype);
        }
        if (!StringUtils.isEmpty(orderTime)) {
            lambda.like(SaOrder::getOrderTime, orderTime);
        }
        if (!StringUtils.isEmpty(orderAction)) {
            lambda.like(SaOrder::getOrderAction, orderAction);
        }
        if (!StringUtils.isEmpty(orderStatus)) {
            lambda.like(SaOrder::getOrderStatus, orderStatus);
        }
        if (!StringUtils.isEmpty(productName)) {
            lambda.like(SaOrder::getProductName, productName);
        }


        List<SaOrder> orderList = saOrderMapper.selectList(orderQueryWrapper);

        PageInfo<SaOrder> brandPageInfo = new PageInfo<>(orderList);

        long total = brandPageInfo.getTotal();


        List<OrderVo> orderVoList = orderTransfer.toVO(orderList);


        return new PageResult<OrderVo>(total, orderVoList);

    }
    @Override
    public PageResult<OrderVo> searchPageByCriteria3(OrderCriteria orderCriteria) {

        Integer currentPage = orderCriteria.getCurrentPage();
        Integer pageSize = orderCriteria.getPageSize();

        PageHelper.startPage(currentPage, pageSize);
        LocalDateTime startTime = orderCriteria.getStartTime();
        LocalDateTime endTime = orderCriteria.getEndTime();

        Integer orderId = orderCriteria.getOrderId();
        String orderType = orderCriteria.getOrderType();
        String orderPayment = orderCriteria.getOrderPayment();
        String orderBusinesstype = orderCriteria.getOrderBusinesstype();
        LocalDateTime orderTime = orderCriteria.getOrderTime();
        String orderAction = orderCriteria.getOrderAction();
        String orderStatus = orderCriteria.getOrderStatus();
        String productName = orderCriteria.getProductName();

        QueryWrapper<SaOrder> orderQueryWrapper = new QueryWrapper<SaOrder>();
        LambdaQueryWrapper<SaOrder> lambda = orderQueryWrapper.lambda();


        //拼接sql的
        if (startTime != null && endTime != null) {
            lambda.between(SaOrder::getOrderTime, startTime, endTime);
        }

        if (!StringUtils.isEmpty(orderId)) {
            lambda.like(SaOrder::getOrderId, orderId);
        }

        if (!StringUtils.isEmpty(orderType)) {
            lambda.like(SaOrder::getOrderType, orderType);
        }
        if (!StringUtils.isEmpty(orderPayment)) {
            lambda.like(SaOrder::getOrderPayment, orderPayment);
        }
        if (!StringUtils.isEmpty(orderBusinesstype)) {
            lambda.like(SaOrder::getOrderBusinesstype, orderBusinesstype);
        }
        if (!StringUtils.isEmpty(orderTime)) {
            lambda.like(SaOrder::getOrderTime, orderTime);
        }
        if (!StringUtils.isEmpty(orderAction)) {
            lambda.like(SaOrder::getOrderAction, orderAction);
        }

            lambda.like(SaOrder::getOrderStatus, "待出库");

        if (!StringUtils.isEmpty(productName)) {
            lambda.like(SaOrder::getProductName, productName);
        }


        List<SaOrder> orderList = saOrderMapper.selectList(orderQueryWrapper);

        PageInfo<SaOrder> brandPageInfo = new PageInfo<>(orderList);

        long total = brandPageInfo.getTotal();


        List<OrderVo> orderVoList = orderTransfer.toVO(orderList);


        return new PageResult<OrderVo>(total, orderVoList);

    }
    @Override
    public PageResult<OrderVo> searchPageByCriteria4(OrderCriteria orderCriteria) {

        Integer currentPage = orderCriteria.getCurrentPage();
        Integer pageSize = orderCriteria.getPageSize();

        PageHelper.startPage(currentPage, pageSize);
        LocalDateTime startTime = orderCriteria.getStartTime();
        LocalDateTime endTime = orderCriteria.getEndTime();

        Integer orderId = orderCriteria.getOrderId();
        String orderType = orderCriteria.getOrderType();
        String orderPayment = orderCriteria.getOrderPayment();
        String orderBusinesstype = orderCriteria.getOrderBusinesstype();
        LocalDateTime orderTime = orderCriteria.getOrderTime();
        String orderAction = orderCriteria.getOrderAction();
        String orderStatus = orderCriteria.getOrderStatus();
        String productName = orderCriteria.getProductName();

        QueryWrapper<SaOrder> orderQueryWrapper = new QueryWrapper<SaOrder>();
        LambdaQueryWrapper<SaOrder> lambda = orderQueryWrapper.lambda();


        //拼接sql的
        if (startTime != null && endTime != null) {
            lambda.between(SaOrder::getOrderTime, startTime, endTime);
        }

        if (!StringUtils.isEmpty(orderId)) {
            lambda.like(SaOrder::getOrderId, orderId);
        }

        if (!StringUtils.isEmpty(orderType)) {
            lambda.like(SaOrder::getOrderType, orderType);
        }
        if (!StringUtils.isEmpty(orderPayment)) {
            lambda.like(SaOrder::getOrderPayment, orderPayment);
        }
        if (!StringUtils.isEmpty(orderBusinesstype)) {
            lambda.like(SaOrder::getOrderBusinesstype, orderBusinesstype);
        }
        if (!StringUtils.isEmpty(orderTime)) {
            lambda.like(SaOrder::getOrderTime, orderTime);
        }
        if (!StringUtils.isEmpty(orderAction)) {
            lambda.like(SaOrder::getOrderAction, orderAction);
        }

            lambda.like(SaOrder::getOrderStatus, "已出库");

        if (!StringUtils.isEmpty(productName)) {
            lambda.like(SaOrder::getProductName, productName);
        }


        List<SaOrder> orderList = saOrderMapper.selectList(orderQueryWrapper);

        PageInfo<SaOrder> brandPageInfo = new PageInfo<>(orderList);

        long total = brandPageInfo.getTotal();


        List<OrderVo> orderVoList = orderTransfer.toVO(orderList);


        return new PageResult<OrderVo>(total, orderVoList);

    }

}

