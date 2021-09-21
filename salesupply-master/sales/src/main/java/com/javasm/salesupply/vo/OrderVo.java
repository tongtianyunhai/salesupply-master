package com.javasm.salesupply.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author：wanqi
 * @Version：1.0
 * @Date：2021/7/13-21:43
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
public class OrderVo{
    //订单编号
    private Integer orderId;
    //订单类型
    private String orderType;
    //订单动作
    private String orderAction;
    //业务类型
    private String orderBusinesstype;
    //支付方式
    private String orderPayment;
    //配送方式
    private String deliveryMode;
    //订单状态
    private String orderStatus;
    //商品名称productName
    private String productName;




}
