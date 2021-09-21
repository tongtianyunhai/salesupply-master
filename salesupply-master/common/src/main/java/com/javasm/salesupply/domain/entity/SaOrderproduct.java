package com.javasm.salesupply.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
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
@ApiModel(value="SaOrderproduct对象", description="")
public class SaOrderproduct implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "订单商品信息表编号")
    private Integer id;

    @ApiModelProperty(value = "订单编号")
    private Integer orderId;

    @ApiModelProperty(value = "商品编号")
    private Integer productId;

    @ApiModelProperty(value = "商品名称")
    private String productName;

    private BigDecimal productPrice;

    @ApiModelProperty(value = "数量")
    private Integer orderNumber;

    @ApiModelProperty(value = "总金额")
    private BigDecimal orderMoney;

    @ApiModelProperty(value = "供应商名称")
    private String orderSupplierName;

    @ApiModelProperty(value = "供应商id")
    private Integer orderSupplierId;

    @ApiModelProperty(value = "商品串码")
    private Integer orderImei;

    private Integer remark1;

    private Integer remark2;

    @ApiModelProperty(value = "商品厂商名")
    private String orderFactoryname;

    @ApiModelProperty(value = "商品厂商id")
    private String orderFatoryid;


    @ApiModelProperty(value = "商品颜色")
    private String  orderGoodscolor;

    @ApiModelProperty(value = "商品品牌")
    private String  orderGoodsbrand;

    @ApiModelProperty(value = "商品类型")
    private String  orderGoodstype;


    @ApiModelProperty(value = "制单人")
    private String  orderCreateBy;

    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value = "制单日期")
    private LocalDateTime orderCreateTime;


    @ApiModelProperty(value = "修改人")
    private Integer  orderUpdateBy;

    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value = "更新日期")
    private LocalDateTime orderUpdateTime;


}
