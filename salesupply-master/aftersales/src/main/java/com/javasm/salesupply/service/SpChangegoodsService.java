package com.javasm.salesupply.service;

import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.GoodsInfoCriteria;
import com.javasm.salesupply.domain.criteria.SpAbnormalcomplaintCriteria;
import com.javasm.salesupply.domain.criteria.SpChangegoodsCriteria;
import com.javasm.salesupply.domain.criteria.SpOutwarehouseCriteria;
import com.javasm.salesupply.domain.entity.SpAbnormalcomplaint;
import com.javasm.salesupply.domain.entity.SpChangegoods;
import com.javasm.salesupply.domain.vo.GoodsInfoVo;
import com.javasm.salesupply.domain.vo.SpAbnormalcomplaintVo;
import com.javasm.salesupply.domain.vo.SpChangegoodsVo;
import com.javasm.salesupply.service.base.BaseService;
import org.springframework.stereotype.Service;

/**
 * @Author：戈李阳
 * @Version：1.0
 * @Date：2021/7/12-19:05
 * @Since:jdk1.8
 * @Description:TODO
 */

public interface SpChangegoodsService extends BaseService<SpChangegoods> {
    PageResult<SpChangegoodsVo> searchPageByCriteria(SpChangegoodsCriteria spChangegoodsCriteria);

    PageResult<GoodsInfoVo> searchPageBygoodsname(GoodsInfoCriteria goodsInfoCriteria);

    boolean addcheck(SpChangegoodsCriteria spChangegoodsCriteria);
}
