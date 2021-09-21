package com.javasm.salesupply.service;

import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.SpAbnormalcomplaintCriteria;
import com.javasm.salesupply.domain.criteria.SpChangegoodsCriteria;
import com.javasm.salesupply.domain.criteria.SpComplaintsrecordCriteria;
import com.javasm.salesupply.domain.entity.SpAbnormalcomplaint;
import com.javasm.salesupply.domain.entity.SpComplaintsrecord;
import com.javasm.salesupply.domain.vo.SpAbnormalcomplaintVo;
import com.javasm.salesupply.domain.vo.SpComplaintsrecordVo;
import com.javasm.salesupply.service.base.BaseService;
import org.springframework.stereotype.Service;

/**
 * @Author：戈李阳
 * @Version：1.0
 * @Date：2021/7/12-19:05
 * @Since:jdk1.8
 * @Description:TODO
 */

public interface SpComplaintsrecordService extends BaseService<SpComplaintsrecord> {
    PageResult<SpComplaintsrecordVo> searchPageByCriteria(SpComplaintsrecordCriteria spComplaintsrecordCriteria);

    boolean addcheck(SpComplaintsrecordCriteria spComplaintsrecordCriteria);
}
