package com.javasm.salesupply.domain.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.io.Serializable;

/**
 * (GtPromote)实体类
 *
 * @author makejava
 * @since 2021-07-12 15:41:09
 */
@Data
public class GtPromote implements Serializable {
    private static final long serialVersionUID = 143917637546109563L;

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
    * 促销商品id
    */
    private Integer promoteGoodid;
    /**
    * 百分比,绝对值
    */
    private Integer promoteMkAdjustpricetype;
    /**
    * 调价的数字
    */
    private String promoteMkAdjustnum;
    /**
    * 市场促销价
    */
    private String promoteMkProprice;
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
    * 促销数量
    */
    private String remark1;
    /**
    * 预留字段2
    */
    private String remark2;


}