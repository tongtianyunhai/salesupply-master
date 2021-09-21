package com.javasm.salesupply.domain.criteria;

import com.javasm.salesupply.domain.criteria.base.BaseQueryCriteria;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @Author：戈李阳
 * @Version：1.0
 * @Date：2021/7/14-15:00
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
public class SpReturngoodsCriteria extends BaseQueryCriteria {
    private String spOrderid;

    private String spGoodscost;//商品成本

    private String spCauses;//退货原因

    private Integer spOrderdepartment;//制单部门

    private String spCreateBy;//制单人

    private LocalDate spCreateDate;//制单日期

    private String spAddtion;//备注

    private String spApplicationid;//申请人工单号

    private Integer spMaintenancestatus;//售后服务状态

    private String spMaintenanceid;//售后订单编号

    private Integer spOrderstatus;//订单状态

    private Integer spHandletype;//退换货类型

    private Integer orderId;//销售订单编号

    private Integer productId;//商品编码

    private String productName;//商品名

    private BigDecimal productPrice;//商品单价

    private Integer orderImei;//商品串码

    private String  orderGoodscolor;//商品颜色

    private String orderGoodstype;//商品类型




}
