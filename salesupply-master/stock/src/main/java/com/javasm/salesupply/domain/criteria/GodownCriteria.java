package com.javasm.salesupply.domain.criteria;

import com.javasm.salesupply.domain.criteria.base.BaseQueryCriteria;
import io.swagger.models.auth.In;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Author：huangwei
 * @Version：1.0
 * @Date：2021/7/14-15:15
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
public class GodownCriteria extends BaseQueryCriteria {

    private Integer orderid;//订单编号
    private Integer outorderid;//出库单编号
    private Integer orderType;//订单类型
    private Integer stutas;//入库单状态

    private String spChecker;//订单审批人
    private Integer spCheckstatus;//审批状态
    private Integer spHandletype;//订单类型

    private LocalDateTime spUpdateDate;//审批时间


    private Integer spOrderid;//售后订单编号,特殊申诉单编号，换货申请单编号，退货申请单编号，返厂入库申请单编号
    private Integer spComplaintsid;//普通申诉订单id

    private Integer spApplicationid;//返厂出库申请单编号
}
