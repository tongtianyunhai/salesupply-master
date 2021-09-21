package com.javasm.salesupply.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.javasm.salesupply.domain.criteria.GoodsCriteria;
import com.javasm.salesupply.domain.entity.GdGoods;
import com.javasm.salesupply.domain.vo.GoodsVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (GdGoods)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-14 17:12:58
 */
@Mapper
public interface GdGoodsDao extends BaseMapper<GdGoods> {

    /**
     * 通过ID查询单条数据
     *
     * @param goodsId 主键
     * @return 实例对象
     */
    GdGoods queryById(Integer goodsId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<GdGoods> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param gdGoods 实例对象
     * @return 对象列表
     */
    List<GdGoods> queryAll(GdGoods gdGoods);

    /**
     * 新增数据
     *
     * @param gdGoods 实例对象
     * @return 影响行数
     */
    int insert(GdGoods gdGoods);

    /**
     * 修改数据
     *
     * @param gdGoods 实例对象
     * @return 影响行数
     */
    int update(GdGoods gdGoods);

    /**
     * 通过主键删除数据
     *
     * @param goodsId 主键
     * @return 影响行数
     */
    int deleteById(Integer goodsId);

    /**
     * 查詢颜色
     * @return
     */
    List<GdGoods> findGoodsColorList();

    /**
     * 分页条件查询
     * @param goodsCriteria
     * @return
     */
    List<GoodsVO> selectVO(GoodsCriteria goodsCriteria);
}