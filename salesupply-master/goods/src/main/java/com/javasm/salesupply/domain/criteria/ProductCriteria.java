package com.javasm.salesupply.domain.criteria;

import com.javasm.salesupply.domain.base.BaseQueryCriteria;
import lombok.Data;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/7/14-21:48
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
public class ProductCriteria extends BaseQueryCriteria {

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
     * 颜色
     */
    private String productColor;
    /**
     * 分类
     */
    private String productClassify;
}