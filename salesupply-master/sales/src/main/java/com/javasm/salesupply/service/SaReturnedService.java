package com.javasm.salesupply.service;

import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.criteria.SaReturnedCriteria;
import com.javasm.salesupply.domain.entity.SaReturned;
import com.javasm.salesupply.service.base.BaseService;
import com.javasm.salesupply.vo.SaReturnedVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wq
 * @since 2021-07-12
 */
public interface SaReturnedService extends BaseService<SaReturned> {


    PageResult<SaReturnedVo> searchPageByCriteria(SaReturnedCriteria saReturnedCriteria);
}
