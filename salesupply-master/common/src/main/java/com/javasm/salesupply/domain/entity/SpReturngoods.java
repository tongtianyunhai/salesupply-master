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
 * 退货申请表
 * </p>
 *
 * @author javasm
 * @since 2021-07-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SpReturngoods对象", description="退货申请表")
public class SpReturngoods implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "退货申请单编号")
    @TableId(value = "sp_orderid", type = IdType.AUTO)
    private Integer spOrderid;

    @ApiModelProperty(value = "销售订单编号")
    private String spSellsid;



    @ApiModelProperty(value = "申请工单号")
    private String spApplicationid;

    @ApiModelProperty(value = "制单人")
    private String spCreateBy;

    @ApiModelProperty(value = "制单日期")
    private LocalDate spCreateDate;

    @ApiModelProperty(value = "制单部门")
    private Integer spOrderdepartment;

    @ApiModelProperty(value = "退换货类型（退货:2）")
    private Integer spHandletype;

    @ApiModelProperty(value = "商品编码")
    private String spGoodsid;

    @ApiModelProperty(value = "商品名称")
    private String spGoodsname;

    @ApiModelProperty(value = "商品串码")
    private String spGoodsiemi;

    @ApiModelProperty(value = "商品型号")
    private String spGoodstype;

    @ApiModelProperty(value = "商品颜色")
    private String spGoodscolor;

    @ApiModelProperty(value = "商品价格")
    private String spGoodsprice;

    @ApiModelProperty(value = "商品成本")
    private String spGoodscost;

    @ApiModelProperty(value = "售后换货入库状态 入库：1  未入库：0 ")
    private Integer spMaintenancestatus;

    @ApiModelProperty(value = "售后换货入库单号")
    private String spMaintenanceid;

    @ApiModelProperty(value = "退货原因")
    private String spCauses;

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
