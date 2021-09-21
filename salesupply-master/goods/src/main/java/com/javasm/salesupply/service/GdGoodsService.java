package com.javasm.salesupply.service;

import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.GoodsCriteria;
import com.javasm.salesupply.domain.entity.GdGoods;
import com.javasm.salesupply.domain.vo.GoodsVO;

import java.util.List;

/**
 * (GdGoods)表服务接口
 *
 * @author makejava
 * @since 2021-07-14 17:12:58
 */
public interface GdGoodsService {

    /**
     * 通过ID查询单条数据
     *
     * @param goodsId 主键
     * @return 实例对象
     */
    GdGoods queryById(Integer goodsId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<GdGoods> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param gdGoods 实例对象
     * @return 实例对象
     */
    GdGoods insert(GdGoods gdGoods);

    /**
     * 修改数据
     *
     * @param gdGoods 实例对象
     * @return 实例对象
     */
    GdGoods update(GdGoods gdGoods);

    /**
     * 通过主键删除数据
     *
     * @param goodsId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer goodsId);


    /**
     * 查询颜色
     * @return
     */
    List<GdGoods> findGoodsColorList();

    /**
     * 分页条件查询
     * @return
     */
    PageResult<GoodsVO> searchPageByCriteria(GoodsCriteria goodsCriteria);



}