package com.javasm.salesupply.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 返厂出库表
 * </p>
 *
 * @author javasm
 * @since 2021-07-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SpOutwarehouse对象", description="返厂出库表")
public class SpOutwarehouse implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "申请单编号")
    @TableId(value = "sp_applicationId", type = IdType.AUTO)
    private Integer spApplicationid;

    @ApiModelProperty(value = "申请类型（返厂出库 4）")
    private Integer spHandletype;

    @ApiModelProperty(value = "制单人")
    private String spCreateBy;

    @ApiModelProperty(value = "制单日期")
    private LocalDate spCreatTime;

    @ApiModelProperty(value = "制单部门")
    private String spCreatedepartment;

    @ApiModelProperty(value = "返厂商品编码")
    private String spGoodsid;

    @ApiModelProperty(value = "商品名称")
    private String spGoodsname;

    @ApiModelProperty(value = "返厂商品串码")
    private String spGoodsimei;

    @ApiModelProperty(value = "返厂商品型号")
    private String spGoodstype;

    @ApiModelProperty(value = "返厂商品颜色")
    private String spGoodscolor;

    @ApiModelProperty(value = "销售订单号")
    private String spSellsid;

    @ApiModelProperty(value = "返厂供货商编码")
    private String spFactoryid;

    @ApiModelProperty(value = "返厂供货商名称")
    private String spFactoryname;

    @ApiModelProperty(value = "返厂配置")
    private String spConfig;

    @ApiModelProperty(value = "返厂原因")
    private String spCauses;

    @ApiModelProperty(value = "返厂地点")
    private String spSites;

    @ApiModelProperty(value = "返厂出库状态 已出库:1 未出库:0） ")
    private Integer spOutstatus;

    @ApiModelProperty(value = "返厂出库单号")
    private String spOutorderid;

    @ApiModelProperty(value = "外观状态")
    private Integer spOutlookstatus;

    @ApiModelProperty(value = "审批人")
    private String spChecker;

    @ApiModelProperty(value = "审批意见")
    private String spCheckcomment;

    @ApiModelProperty(value = "审批状态")
    private Integer spCheckstatus;

    @ApiModelProperty(value = "审批时间")
    private LocalDate spCheckdate;

    @ApiModelProperty(value = "单据状态")
    private Integer spOrderstatus;

    @ApiModelProperty(value = "备注")
    private String spAddition;

    @ApiModelProperty(value = "预留字段1")
    private String spRemark1;

    @ApiModelProperty(value = "预留字段2")
    private String spRemark2;

    @ApiModelProperty(value = "预留字段3")
    private String spRemark3;

    @ApiModelProperty(value = "预留字段4")
    private String spRemark4;

    @ApiModelProperty(value = "修改人")
    private Integer spUpdateBy;

    @ApiModelProperty(value = "修改日期")
    private LocalDate spUpdateTime;


}
