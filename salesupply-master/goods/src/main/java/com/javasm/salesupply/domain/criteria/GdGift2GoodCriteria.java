package com.javasm.salesupply.domain.criteria;

import com.javasm.salesupply.domain.criteria.base.BaseQueryCriteria;

/**
 * @author ：ydw
 * @date ：Created in 2021/7/15 15:12
 */
public class GdGift2GoodCriteria extends BaseQueryCriteria {

    /**
     * 赠品名称
     */
    private String giftName;
    /**
     * 赠品类型
     */
    private String giftClassify;
    /**
     * 赠品颜色
     */
    private String giftColor;
    /**
     * 赠品品牌
     */
    private String giftBrand;
    /**
     * 审核状态 0-未审核 1-已审核 2-未通过
     */
    private Integer approvalStatus;

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
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

    public String getGiftBrand() {
        return giftBrand;
    }

    public void setGiftBrand(String giftBrand) {
        this.giftBrand = giftBrand;
    }

    public Integer getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
    }
}
