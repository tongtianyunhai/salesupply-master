package com.javasm.salesupply.domain.vo;

import com.javasm.salesupply.domain.entity.GdGoods;
import lombok.Data;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/7/15-14:57
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
public class GoodsVO extends GdGoods {
    /**
     * 品牌
     */
    private String brandName;
    /**
     * 分类
     */
    private String classifyName;
}