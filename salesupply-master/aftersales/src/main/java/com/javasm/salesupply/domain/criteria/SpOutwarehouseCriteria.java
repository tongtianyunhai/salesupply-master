package com.javasm.salesupply.domain.criteria;

import com.javasm.salesupply.domain.criteria.base.BaseQueryCriteria;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @Author：戈李阳
 * @Version：1.0
 * @Date：2021/7/14-16:54
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
public class SpOutwarehouseCriteria  extends BaseQueryCriteria {
    private String spApplicationid;


    private String spCauses;//退货原因

    private Integer spOrderdepartment;//制单部门

    private String spCreateBy;//制单人

    private LocalDate spCreateDate;//制单日期

    private String spAddtion;//备注

    private Integer spOrderstatus;//返厂出库单状态状态

    private Integer spHandletype;//退换货类型

    private Integer spOutstatus;//出库状态

    private Integer spOutlookstatus;//外观状态

    private String spSites;//返厂地点


    private Integer orderId;//销售订单编号

    private Integer productId;//商品编码

    private String productName;//商品名

    private Integer orderImei;//商品串码

    private String  orderGoodscolor;//商品颜色

    private String orderGoodstype;//商品类型


}
