package com.javasm.salesupply.service;

import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.criteria.OrderCriteria;
import com.javasm.salesupply.domain.entity.SaOrder;
import com.javasm.salesupply.service.base.BaseService;
import com.javasm.salesupply.vo.OrderVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wq
 * @since 2021-07-12
 */
public interface SaOrderService extends BaseService<SaOrder> {
    PageResult<OrderVo> searchPageByCriteria(OrderCriteria orderCriteria);
    PageResult<OrderVo> searchPageByCriteria2(OrderCriteria orderCriteria);
    PageResult<OrderVo> searchPageByCriteria3(OrderCriteria orderCriteria);
    PageResult<OrderVo> searchPageByCriteria4(OrderCriteria orderCriteria);
}
