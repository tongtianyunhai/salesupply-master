package com.javasm.salesupply.vo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author：wanqi
 * @Version：1.0
 * @Date：2021/7/15-15:40
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
public class SaReturnedVo {
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
    /**
     * 物流单号
     */
    private Integer trackingNumber;
    //    创建人
    private String createPerson;
    //创建时间")
    private LocalDateTime createTime;
    private Integer returnedId;
    /**
     * 拒收原因
     */
    private String rejectCause;

    /**
     * 拒收时间
     */
    private LocalDateTime rejectTime;


}
