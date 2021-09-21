package com.javasm.salesupply.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;


import java.time.LocalDateTime;


/**
 * <p>
 * 
 * </p>
 *
 * @author javasm
 * @since 2021-07-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SaReturned对象", description="")
public class SaReturned implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "returned_Id", type =IdType.AUTO)
    @ApiModelProperty(value = "退货单编号")
    private Integer returnedId;

    @ApiModelProperty(value = "订单编号")
    private Integer orderId;

    @ApiModelProperty(value = "订单分类B2C")
    private String orderClassify;

    @ApiModelProperty(value = "订单类型（1电话订单，2网络订单，3其它）")
    private String orderType;

    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value = "下单日期")
    private LocalDateTime orderTime;

    @ApiModelProperty(value = "订单动作（1订购、2换购、3支付）")
    private String orderAction;

    @ApiModelProperty(value = "业务类型（1普通业务，2号卡套餐）")
    private String orderBusinesstype;

    @ApiModelProperty(value = "商品编号")
    private Integer productId;

    @ApiModelProperty(value = "商品名称")
    private String productName;

    private BigDecimal productPrice;

    @ApiModelProperty(value = "数量")
    private Integer orderNumber;

    @ApiModelProperty(value = "总金额")
    private BigDecimal orderMoney;

    @ApiModelProperty(value = "订单状态（审核通过，已付款，已出库，已发货，已到货，已归档）")
    private String orderStatus;

    @ApiModelProperty(value = "会员帐号")
    private Integer userId;

    @ApiModelProperty(value = "配送方式（ems，其它）")
    private String deliveryMode;

    @ApiModelProperty(value = "配送费用")
    private BigDecimal deliveryPrice;

    @ApiModelProperty(value = "配送地区")
    private String deliveryArea;

    @ApiModelProperty(value = "收货人名称")
    private String deliveryUsername;

    @ApiModelProperty(value = "邮政编码")
    private Integer deliveryMailcode;

    @ApiModelProperty(value = "收货人地址")
    private String deliveryAddress;

    @ApiModelProperty(value = "电子邮箱")
    private String userEmail;

    @ApiModelProperty(value = "联系手机")
    private Integer userPhone;

    @ApiModelProperty(value = "支付方式（货到付款，款到发货）")
    private String orderPayment;

    @ApiModelProperty(value = "自提时间")
    private LocalDateTime orderTothetime;

    @ApiModelProperty(value = "备注")
    private String orderRemarks;

    @ApiModelProperty(value = "是否付款")
    private String paymentIf;

    @ApiModelProperty(value = "是否退货")
    private String returnedIf;

    @ApiModelProperty(value = "汇款人")
    private String orderRemitter;

    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改人")
    private String updataUser;

    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updataTime;

    private Integer remark1;

    private Integer remark2;
    /**
     * 供应商名称
     */
    private String orderSupplierName;

    private String orderSupplierCode;

    private Integer orderImei;

    private String instoreStatus;

    /**
     * 拒收原因
     */
    private String rejectCause;

    /**
     * 拒收时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime rejectTime;

    /**
     * 发货时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime deliverTime;

    /**
     * 签收时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime signfoTime;
    /**
     * 物流单号
     */
    private Integer trackingNumber;
//    创建人
    private String createPerson;


}
