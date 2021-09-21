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
@ApiModel(value="StAftersaleOutstore对象", description="")
public class StAftersaleOutstore implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "售后出库单编号")
    private Integer id;

    @ApiModelProperty(value = "售后类型")
    private String aftersaleType;

    @ApiModelProperty(value = "售后销售订单信息")
    private String aftersaleOrderInfo;

    @ApiModelProperty(value = "售后商品编号")
    private Integer aftersaleProductId;

    @ApiModelProperty(value = "售后品牌")
    private String aftersaleBrand;

    @ApiModelProperty(value = "售后型号")
    private String aftersaleMobileModel;

    @ApiModelProperty(value = "售后商品名称")
    private String aftersaleProductName;

    @ApiModelProperty(value = "申请人")
    private String proposer;

    @ApiModelProperty(value = "申请时间")
    private LocalDateTime mobileModel;

    @ApiModelProperty(value = "售后串码信息")
    private String aftersaleNo;

    @ApiModelProperty(value = "制单人")
    private String preparedBy;

    @ApiModelProperty(value = "操作时间")
    private LocalDateTime operationTime;

    @ApiModelProperty(value = "售后数量")
    private String aftersaleCount;

    @ApiModelProperty(value = "供货商信息")
    private String supplierInformation;

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
