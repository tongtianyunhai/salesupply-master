package com.javasm.salesupply.mapper;

import com.javasm.salesupply.domain.criteria.GdGift2GoodCriteria;
import com.javasm.salesupply.domain.criteria.GtGiftCriteria;
import com.javasm.salesupply.domain.entity.GdGift2good;
import com.javasm.salesupply.domain.entity.GtApproval;
import com.javasm.salesupply.domain.entity.GtGift;
import com.javasm.salesupply.domain.vo.EditgdGift2goodVO;
import com.javasm.salesupply.domain.vo.GdGift2goodVO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * (GdGift2good)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */
public interface GdGift2goodDao {

    /**
     * 通过ID查询单条数据
     *
     * @param giftId 主键
     * @return 实例对象
     */
    GdGift2good queryById(Integer giftId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<GdGift2good> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param gdGift2good 实例对象
     * @return 对象列表
     */
    List<GdGift2good> queryAll(GdGift2good gdGift2good);

    /**
     * 新增数据
     *
     * @param gdGift2good 实例对象
     * @return 影响行数
     */
    int insert(GdGift2good gdGift2good);

    /**
     *  添加赠品转商品的同时添加对应的审核表
     * @param giftId
     * @return
     */
    int insert1(Integer giftId);

    /**
     * 修改数据
     *
     * @param gdGift2good 实例对象
     * @return 影响行数
     */
    int update(GdGift2good gdGift2good);

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
     * @param gdGift2GoodCriteria
     * @return
     */
    List<GdGift2goodVO> selectByParams(GdGift2GoodCriteria gdGift2GoodCriteria);

    /**
     * 新增数据
     *
     * @param integer 实例对象
     * @return 影响行数
     */
    EditgdGift2goodVO selectOneByRemark1(Integer integer);

}