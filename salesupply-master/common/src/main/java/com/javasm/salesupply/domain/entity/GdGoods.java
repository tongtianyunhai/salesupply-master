package com.javasm.salesupply.domain.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (GdGoods)实体类
 *
 * @author makejava
 * @since 2021-07-14 17:12:58
 */
public class GdGoods implements Serializable {
    private static final long serialVersionUID = 782933202123397497L;
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
    * 分类
    */
    private String goodsCategory;
    /**
    * 型号  ALFA D81
    */
    private String goodsModel;
    /**
    * 品牌
    */
    private String goodsBrand;
    /**
    * 颜色
    */
    private String goodsColor;
    /**
    * 分类
    */
    private String goodsClassify;
    /**
    * 采购模式
    */
    private String goodsBuytype;
    /**
    * 铺货 1-铺货 0-非铺货
    */
    private String goodsDistribution;
    /**
    * 备机 1-备机 0-非备机
    */
    private String goodsStandby;
    /**
    * 市场价
    */
    private String goodsMarketprice;
    /**
    * 商场价
    */
    private String goodsShoprice;
    /**
    * 型号 1X手机-翻盖
    */
    private String goodsType;
    /**
    * 最低库存量
    */
    private Integer goodsLowstock;
    /**
    * 是否可采购 1-可采购 0-不可采购
    */
    private Integer goodsIsbuy;
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


    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsEncode() {
        return goodsEncode;
    }

    public void setGoodsEncode(String goodsEncode) {
        this.goodsEncode = goodsEncode;
    }

    public String getGoodsCategory() {
        return goodsCategory;
    }

    public void setGoodsCategory(String goodsCategory) {
        this.goodsCategory = goodsCategory;
    }

    public String getGoodsModel() {
        return goodsModel;
    }

    public void setGoodsModel(String goodsModel) {
        this.goodsModel = goodsModel;
    }

    public String getGoodsBrand() {
        return goodsBrand;
    }

    public void setGoodsBrand(String goodsBrand) {
        this.goodsBrand = goodsBrand;
    }

    public String getGoodsColor() {
        return goodsColor;
    }

    public void setGoodsColor(String goodsColor) {
        this.goodsColor = goodsColor;
    }

    public String getGoodsClassify() {
        return goodsClassify;
    }

    public void setGoodsClassify(String goodsClassify) {
        this.goodsClassify = goodsClassify;
    }

    public String getGoodsBuytype() {
        return goodsBuytype;
    }

    public void setGoodsBuytype(String goodsBuytype) {
        this.goodsBuytype = goodsBuytype;
    }

    public String getGoodsDistribution() {
        return goodsDistribution;
    }

    public void setGoodsDistribution(String goodsDistribution) {
        this.goodsDistribution = goodsDistribution;
    }

    public String getGoodsStandby() {
        return goodsStandby;
    }

    public void setGoodsStandby(String goodsStandby) {
        this.goodsStandby = goodsStandby;
    }

    public String getGoodsMarketprice() {
        return goodsMarketprice;
    }

    public void setGoodsMarketprice(String goodsMarketprice) {
        this.goodsMarketprice = goodsMarketprice;
    }

    public String getGoodsShoprice() {
        return goodsShoprice;
    }

    public void setGoodsShoprice(String goodsShoprice) {
        this.goodsShoprice = goodsShoprice;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public Integer getGoodsLowstock() {
        return goodsLowstock;
    }

    public void setGoodsLowstock(Integer goodsLowstock) {
        this.goodsLowstock = goodsLowstock;
    }

    public Integer getGoodsIsbuy() {
        return goodsIsbuy;
    }

    public void setGoodsIsbuy(Integer goodsIsbuy) {
        this.goodsIsbuy = goodsIsbuy;
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