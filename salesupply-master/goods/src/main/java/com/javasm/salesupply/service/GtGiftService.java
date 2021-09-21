package com.javasm.salesupply.service;

import com.javasm.salesupply.common.http.AxiosResult;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.entity.GdBrand;
import com.javasm.salesupply.domain.entity.GdClassify;
import com.javasm.salesupply.domain.entity.GtGift;
import com.javasm.salesupply.domain.criteria.GtGiftCriteria;
import com.javasm.salesupply.domain.vo.GtGiftVO;


import java.util.List;

/**
 * (GtGift)表服务接口
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */
public interface GtGiftService {

    /**
     * 通过ID查询单条数据
     *
     * @param giftId 主键
     * @return 实例对象
     */
    AxiosResult<GtGift> queryById(Integer giftId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<GtGift> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param gtGift 实例对象
     * @return 实例对象
     */
    Integer insert(GtGift gtGift);

    /**
     * 修改数据
     *
     * @param gtGift 实例对象
     * @return 实例对象
     */
    AxiosResult<Integer> update(GtGift gtGift);

    /**
     * 通过主键删除数据
     *
     * @param giftId 主键
     * @return 是否成功
     */
    Integer deleteById(Integer giftId);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param gtGiftCriteria 实例对象
     * @return 对象列表
     */
    List<GtGift> queryAll(GtGiftCriteria gtGiftCriteria);

    /**
     *  多条件查询
     *
     * @param gtGiftCriteria
     * @return
     */
    PageResult<GtGiftVO> selectByParams(GtGiftCriteria gtGiftCriteria);

    /**
     *   查询所有商品品牌
     * @return
     */
    List<GdBrand> selectAllGdBrand();

    /**
     *   查询所有赠品品牌
     * @return
     */
    List<GtGift> selectAllGtBrand();

    /**
     *  查询所有商品类型
     * @return
     */
    List<GdClassify> selectAllGdClassify();

    /**
     *  查询所有赠品类型
     * @return
     */
    List<GtGift> selectAllGtClassify();

    /**
     *  查询所有赠品颜色
     * @return
     */
    List<GtGift> selectAllGiftColor();

    /**
     *  查询所有赠品
     * @return
     */
    List<GtGift> selectAllGift();
}