package com.javasm.salesupply.service;


import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.SpAbnormalcomplaintCriteria;
import com.javasm.salesupply.domain.entity.SpAbnormalcomplaint;
import com.javasm.salesupply.domain.vo.SpAbnormalcomplaintVo;
import com.javasm.salesupply.service.base.BaseService;
import org.springframework.stereotype.Service;

/**
 * @Author：戈李阳
 * @Version：1.0
 * @Date：2021/7/12-15:29
 * @Since:jdk1.8
 * @Description:TODO
 */

public interface SpAbnormalcomplaintService extends BaseService<SpAbnormalcomplaint> {
    PageResult<SpAbnormalcomplaintVo> searchPageByCriteria(SpAbnormalcomplaintCriteria spAbnormalcomplaintCriteria);
}
