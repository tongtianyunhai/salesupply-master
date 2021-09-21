package com.javasm.salesupply.service;

import com.javasm.salesupply.domain.entity.GdImei;

import java.util.List;

/**
 * (GdImei)表服务接口
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */
public interface GdImeiService {

    /**
     * 通过ID查询单条数据
     *
     * @param imeiId 主键
     * @return 实例对象
     */
    GdImei queryById(Integer imeiId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<GdImei> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param gdImei 实例对象
     * @return 实例对象
     */
    GdImei insert(GdImei gdImei);

    /**
     * 修改数据
     *
     * @param gdImei 实例对象
     * @return 实例对象
     */
    GdImei update(GdImei gdImei);

    /**
     * 通过主键删除数据
     *
     * @param imeiId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer imeiId);

}