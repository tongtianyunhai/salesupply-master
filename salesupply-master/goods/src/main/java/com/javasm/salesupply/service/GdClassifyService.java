package com.javasm.salesupply.service;

import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.ClassifyCriteria;
import com.javasm.salesupply.domain.entity.GdClassify;
import com.javasm.salesupply.domain.vo.ClassifyVO;

import java.util.List;

/**
 * (GdClassify)表服务接口
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */
public interface GdClassifyService {

    /**
     * 通过ID查询单条数据
     *
     * @param classifyId 主键
     * @return 实例对象
     */
    GdClassify queryById(Integer classifyId);

    /**
     * 查询多条数据

     * @return 对象列表
     */
    List<GdClassify> queryAllByLimit();

    /**
     * 新增数据
     *
     * @param gdClassify 实例对象
     * @return 实例对象
     */
    GdClassify insert(GdClassify gdClassify);

    /**
     * 修改数据
     *
     * @param gdClassify 实例对象
     * @return 实例对象
     */
    GdClassify update(GdClassify gdClassify);

    /**
     * 通过主键删除数据
     *
     * @param classifyId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer classifyId);

    /**
     * 查询一级分类
     * @return
     */
    List<GdClassify> primaryClassification();

    /**
     * 查询二级分类
     * @return
     */
    List<GdClassify> secondLevelDirectory(Integer classifyId);

    /**
     *分页
     * @param classifyCriteria
     * @return
     */
    PageResult<ClassifyVO> searchPageByCriteria(ClassifyCriteria classifyCriteria);
}