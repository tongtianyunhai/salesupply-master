package com.javasm.salesupply.service;

import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.ProductCriteria;
import com.javasm.salesupply.domain.entity.GdProduct;
import com.javasm.salesupply.domain.vo.ProductVO;

import java.util.List;

/**
 * (GdProduct)表服务接口
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */
public interface GdProductService {

    /**
     * 通过ID查询单条数据
     *
     * @param productId 主键
     * @return 实例对象
     */
    GdProduct queryById(Integer productId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<GdProduct> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param gdProduct 实例对象
     * @return 实例对象
     */
    GdProduct insert(GdProduct gdProduct);

    /**
     * 修改数据
     *
     * @param gdProduct 实例对象
     * @return 实例对象
     */
    GdProduct update(GdProduct gdProduct);

    /**
     * 通过主键删除数据
     *
     * @param productId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer productId);

    /**
     * 颜色
     * @return
     */
    List<GdProduct> findProductColorList();

    /**
     * 分页
     * @param productCriteria
     * @return
     */
    PageResult<ProductVO> searchPageByCriteria(ProductCriteria productCriteria);

}