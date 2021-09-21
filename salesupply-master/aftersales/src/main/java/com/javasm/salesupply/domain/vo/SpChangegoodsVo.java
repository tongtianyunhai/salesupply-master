package com.javasm.salesupply.domain.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.javasm.salesupply.domain.vo.base.BaseVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

/**
 * @Author：戈李阳
 * @Version：1.0
 * @Date：2021/7/14-15:32
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SpChangegoods对象", description="换货申请表")
public class SpChangegoodsVo extends BaseVo {
    @ApiModelProperty(value = "换货申请单编号")
    @TableId(value = "sp_orderid", type = IdType.AUTO)
    private Integer spOrderid;

    @ApiModelProperty(value = "销售订单编号")
    private String spSalesid;


    @ApiModelProperty(value = "制单人")
    private String spCreateBy;

    @ApiModelProperty(value = "制单日期")
    private LocalDate spCreateDate;

    @ApiModelProperty(value = "制单部门")
    private Integer spOrderdepartment;

    @ApiModelProperty(value = "退换货类型（换货 1）")
    private Integer spHandletype;

    @ApiModelProperty(value = "原商品串码")
    private String spGoodsiemi;

    @ApiModelProperty(value = "新商品串码")
    private String spNewgoodsiemi;

    @ApiModelProperty(value = "售后换货入库状态 已入库：1 未入库：0")
    private Integer spMaintenancestatus;

    @ApiModelProperty(value = "审批人")
    private String spChecker;

    @ApiModelProperty(value = "审批状态[初始:1 审批通过:2  不通过:3]")
    private Integer spCheckstatus;

}
