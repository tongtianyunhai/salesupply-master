package com.javasm.salesupply.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.BrandCriteria;
import com.javasm.salesupply.domain.entity.GdBrand;
import com.javasm.salesupply.domain.vo.BrandVO;

import java.util.List;

/**
 * (GdBrand)表服务接口
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */
public interface GdBrandService extends IService<GdBrand> {

    /**
     * 通过ID查询单条数据
     *
     * @param brandId 主键
     * @return 实例对象
     */
    GdBrand queryById(Integer brandId);

    /**
     * 查询多条数据

     * @return 对象列表
     */
    List<GdBrand> queryAllByLimit();

    /**
     * 新增数据
     *
     * @param gdBrand 实例对象
     * @return 实例对象
     */
    GdBrand insert(GdBrand gdBrand);

    /**
     * 修改数据
     *
     * @param gdBrand 实例对象
     * @return 实例对象
     */
    GdBrand updateByBrandId(GdBrand gdBrand);

    /**
     * 通过主键删除数据
     *
     * @param brandId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer brandId);

    /**
     * 分页查询
     * @param brandCriteria
     * @return
     */
    PageResult<BrandVO> searchPageByCriteria(BrandCriteria brandCriteria);

}