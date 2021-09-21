package com.javasm.salesupply.domain.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (GdGood2gift)实体类
 *
 * @author makejava
 * @since 2021-07-15 23:30:04
 */
public class GdGood2gift implements Serializable {
    private static final long serialVersionUID = -52800085038077018L;
    
    private Integer id;
    /**
    * 商品Id
    */
    private Integer goodId;
    /**
    * 入库数量
    */
    private Integer goodInventoryQuantity;
    /**
    * 审批人id
    */
    private Integer approvalUserId;
    /**
    * 审批人姓名
    */
    private String approvalUserName;
    
    private Date approvalTime;
    /**
    * 审核状态  0-未审核 1-已审核 2-审核未通过
    */
    private Integer approvalStatus;
    /**
    * 审核评语
    */
    private String approvalComment;
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
    private Date createTime;
    /**
    * 更新时间
    */
    private Date updateTime;
    /**
    * 预留字段1 赠品状态 1-有效  0-无效
    */
    private String remark1;
    /**
    * 预留字段2
    */
    private String remark2;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public Integer getGoodInventoryQuantity() {
        return goodInventoryQuantity;
    }

    public void setGoodInventoryQuantity(Integer goodInventoryQuantity) {
        this.goodInventoryQuantity = goodInventoryQuantity;
    }

    public Integer getApprovalUserId() {
        return approvalUserId;
    }

    public void setApprovalUserId(Integer approvalUserId) {
        this.approvalUserId = approvalUserId;
    }

    public String getApprovalUserName() {
        return approvalUserName;
    }

    public void setApprovalUserName(String approvalUserName) {
        this.approvalUserName = approvalUserName;
    }

    public Date getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(Date approvalTime) {
        this.approvalTime = approvalTime;
    }

    public Integer getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getApprovalComment() {
        return approvalComment;
    }

    public void setApprovalComment(String approvalComment) {
        this.approvalComment = approvalComment;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }

}