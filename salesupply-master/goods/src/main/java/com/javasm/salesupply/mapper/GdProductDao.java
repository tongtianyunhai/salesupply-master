package com.javasm.salesupply.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.javasm.salesupply.domain.criteria.ProductCriteria;
import com.javasm.salesupply.domain.entity.GdProduct;
import com.javasm.salesupply.domain.vo.ProductVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (GdProduct)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */
public interface GdProductDao extends BaseMapper<GdProduct> {

    /**
     * 通过ID查询单条数据
     *
     * @param productId 主键
     * @return 实例对象
     */
    GdProduct queryById(Integer productId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<GdProduct> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param gdProduct 实例对象
     * @return 对象列表
     */
    List<GdProduct> queryAll(GdProduct gdProduct);

    /**
     * 新增数据
     *
     * @param gdProduct 实例对象
     * @return 影响行数
     */
    int insert(GdProduct gdProduct);

    /**
     * 修改数据
     *
     * @param gdProduct 实例对象
     * @return 影响行数
     */
    int update(GdProduct gdProduct);

    /**
     * 通过主键删除数据
     *
     * @param productId 主键
     * @return 影响行数
     */
    int deleteById(Integer productId);

    /**
     * @return
     */
    List<GdProduct> findProductColorList();

    /**
     * 连表查询
     * @param productCriteria
     * @return
     */
    List<ProductVO> selectVO(ProductCriteria productCriteria);
}