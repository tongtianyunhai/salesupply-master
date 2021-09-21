package com.javasm.salesupply.domain.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author ：ydw
 * @date ：Created in 2021/7/16 21:48
 */

/**
 *   促销详情接收数据vo
 */
@Data
public class PromoteDetailVO {
    /**
     *  促销活动主键ID
     */
    private Integer promoteId;

    /**
     * 活动开始时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date promoteStartime;
    /**
     * 活动结束时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date promoteEndtime;
    /**
     * 活动名称
     */
    private String promoteName;
    /**
     * 促销类型 1-每日促销  2-连续促销
     */
    private String promoteType;

    /**
     * 商品ID
     */
    private Integer goodsId;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 最低库存量
     */
    private Integer goodsLowstock;
    /**
     * 促销数量
     */
    private String remark1;

//=============================================================================================
    /**
     * 市场价
     */
    private String goodsMarketprice;
    /**
     * 市场价 : 百分比,绝对值
     */
    private Integer promoteMkAdjustpricetype;
    /**
     * 调价的数字
     */
    private String promoteMkAdjustnum;
    /**
     * 市场促销价
     *
     */
    private String promoteMkProprice;

    //=============================================================================================
    /**
     * 商场价
     */
    private String goodsShoprice;
    /**
     * 百分比,绝对值
     */
    private Integer promoteShopAdjustpricetype;
    /**
     * 调价的数字
     */
    private String promoteShopAdjustnum;
    /**
     * 商场促销价
     */
    private String promoteShopProprice;
    //=============================================================================================


    /**
     * 希望价格生效时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date promotePricestartime;
    /**
     * 希望价格失效时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date promotePricendtime;

    /**
     * 活动情况或原因
     */
    private String promoteReason;
    /**
     * 活动策划文件夹
     */
    private String promoteFile;
    /**
     * 备注
     */
    private String promoteComment;
    /**
     * 审批 ID
     */
    private Integer promoteApprovaid;

    /**
     * 审批等级 0-普通审核,1-价格变化>20%审核,2-价格变化>50%审核
     */
    private Integer approvalLevel;


}
