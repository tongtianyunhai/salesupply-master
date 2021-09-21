package com.javasm.salesupply.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.criteria.SaOrderproductCriteria;
import com.javasm.salesupply.domain.entity.SaOrderproduct;
import com.javasm.salesupply.service.base.BaseService;
import com.javasm.salesupply.vo.SaOrderproductVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wq
 * @since 2021-07-12
 */
public interface SaOrderproductService extends BaseService<SaOrderproduct> {
    PageResult<SaOrderproductVo> searchPageByCriteria(SaOrderproductCriteria saOrderproductCriteria);
}
