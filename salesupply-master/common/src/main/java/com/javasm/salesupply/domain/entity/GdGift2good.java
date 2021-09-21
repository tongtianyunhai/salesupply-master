package com.javasm.salesupply.domain.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (GdGift2good)实体类
 *
 * @author makejava
 * @since 2021-07-12 15:41:09
 */
public class GdGift2good implements Serializable{
    private static final long serialVersionUID = 425454605797610311L;
    
    private Integer giftId;
    /**
    * 入库数量
    */
    private String giftSwitchPutwarehouse;
    /**
    * 调整后的价格
    */
    private String giftSwichTyprice;
    /**
    * 审核表id
    */
    private Integer giftApprovaid;
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
    * 预留字段1
    */
    private Integer remark1;
    /**
    * 预留字段2
    */
    private String remark2;


    public Integer getGiftId() {
        return giftId;
    }

    public void setGiftId(Integer giftId) {
        this.giftId = giftId;
    }

    public String getGiftSwitchPutwarehouse() {
        return giftSwitchPutwarehouse;
    }

    public void setGiftSwitchPutwarehouse(String giftSwitchPutwarehouse) {
        this.giftSwitchPutwarehouse = giftSwitchPutwarehouse;
    }

    public Integer getGiftApprovaid() {
        return giftApprovaid;
    }

    public void setGiftApprovaid(Integer giftApprovaid) {
        this.giftApprovaid = giftApprovaid;
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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getGiftSwichTyprice() {
        return giftSwichTyprice;
    }

    public void setGiftSwichTyprice(String giftSwichTyprice) {
        this.giftSwichTyprice = giftSwichTyprice;
    }

    public Integer getRemark1() {
        return remark1;
    }

    public void setRemark1(Integer remark1) {
        this.remark1 = remark1;
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }

}