package com.javasm.salesupply.domain.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (GdProduct)实体类
 *
 * @author makejava
 * @since 2021-07-12 15:41:09
 */
public class GdProduct implements Serializable {
    private static final long serialVersionUID = -65817965417922272L;
    
    private Integer productId;
    /**
    * 产品编码（存货档案编码）
    */
    private String productEncode;
    /**
    * 品牌
    */
    private String productBrand;
    /**
    * 型号
    */
    private String productType;
    /**
    * 业务模式
    */
    private String productBusinessmode;
    /**
    * 颜色
    */
    private String productColor;
    /**
    * 分类
    */
    private String productClassify;
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
    private String remark1;
    /**
    * 预留字段2
    */
    private String remark2;


    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductEncode() {
        return productEncode;
    }

    public void setProductEncode(String productEncode) {
        this.productEncode = productEncode;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductBusinessmode() {
        return productBusinessmode;
    }

    public void setProductBusinessmode(String productBusinessmode) {
        this.productBusinessmode = productBusinessmode;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public String getProductClassify() {
        return productClassify;
    }

    public void setProductClassify(String productClassify) {
        this.productClassify = productClassify;
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