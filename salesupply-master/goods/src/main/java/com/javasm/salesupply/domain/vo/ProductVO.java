package com.javasm.salesupply.domain.vo;

import com.javasm.salesupply.domain.vo.base.BaseVo;
import lombok.Data;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/7/14-21:54
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
public class ProductVO extends BaseVo {

    private Integer productId;
    /**
     * 产品编码（存货档案编码）
     */
    private String productEncode;
    /**
     * 品牌
     */
    private String productBrand;

    /**
     * 品牌
     */
    private String brandName;
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
    /**
     * 分类
     */
    private String classifyName;
}