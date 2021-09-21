package com.javasm.salesupply.domain.criteria;

import com.javasm.salesupply.domain.base.BaseQueryCriteria;

/**
 * @author ：ydw
 * @date ：Created in 2021/7/13 9:20
 */
public class GtGiftCriteria extends BaseQueryCriteria {
    /**
     * 赠品型号
     */
    private String giftModel;
    /**
     * 赠品名称
     */
    private String giftName;
    /**
     * 赠品品牌
     */
    private String giftBrand;
    /**
     * 赠品类型
     */
    private String giftClassify;
    /**
     * 赠品颜色
     */
    private String giftColor;

    public String getGiftModel() {
        return giftModel;
    }

    public void setGiftModel(String giftModel) {
        this.giftModel = giftModel;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public String getGiftBrand() {
        return giftBrand;
    }

    public void setGiftBrand(String giftBrand) {
        this.giftBrand = giftBrand;
    }

    public String getGiftClassify() {
        return giftClassify;
    }

    public void setGiftClassify(String giftClassify) {
        this.giftClassify = giftClassify;
    }

    public String getGiftColor() {
        return giftColor;
    }

    public void setGiftColor(String giftColor) {
        this.giftColor = giftColor;
    }
}
