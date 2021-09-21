package com.javasm.salesupply.domain.criteria;

import com.javasm.salesupply.domain.criteria.base.BaseQueryCriteria;
import lombok.Data;

/**
 * @Author：huangwei
 * @Version：1.0
 * @Date：2021/7/16-10:10
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
public class AftersaleInstoreCriteria extends BaseQueryCriteria {

    private Integer orderid;//订单编号
    private Integer outorderid;//出库单编号
    private Integer orderType;//订单类型
    private Integer stutas;//入库单状态
}
