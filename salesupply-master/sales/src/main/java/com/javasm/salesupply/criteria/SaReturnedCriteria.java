package com.javasm.salesupply.criteria;

import com.javasm.salesupply.criteria.base.BaseQueryCriteria;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

/**
 * @Author：wanqi
 * @Version：1.0
 * @Date：2021/7/15-15:29
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
public class SaReturnedCriteria extends BaseQueryCriteria {
//    订单编号")
    private Integer orderId;
//   收货人名称")
    private String deliveryUsername;
//    @ApiModelProperty(value = "收货人地址")
    private String deliveryAddress;
    /**
     * 拒收原因
     */
    private String rejectCause;
//    @ApiModelProperty(value = "下单日期")
    private LocalDateTime orderTime;
    /**
     * 拒收时间
     */
    private LocalDateTime rejectTime;

    /**
     * 发货时间
     */
    private LocalDateTime deliverTime;

    /**
     * 签收时间
     */
    private LocalDateTime signfoTime;


//    @ApiModelProperty(value = "订单类型（1电话订单，2网络订单，3其它）")
    private String orderType;
//    @ApiModelProperty(value = "支付方式（货到付款，款到发货）")
    private String orderPayment;
//    @ApiModelProperty(value = "业务类型（1普通业务，2号卡套餐）")
    private String orderBusinesstype;
//    @ApiModelProperty(value = "订单动作（1订购、2换购、3支付）")
    private String orderAction;
//    @ApiModelProperty(value = "订单状态（审核通过，已付款，已出库，已发货，已到货，已归档）")
    private String orderStatus;
    //开始时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime startTime2;
    //结束时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime endTime2;
    //开始时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime startTime3;
    //结束时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime endTime3;
    //开始时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime startTime4;
    //结束时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime endTime4;
}
