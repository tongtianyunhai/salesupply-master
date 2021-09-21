package com.javasm.salesupply.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.AftersaleInstoreCriteria;
import com.javasm.salesupply.domain.entity.StAftersaleInstore;
import com.javasm.salesupply.domain.vo.StAftersaleInstoreVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author whl
 * @since 2021-07-12
 */
public interface StAftersaleInstoreService extends IService<StAftersaleInstore> {


    /**
     * 添加
     * @param stAftersaleInstore
     * @return
     */
    boolean savaAftersaleInstore(StAftersaleInstore stAftersaleInstore);


    /**
     * 分页条件查询
     * @return
     */
    PageResult<StAftersaleInstoreVo> findAftersaleInstore(AftersaleInstoreCriteria aftersaleInstoreCriteria);


    /**
     * 修改状态
     * @param stAftersaleInstore
     * @return
     */
    boolean updataAftersaleInstore(StAftersaleInstore stAftersaleInstore);

    /**
     * 根据id查找入库单
     * @param id
     * @return
     */
    StAftersaleInstore findInstroeByid(Integer id);
}
