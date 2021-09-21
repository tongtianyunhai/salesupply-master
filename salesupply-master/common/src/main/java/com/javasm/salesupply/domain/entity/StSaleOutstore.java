package com.javasm.salesupply.domain.entity;

import java.math.BigDecimal;
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
@ApiModel(value="StSaleOutstore对象", description="")
public class StSaleOutstore implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "销售出库单编号")
    private Integer id;

    @ApiModelProperty(value = "业务类型")
    private String businessType;

    @ApiModelProperty(value = "商品编号")
    private Integer productId;

    @ApiModelProperty(value = "商品品牌")
    private String productBrand;

    @ApiModelProperty(value = "商品型号")
    private Integer productModel;

    @ApiModelProperty(value = "出库数量")
    private Integer outstoreCount;

    @ApiModelProperty(value = "出库价格")
    private BigDecimal outstorePrice;

    @ApiModelProperty(value = "出库仓库")
    private String outstoreName;

    @ApiModelProperty(value = "订单类型")
    private String orderType;

    @ApiModelProperty(value = "订单流程日志")
    private String orderflowLog;

    @ApiModelProperty(value = "订单详情(需包含销售订单号)")
    private String orderDetails;

    @ApiModelProperty(value = "客服备注信息")
    private String serviceComment;

    @ApiModelProperty(value = "处理时间")
    private LocalDateTime processTime;

    @ApiModelProperty(value = "供货商信息(根据机型串码及仓库自动带出供应商信息)")
    private LocalDateTime supplierInformation;

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
