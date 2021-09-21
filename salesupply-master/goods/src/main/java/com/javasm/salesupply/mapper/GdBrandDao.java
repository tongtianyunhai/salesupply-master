package com.javasm.salesupply.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.javasm.salesupply.domain.entity.GdBrand;

import java.util.List;

/**
 * (GdBrand)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */

public interface GdBrandDao extends BaseMapper<GdBrand> {

    /**
     * 通过ID查询单条数据
     *
     * @param brandId 主键
     * @return 实例对象
     */
    GdBrand queryById(Integer brandId);

    /**
     * 查询指定行数据
     *
     * @return 对象列表
     */
    List<GdBrand> queryAllByLimit();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param gdBrand 实例对象
     * @return 对象列表
     */
    List<GdBrand> queryAll(GdBrand gdBrand);

    /**
     * 新增数据
     *
     * @param gdBrand 实例对象
     * @return 影响行数
     */
    int insert(GdBrand gdBrand);

    /**
     * 修改数据
     *
     * @param gdBrand 实例对象
     * @return 影响行数
     */
    int update(GdBrand gdBrand);

    /**
     * 通过主键删除数据
     *
     * @param brandId 主键
     * @return 影响行数
     */
    int deleteById(Integer brandId);

}