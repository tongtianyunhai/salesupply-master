package com.javasm.salesupply.service;

import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.Good2giftCriteria;
import com.javasm.salesupply.domain.entity.GdGood2gift;
import com.javasm.salesupply.domain.vo.Good2giftVO;

import java.util.List;

/**
 * (GdGood2gift)表服务接口
 *
 * @author makejava
 * @since 2021-07-15 23:30:04
 */
public interface GdGood2giftService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    GdGood2gift queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<GdGood2gift> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param gdGood2gift 实例对象
     * @return 实例对象
     */
    GdGood2gift insert(GdGood2gift gdGood2gift);

    /**
     * 修改数据
     *
     * @param gdGood2gift 实例对象
     * @return 实例对象
     */
    GdGood2gift update(GdGood2gift gdGood2gift);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);


    /**
     * 分页查询
     * @param good2giftCriteria
     * @return
     */
    PageResult<Good2giftVO> searchPageByCriteria(Good2giftCriteria good2giftCriteria);

}