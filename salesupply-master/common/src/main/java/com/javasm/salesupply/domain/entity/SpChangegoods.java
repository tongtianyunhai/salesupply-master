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
 * 换货申请表
 * </p>
 *
 * @author javasm
 * @since 2021-07-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SpChangegoods对象", description="换货申请表")
public class SpChangegoods implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "换货申请单编号")
    @TableId(value = "sp_orderid", type = IdType.AUTO)
    private Integer spOrderid;

    @ApiModelProperty(value = "销售订单编号")
    private String spSalesid;

    @ApiModelProperty(value = "投诉工单号")
    private String spComplaintsid;

    @ApiModelProperty(value = "制单人")
    private String spCreateBy;

    @ApiModelProperty(value = "制单日期")
    private LocalDate spCreateDate;

    @ApiModelProperty(value = "制单部门")
    private Integer spOrderdepartment;

    @ApiModelProperty(value = "退换货类型（换货 1）")
    private Integer spHandletype;

    @ApiModelProperty(value = "原商品编码")
    private String spGoodsid;

    @ApiModelProperty(value = "商品名称")
    private String spGoodsname;

    @ApiModelProperty(value = "原商品串码")
    private String spGoodsiemi;

    @ApiModelProperty(value = "原商品型号")
    private String spGoodstype;

    @ApiModelProperty(value = "原商品颜色 ")
    private String spGoodscolor;

    @ApiModelProperty(value = "原供货商编码")
    private String spFactoryid;

    @ApiModelProperty(value = "原供货商名称")
    private String spFactoryname;

    @ApiModelProperty(value = "新商品编码")
    private String spNewgoodsid;

    @ApiModelProperty(value = "新商品名称")
    private String spNewgoodsname;

    @ApiModelProperty(value = "新商品串码")
    private String spNewgoodsiemi;

    @ApiModelProperty(value = "新商品型号")
    private String spNewgoodstype;

    @ApiModelProperty(value = "新商品颜色")
    private String spNewgoodscolor;

    @ApiModelProperty(value = "新供货商编码")
    private String spNewfactoryid;

    @ApiModelProperty(value = "新供货商名称")
    private String spNewfactoryname;

    @ApiModelProperty(value = "售后换货入库状态 已入库：1 未入库：0")
    private Integer spMaintenancestatus;

    @ApiModelProperty(value = "售后换货入库单号")
    private String spMaintenanceid;

    @ApiModelProperty(value = "审批人")
    private String spChecker;

    @ApiModelProperty(value = "审批意见")
    private String spCheckcomment;

    @ApiModelProperty(value = "审批状态[初始:1 审批通过:2  不通过:3]")
    private Integer spCheckstatus;

    @ApiModelProperty(value = "单据状态[有效:1 无效:0] ")
    private Integer spOrderstatus;

    @ApiModelProperty(value = "备注")
    private String spAddtion;

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
