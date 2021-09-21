package com.javasm.salesupply.domain.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.io.Serializable;

/**
 * (PromoteApproval)实体类
 *
 * @author makejava
 * @since 2021-07-16 11:12:35
 */
@Data
public class PromoteApproval implements Serializable {
    private static final long serialVersionUID = -39654313780946045L;
    /**
    * 审批表ID
    */
    private Integer approvalId;
    /**
    * 审批人id
    */
    private Integer approvalUserId;
    /**
    * 审批人姓名
    */
    private String approvalUserName;

    /**
     *  审批时间
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
    /**
    * 创建者
    */
    private Integer createBy;
    /**
    * 更新者
    */
    private String updateBy;
    /**
    * 创建时间
    */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    /**
    * 更新时间
    */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    /**
    * 预留字段1
    */
    private String remark1;
    /**
    * 预留字段2
    */
    private String remark2;
    /**
    * 预留字段3
    */
    private String remark3;
    /**
    * 预留字段4
    */
    private String remark4;



}