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
 * @Date：2021/7/14-16:50
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SpOutwarehouse对象", description="返厂出库表")
public class SpOutwarehouseVo extends BaseVo {

    @ApiModelProperty(value = "申请单编号")
    @TableId(value = "sp_applicationId", type = IdType.AUTO)
    private Integer spApplicationid;

    private Integer spHandletype;


    @ApiModelProperty(value = "返厂商品串码")
    private String spGoodsimei;

    @ApiModelProperty(value = "返厂原因")
    private String spCauses;

    @ApiModelProperty(value = "返厂出库标志 已出库:1 未出库:0） ")
    private Integer spOutstatus;

    @ApiModelProperty(value = "制单人")
    private String spCreateBy;

    @ApiModelProperty(value = "制单日期")
    private LocalDate spCreatTime;

    @ApiModelProperty(value = "制单部门")
    private String spCreatedepartment;


    @ApiModelProperty(value = "审批人")
    private String spChecker;

    @ApiModelProperty(value = "审批意见")
    private String spCheckcomment;

    @ApiModelProperty(value = "审批状态")
    private Integer spCheckstatus;
}
