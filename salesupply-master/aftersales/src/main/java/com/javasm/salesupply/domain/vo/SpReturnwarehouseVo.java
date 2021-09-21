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
 * @Date：2021/7/14-17:05
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SpReturnwarehouseVo对象", description="返厂入库表")
public class SpReturnwarehouseVo extends BaseVo {

    @ApiModelProperty(value = "申请单编号")
    @TableId(value = "sp_orderid", type = IdType.AUTO)
    private Integer spOrderid;

    private Integer spHandletype;

    @ApiModelProperty(value = "返厂商品串码")
    private String spGoodsimei;

    @ApiModelProperty(value = "返厂原因")
    private String spCauses;

    @ApiModelProperty(value = "返厂入库标志 已入库:1 未入库:0） ")
    private Integer spInstatus;

    @ApiModelProperty(value = "制单人")
    private String spCreateBy;

    @ApiModelProperty(value = "制单日期")
    private LocalDate spCreateTime;

    @ApiModelProperty(value = "制单部门")
    private String spCreatedepartment;

    @ApiModelProperty(value = "审批人")
    private String spChecker;

    @ApiModelProperty(value = "审批意见")
    private String spCheckcomment;

    @ApiModelProperty(value = "审批状态")
    private Integer spCheckstatus;
}
