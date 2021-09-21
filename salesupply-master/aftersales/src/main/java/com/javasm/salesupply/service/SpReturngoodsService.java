package com.javasm.salesupply.service;

import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.SpAbnormalcomplaintCriteria;
import com.javasm.salesupply.domain.criteria.SpReturngoodsCriteria;
import com.javasm.salesupply.domain.entity.SpAbnormalcomplaint;
import com.javasm.salesupply.domain.entity.SpReturngoods;
import com.javasm.salesupply.domain.vo.SpAbnormalcomplaintVo;
import com.javasm.salesupply.domain.vo.SpReturngoodsVo;
import com.javasm.salesupply.service.base.BaseService;
import org.springframework.stereotype.Service;

/**
 * @Author：戈李阳
 * @Version：1.0
 * @Date：2021/7/12-19:06
 * @Since:jdk1.8
 * @Description:TODO
 */

public interface SpReturngoodsService extends BaseService<SpReturngoods> {
    PageResult<SpReturngoodsVo> searchPageByCriteria(SpReturngoodsCriteria spReturngoodsCriteria);

    boolean addcheck(SpReturngoodsCriteria spReturngoodsCriteria);
}
