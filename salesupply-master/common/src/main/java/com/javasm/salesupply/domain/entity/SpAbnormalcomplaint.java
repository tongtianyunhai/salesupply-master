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
 * 特殊申诉表
 * </p>
 *
 * @author javasm
 * @since 2021-07-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SpAbnormalcomplaint对象", description="特殊申诉表")
public class SpAbnormalcomplaint implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "特殊申诉单编号")
    @TableId(value = "sp_orderid", type = IdType.AUTO)
    private Integer spOrderid;

    @ApiModelProperty(value = "方案名称")
    private String spCasename;

    @ApiModelProperty(value = "方案关键字")
    private String spKeyword;

    @ApiModelProperty(value = "方案创建人")
    private String spCreateBy;

    @ApiModelProperty(value = "创建日期")
    private LocalDate spCreateTime;

    @ApiModelProperty(value = "审批人")
    private String spChecker;

    @ApiModelProperty(value = "审批时间 更新审批状态的时间")
    private LocalDate spCheckeTime;

    @ApiModelProperty(value = "审核时间 开始查看方案的时间")
    private LocalDate spViewTime;

    @ApiModelProperty(value = "审批状态 审核通过:1 审核未通过：2 待审查：3")
    private Integer spCheckstatus;

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

    @ApiModelProperty(value = "备注")
    private String spAddtion;


}
