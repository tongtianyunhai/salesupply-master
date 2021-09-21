package com.javasm.salesupply.domain.criteria;

import com.javasm.salesupply.domain.criteria.base.BaseQueryCriteria;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @Author：戈李阳
 * @Version：1.0
 * @Date：2021/7/14-17:09
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
public class SpReturnwarehouseCriteria extends BaseQueryCriteria {
    private String spOrderid;

    private String spCauses;//退货原因

    private Integer spOrderdepartment;//制单部门

    private String spCreateBy;//制单人

    private LocalDate spCreateTime;//制单日期

    private String spAddtion;//备注

    private Integer spOrderstatus;//返厂出库单状态状态

    private Integer spHandletype;//退换货类型

    private Integer spInstatus;//出库状态

    private Integer spOutlookstatus;//外观状态

    private String spSites;//返厂地点


    private Integer orderId;//销售订单编号

    private Integer productId;//商品编码

    private String productName;//商品名

    private Integer orderImei;//商品串码

    private String  orderGoodscolor;//商品颜色

    private String orderGoodstype;//商品类型
}
