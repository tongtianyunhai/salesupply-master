package com.javasm.salesupply.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author chy
 * @since 2021-07-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="GtAdjust对象", description="")
public class GtAdjust implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "adjust_id", type = IdType.AUTO)
    private Integer adjustId;

    @ApiModelProperty(value = "商品id")
    private Integer adjustGoodid;

    @ApiModelProperty(value = "百分比,绝对值")
    private Integer adjustMkAdjustpricetype;

    @ApiModelProperty(value = "调价的数字")
    private Double adjustMkAdjustnum;

    @ApiModelProperty(value = "市场促销价")
    private Double adjustMkProprice;

    @ApiModelProperty(value = "百分比,绝对值")
    private Integer adjustShopAdjustpricetype;

    @ApiModelProperty(value = "调价的数字")
    private Double adjustShopAdjustnum;

    @ApiModelProperty(value = "市场促销价")
    private Double adjustShopProprice;

    @ApiModelProperty(value = "开始时间")
    private LocalDateTime startTime;

    @ApiModelProperty(value = "结束时间")
    private LocalDateTime endTime;

    @ApiModelProperty(value = "调价原因")
    private String reason;

    @ApiModelProperty(value = "备注")
    @TableField("COMMENT")
    private String comment;

    @ApiModelProperty(value = "审批表id")
    private Integer adjustApprovaid;

    @ApiModelProperty(value = "创建者")
    private Integer createBy;

    @ApiModelProperty(value = "更新者")
    private String updateBy;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "预留字段1")
    private String remark1;

    @ApiModelProperty(value = "预留字段2")
    private String remark2;


}
