package com.javasm.salesupply.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @Author：戈李阳
 * @Version：1.0
 * @Date：2021/7/14-22:31
 * @Since:jdk1.8
 * @Description:TODO
 */

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SaOrderproduct对象", description="")
public class SaOrderproductVo {


    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "订单商品信息表编号")
    private Integer id;

    @ApiModelProperty(value = "销售订单编号")
    private Integer orderId;

    @ApiModelProperty(value = "商品编号")
    private Integer productId;

    @ApiModelProperty(value = "商品名称")
    private String productName;

    @ApiModelProperty(value = "商品单价")
    private BigDecimal productPrice;


    @ApiModelProperty(value = "供应商名称")
    private String orderSupplierName;

    @ApiModelProperty(value = "供应商id")
    private Integer orderSupplierId;

    @ApiModelProperty(value = "商品串码")
    private Integer orderImei;

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


    @ApiModelProperty(value = "制单日期")
    private LocalDate orderCreateTime;


    @ApiModelProperty(value = "修改人")
    private Integer  orderUpdateBy;


    @ApiModelProperty(value = "更新日期")
    private LocalDate  orderUpdateTime;

}
