package com.javasm.salesupply.service;

import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.GdGift2GoodCriteria;
import com.javasm.salesupply.domain.criteria.GtGiftCriteria;
import com.javasm.salesupply.domain.entity.GdGift2good;
import com.javasm.salesupply.domain.entity.GtApproval;
import com.javasm.salesupply.domain.vo.EditgdGift2goodVO;
import com.javasm.salesupply.domain.vo.GdGift2goodVO;
import com.javasm.salesupply.domain.vo.GtGiftVO;

import java.util.List;

/**
 * (GdGift2good)表服务接口
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */
public interface GdGift2goodService {

    /**
     * 通过ID查询单条数据
     *
     * @param giftId 主键
     * @return 实例对象
     */
    GdGift2good queryById(Integer giftId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<GdGift2good> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param gdGift2good 实例对象
     * @return 实例对象
     */
    Integer insert(GdGift2good gdGift2good);
    /**
     *  添加赠品转商品的同时添加对应的审核表
     * @param
     * @return
     */
    int insert1(Integer giftId);


    /**
     * 修改数据
     *
     * @param gdGift2good 实例对象
     * @return 实例对象
     */
    int update(GdGift2good gdGift2good);

    /**
     * 通过主键删除数据
     *
     * @param giftId 主键
     * @return 是否成功
     */
    Integer deleteById(Integer giftId);

    /**
     *  多条件分页查询
     *
     * @param gdGift2GoodCriteria
     * @return
     */
    PageResult<GdGift2goodVO> selectByParams(GdGift2GoodCriteria gdGift2GoodCriteria);

    /**
     *  通过主键 remark1 查询信息
     *
     * @param integer
     * @return
     */
    EditgdGift2goodVO selectOneByRemark1(Integer integer);

}