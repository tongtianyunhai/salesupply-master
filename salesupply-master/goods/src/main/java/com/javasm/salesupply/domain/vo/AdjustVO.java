package com.javasm.salesupply.domain.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.javasm.salesupply.domain.vo.base.BaseVo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/7/17-17:39
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
public class AdjustVO extends BaseVo {
    /**
     * 商品管理
     */
    private Integer goodsId;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 存货档案编码
     */
    private String goodsEncode;
    /**
     * 最低库存量
     */
    private Integer goodsLowstock;
    /**
     * 市场价
     */
    private String goodsMarketprice;
    /**
     * 商场价
     */
    private String goodsShoprice;
    @ApiModelProperty(value = "市场促销价")
    private Double adjustMkProprice;
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

    /**
     * 审批人姓名
     */
    private String approvalUserName;

    /**
     * 审批时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date approvalTime;
    /**
     * 审核状态 0-未审核 1-已审核 2-未通过
     */
    private Integer approvalStatus;
    /**
     * 审核评语
     */
    private String approvalComment;
    /**
     * 审批等级 0-普通审核,1-价格变化>20%审核,2-价格变化>50%审核
     */
    private String approvalLevel;
}