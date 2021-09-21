package com.javasm.salesupply.domain.vo;

import com.javasm.salesupply.domain.vo.base.BaseVo;
import lombok.Data;

import java.util.Date;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/7/16-20:08
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
public class Good2giftVO extends BaseVo {
    /**
     * 商品Id
     */
    private Integer goodId;
    /**
     * 入库数量
     */
    private Integer goodInventoryQuantity;
    /**
     * 审批人id
     */
    private Integer approvalUserId;
    /**
     * 审批人姓名
     */
    private String approvalUserName;

    private Date approvalTime;
    /**
     * 审核状态  0-未审核 1-已审核 2-审核未通过
     */
    private Integer approvalStatus;
    /**
     * 审核评语
     */
    private String approvalComment;
    /**
     * 预留字段1 赠品状态 1-有效  0-无效
     */
    private String remark1;


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
    private String brandName;
    /**
     * 颜色
     */
    private String goodsColor;
    /**
     * 分类
     */
    private String goodsClassify;
    private String classifyName;

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

}