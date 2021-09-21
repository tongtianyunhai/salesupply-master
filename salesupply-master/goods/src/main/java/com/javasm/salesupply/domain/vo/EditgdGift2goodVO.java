package com.javasm.salesupply.domain.vo;

import com.javasm.salesupply.domain.entity.GdGift2good;
import com.javasm.salesupply.domain.entity.GtGift;
import lombok.Data;

/**
 * @author     ：ydw
 * @date       ：Created in 2021/7/15 20:50
 */
@Data
public class EditgdGift2goodVO{
    /**
     * 赠品ID
     */
    private Integer giftId;
    /**
     * 赠品名称
     */
    private String giftName;
    /**
     * 赠品类型
     */
    private String giftClassify;
    /**
     * 赠品型号
     */
    private String giftModel;
    /**
     * 赠品单价
     */
    private Integer giftPrice;
    /**
     * 赠品成本
     */
    private Integer giftCost;
    /**
     * 赠品品牌
     */
    private String giftBrand;
    /**
     * 赠品颜色
     */
    private String giftColor;
    /**
     * 最低库存量
     */
    private Integer giftLowstock;
    /**
     * 采购部门
     */
    private Integer createBy;
    /**
     * 预留字段1
     */
    private Integer remark1;

    /**
     * 入库数量
     */
    private String giftSwitchPutwarehouse;
    /**
     * 调整后的价格
     */
    private String giftSwichTyprice;

}
