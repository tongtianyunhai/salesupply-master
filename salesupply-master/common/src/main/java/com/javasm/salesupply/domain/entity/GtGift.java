package com.javasm.salesupply.domain.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (GtGift)实体类
 *
 * @author makejava
 * @since 2021-07-12 22:06:22
 */
public class GtGift implements Serializable {
    private static final long serialVersionUID = -29231696034230553L;
    /**
     * 赠品ID
     */
    private Integer giftId;
    /**
    * 赠品名称
    */
    private String giftName;
    /**
    * 赠品型号 
    */
    private String giftModel;
    /**
    * 赠品类型
    */
    private String giftClassify;
    /**
    * 最低库存量
    */
    private Integer giftLowstock;
    /**
    * 赠品单价
    */
    private Integer giftPrice;
    /**
    * 赠品成本
    */
    private Integer giftCost;
    /**
    * 赠品状态 1-有效  0-无效 
    */
    private Integer giftStatus;
    /**
    * 赠品品牌
    */
    private String giftBrand;
    /**
    * 赠品颜色
    */
    private String giftColor;
    /**
    * 采购部门
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
    private String remark1;
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

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public String getGiftModel() {
        return giftModel;
    }

    public void setGiftModel(String giftModel) {
        this.giftModel = giftModel;
    }

    public String getGiftClassify() {
        return giftClassify;
    }

    public void setGiftClassify(String giftClassify) {
        this.giftClassify = giftClassify;
    }

    public Integer getGiftLowstock() {
        return giftLowstock;
    }

    public void setGiftLowstock(Integer giftLowstock) {
        this.giftLowstock = giftLowstock;
    }

    public Integer getGiftPrice() {
        return giftPrice;
    }

    public void setGiftPrice(Integer giftPrice) {
        this.giftPrice = giftPrice;
    }

    public Integer getGiftCost() {
        return giftCost;
    }

    public void setGiftCost(Integer giftCost) {
        this.giftCost = giftCost;
    }

    public Integer getGiftStatus() {
        return giftStatus;
    }

    public void setGiftStatus(Integer giftStatus) {
        this.giftStatus = giftStatus;
    }

    public String getGiftBrand() {
        return giftBrand;
    }

    public void setGiftBrand(String giftBrand) {
        this.giftBrand = giftBrand;
    }

    public String getGiftColor() {
        return giftColor;
    }

    public void setGiftColor(String giftColor) {
        this.giftColor = giftColor;
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