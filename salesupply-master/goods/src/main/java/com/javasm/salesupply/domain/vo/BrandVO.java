package com.javasm.salesupply.domain.vo;

import com.javasm.salesupply.domain.vo.base.BaseVo;
import lombok.Data;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/7/12-22:06
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
public class BrandVO extends BaseVo {


    /**
     * id
     */
    private Integer brandId;
    /**
     * 品牌名
     */
    private String brandName;

    /**
     * 网址
     */
    private String brandUrl;
    /**
     * 品牌描述
     */
    private String brandDes;
}