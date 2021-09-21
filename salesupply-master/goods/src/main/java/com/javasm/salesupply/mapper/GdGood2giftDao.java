package com.javasm.salesupply.mapper;

import com.javasm.salesupply.domain.criteria.Good2giftCriteria;
import com.javasm.salesupply.domain.entity.GdGood2gift;
import com.javasm.salesupply.domain.vo.Good2giftVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (GdGood2gift)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-15 23:30:04
 */
public interface GdGood2giftDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    GdGood2gift queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<GdGood2gift> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param gdGood2gift 实例对象
     * @return 对象列表
     */
    List<GdGood2gift> queryAll(GdGood2gift gdGood2gift);

    /**
     * 新增数据
     *
     * @param gdGood2gift 实例对象
     * @return 影响行数
     */
    int insert(GdGood2gift gdGood2gift);

    /**
     * 修改数据
     *
     * @param gdGood2gift 实例对象
     * @return 影响行数
     */
    int update(GdGood2gift gdGood2gift);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    /**
     * 分页条件查询
     *
     * @param good2giftCriteria
     * @return
     */
    List<Good2giftVO> selectVO(Good2giftCriteria good2giftCriteria);

}