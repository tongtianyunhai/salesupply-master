package com.javasm.salesupply.domain.criteria;

import com.javasm.salesupply.domain.criteria.base.BaseQueryCriteria;
import lombok.Data;

import java.time.LocalDate;

/**
 * @Author：戈李阳
 * @Version：1.0
 * @Date：2021/7/14-15:37
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
public class SpChangegoodsCriteria extends BaseQueryCriteria {
    private String spOrderid;

    private Integer orderId;//销售单号

    private Integer spNewgoodsiemi;//现商品串码

    private String spNewgoodsid;//现商品编码

    private String spNewgoodsname;//现商品名称

    private String spNewgoodstype;//现商品型号

    private String spNewgoodscolor;//现商品颜色


    private String goodsName;


    private Integer orderImei;//原商品串码

    private String  orderGoodscolor;//原商品颜色

    private String  orderGoodstype;//原商品型号

    private Integer productId;//原商品编码

    private String productName;//原商品名称


    private String spCreateBy;

    private LocalDate spCreateDate;

    private Integer spOrderdepartment;


    private Integer spHandletype;

    private String spMaintenanceid;

    private String spAddtion;

    private Integer spOrderstatus;

}
