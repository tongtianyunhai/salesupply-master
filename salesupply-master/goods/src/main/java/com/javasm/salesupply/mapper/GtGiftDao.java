package com.javasm.salesupply.mapper;

import com.javasm.salesupply.domain.entity.GdBrand;
import com.javasm.salesupply.domain.entity.GdClassify;
import com.javasm.salesupply.domain.entity.GtGift;
import com.javasm.salesupply.domain.criteria.GtGiftCriteria;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (GtGift)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */
@Repository
public interface GtGiftDao {

    /**
     * 通过ID查询单条数据
     *
     * @param giftId 主键
     * @return 实例对象
     */
    GtGift queryById(Integer giftId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<GtGift> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param
     * @return 对象列表
     */
    List<GtGift> queryAll();

    /**
     * 新增数据
     *
     * @param gtGift 实例对象
     * @return 影响行数
     */
    int insert(GtGift gtGift);

    /**
     * 修改数据
     *
     * @param gtGift 实例对象
     * @return 影响行数
     */
    int update(GtGift gtGift);

    /**
     * 通过主键删除数据
     *
     * @param giftId 主键
     * @return 影响行数
     */
    int deleteById(Integer giftId);

    /**
     *  多条件查询
     *
     * @param gtGiftCriteria
     * @return
     */
    List<GtGift> selectByParams(GtGiftCriteria gtGiftCriteria);

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
}