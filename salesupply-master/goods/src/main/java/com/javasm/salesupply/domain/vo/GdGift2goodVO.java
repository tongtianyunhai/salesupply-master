package com.javasm.salesupply.domain.vo;

import lombok.Data;

/**
 * @author ：ydw
 * @date ：Created in 2021/7/15 15:34
 */

/**
 *  显示所有数据在 table 中所用的vo
 */
@Data
public class    GdGift2goodVO {

    /**
     * 预留字段1
     */
    private Integer remark1;
    /**
     * 赠品名称
     */
    private String giftName;
    /**
     * 赠品类型
     */
    private String giftClassify;
    /**
     * 赠品品牌
     */
    private String giftBrand;
    /**
     * 入库数量
     */
    private String giftSwitchPutwarehouse;
    /**
     * 调整后的价格
     */
    private String giftSwichTyprice;
    /**
     * 审核状态 0-未审核 1-已审核 2-未通过
     */
    private Integer approvalStatus;
}
