package com.javasm.salesupply.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.javasm.salesupply.domain.criteria.ClassifyCriteria;
import com.javasm.salesupply.domain.entity.GdClassify;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (GdClassify)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */
public interface GdClassifyDao extends BaseMapper<GdClassify> {

    /**
     * 通过ID查询单条数据
     *
     * @param classifyId 主键
     * @return 实例对象
     */
    GdClassify queryById(Integer classifyId);

    /**
     * 查询指定行数据
     *
     * @return 对象列表
     */
    List<GdClassify> queryAllByLimit();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param gdClassify 实例对象
     * @return 对象列表
     */
    List<GdClassify> queryAll(GdClassify gdClassify);

    /**
     * 新增数据
     *
     * @param gdClassify 实例对象
     * @return 影响行数
     */
    int insert(GdClassify gdClassify);

    /**
     * 修改数据
     *
     * @param gdClassify 实例对象
     * @return 影响行数
     */
    int update(GdClassify gdClassify);

    /**
     * 通过主键删除数据
     *
     * @param classifyId 主键
     * @return 影响行数
     */
    int deleteById(Integer classifyId);


    /**
     * 查询二级分类
     * @return
     */
    List<GdClassify> primaryClassification();

    /**
     * 查询一级分类
     *
     * @return
     */
    List<GdClassify> secondLevelDirectory(@Param("classifyId") int classifyId);

    List<GdClassify> searchPageByCriteria(ClassifyCriteria classifyCriteria);

}