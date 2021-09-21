package com.javasm.salesupply.criteria;

import com.javasm.salesupply.criteria.base.BaseQueryCriteria;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @Author：wanqi
 * @Version：1.0
 * @Date：2021/7/13-21:55
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
public class OrderCriteria extends BaseQueryCriteria {
    //订单编号
    private Integer orderId;

    //订单类型（1电话订单，2网络订单，3其它
    private String orderType;
    //支付方式（货到付款，款到发货）
    private String orderPayment;

    //业务类型（1普通业务，2号卡套餐）
    private String orderBusinesstype;
    //下单日期
    private LocalDateTime orderTime;
    //订单动作（1订购、2换购、3支付
    private String orderAction;
    //商品名称
    private String productName;


    //订单状态（审核通过，已付款，已出库，已发货，已到货，已归档
    private String orderStatus;
}
