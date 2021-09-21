package com.javasm.salesupply.service;

import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.SpAbnormalcomplaintCriteria;
import com.javasm.salesupply.domain.criteria.SpOutwarehouseCriteria;
import com.javasm.salesupply.domain.criteria.SpReturnwarehouseCriteria;
import com.javasm.salesupply.domain.entity.SpReturnwarehouse;
import com.javasm.salesupply.domain.vo.SpAbnormalcomplaintVo;
import com.javasm.salesupply.domain.vo.SpReturnwarehouseVo;
import com.javasm.salesupply.service.base.BaseService;

/**
 * @Author：戈李阳
 * @Version：1.0
 * @Date：2021/7/12-19:06
 * @Since:jdk1.8
 * @Description:TODO
 */

public interface SpReturnwarehouseService extends BaseService<SpReturnwarehouse> {
    PageResult<SpReturnwarehouseVo> searchPageByCriteria(SpReturnwarehouseCriteria spReturnwarehouseCriteria);

    boolean addcheck(SpReturnwarehouseCriteria spReturnwarehouseCriteria);
}
