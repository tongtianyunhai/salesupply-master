package com.javasm.salesupply.mapper;

import com.javasm.salesupply.domain.entity.GdImei;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (GdImei)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */
public interface GdImeiDao {

    /**
     * 通过ID查询单条数据
     *
     * @param imeiId 主键
     * @return 实例对象
     */
    GdImei queryById(Integer imeiId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<GdImei> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param gdImei 实例对象
     * @return 对象列表
     */
    List<GdImei> queryAll(GdImei gdImei);

    /**
     * 新增数据
     *
     * @param gdImei 实例对象
     * @return 影响行数
     */
    int insert(GdImei gdImei);

    /**
     * 修改数据
     *
     * @param gdImei 实例对象
     * @return 影响行数
     */
    int update(GdImei gdImei);

    /**
     * 通过主键删除数据
     *
     * @param imeiId 主键
     * @return 影响行数
     */
    int deleteById(Integer imeiId);

}