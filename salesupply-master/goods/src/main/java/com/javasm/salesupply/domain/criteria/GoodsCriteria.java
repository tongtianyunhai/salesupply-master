package com.javasm.salesupply.domain.criteria;

import com.javasm.salesupply.domain.criteria.base.BaseQueryCriteria;
import lombok.Data;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/7/15-14:58
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
public class GoodsCriteria extends BaseQueryCriteria {

    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 产品编码（存货档案编码）
     */
    private String goodsEncode;
    /**
     * 品牌
     */
    private String goodsBrand;
    /**
     * 型号
     */
    private String goodsType;
    /**
     * 颜色
     */
    private String goodsColor;
    /**
     * 分类
     */
    private String goodsClassify;
}