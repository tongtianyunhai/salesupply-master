package com.javasm.salesupply.domain.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @Author：戈李阳
 * @Version：1.0
 * @Date：2021/7/16-19:40
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="GoodsInfoVo对象", description="商品信息表")

public class GoodsInfoVo  implements Serializable {
    private static final long serialVersionUID = 236298452945717294L;

    private Integer imeiNumber;

    private String goodsEncode;

    private String goodsName;

    private String goodsModel;

    private String goodsColor;

    private Integer goodsLowstock;

    private String goodsShoprice;

}
