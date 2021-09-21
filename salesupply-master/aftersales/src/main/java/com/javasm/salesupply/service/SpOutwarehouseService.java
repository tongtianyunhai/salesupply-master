package com.javasm.salesupply.service;

import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.SpAbnormalcomplaintCriteria;
import com.javasm.salesupply.domain.criteria.SpOutwarehouseCriteria;
import com.javasm.salesupply.domain.criteria.SpReturngoodsCriteria;
import com.javasm.salesupply.domain.entity.SpAbnormalcomplaint;
import com.javasm.salesupply.domain.entity.SpOutwarehouse;
import com.javasm.salesupply.domain.vo.SpAbnormalcomplaintVo;
import com.javasm.salesupply.domain.vo.SpOutwarehouseVo;
import com.javasm.salesupply.service.base.BaseService;
import org.springframework.stereotype.Service;

/**
 * @Author：戈李阳
 * @Version：1.0
 * @Date：2021/7/12-19:06
 * @Since:jdk1.8
 * @Description:TODO
 */

public interface SpOutwarehouseService extends BaseService<SpOutwarehouse> {
    PageResult<SpOutwarehouseVo> searchPageByCriteria(SpOutwarehouseCriteria spOutwarehouseCriteria);

    boolean addcheck(SpOutwarehouseCriteria spOutwarehouseCriteria);
}
