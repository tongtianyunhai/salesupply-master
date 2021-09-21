package com.javasm.salesupply.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.GodownCriteria;
import com.javasm.salesupply.domain.entity.*;
import com.javasm.salesupply.domain.vo.GodownVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author whl
 * @since 2021-07-14
 */
public interface StGodownService extends IService<StGodown> {

    /**
     * 添加售后申请表
     * @param stGodown
     * @return
     */
    boolean add(StGodown stGodown);


    /**
     * 条件查询所有订单
     * @return
     */
    PageResult<GodownVo> findAll(GodownCriteria godownCriteria);

    /**
     * 根据id查找换货申请入库单
     * @param id
     * @return
     */
    SpChangegoods findChangegoods(Integer id);


    /**
     * 根据id查找退货申请入库单
     * @param id
     * @return
     */
    SpReturngoods findReturngoods(Integer id);

    /**
     * 根据id查找返厂入库单
     * @param id
     * @return
     */
    SpReturnwarehouse findrRturnwarehouse(Integer id);


    /**
     * 根据id修改状态
     * @return
     */
    boolean updateStutas(StGodown StGodown);


    /**
     * 添加
     * @param godownCriteria
     * @return
     */
     boolean addcheck(GodownCriteria godownCriteria);
}
