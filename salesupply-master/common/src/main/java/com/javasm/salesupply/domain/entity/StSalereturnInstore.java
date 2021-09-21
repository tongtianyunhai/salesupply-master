package com.javasm.salesupply.domain.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
@ApiModel(value="StSalereturnInstore对象", description="")
public class StSalereturnInstore implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "入库单编号")
    private Integer id;

    @ApiModelProperty(value = "销售入库订单")
    private String aftersaleOrderId;

    @ApiModelProperty(value = "销售订单")
    private String aftersaleOrderinfo;

    @ApiModelProperty(value = "订单类型")
    private String orderType;

    @ApiModelProperty(value = "业务类型")
    private String businessType;

    @ApiModelProperty(value = "申请人")
    private String proposer;

    @ApiModelProperty(value = "申请人联系电话")
    private String proposerPhone;

    @ApiModelProperty(value = "申请人联系邮箱")
    private String proposerEmail;

    @ApiModelProperty(value = "申请时间")
    private LocalDateTime applyTime;

    @ApiModelProperty(value = "销售入库机型")
    private String moblieModel;

    @ApiModelProperty(value = "销售入库机型串号")
    private String mobileModelNo;

    @ApiModelProperty(value = "数量")
    private Integer count;

    @ApiModelProperty(value = "供货商")
    private String supplierInformation;

    @ApiModelProperty(value = "入库时间")
    private LocalDateTime instoreTime;

    @ApiModelProperty(value = "原发货运单号")
    private Integer waybil;

    @ApiModelProperty(value = "原用户订单号")
    private Integer customerOrderId;

    @ApiModelProperty(value = "顾客地址")
    private String customerAddress;

    @ApiModelProperty(value = "状态")
    private String status;

    @ApiModelProperty(value = "创建者")
    private Integer createBy;

    @ApiModelProperty(value = "更新者")
    private String updateBy;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "预留字段1")
    private Integer remark1;

    @ApiModelProperty(value = "预留字段2")
    private Integer remark2;


}
