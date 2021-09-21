package com.javasm.salesupply.mapper;

import com.javasm.salesupply.domain.criteria.PromoteCriteria;
import com.javasm.salesupply.domain.entity.GtPromote;
import com.javasm.salesupply.domain.vo.GdPromoteVO;
import com.javasm.salesupply.domain.vo.PromoteDetailVO;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (GtPromote)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */
public interface GtPromoteDao {

    /**
     * 通过ID查询单条数据
     *
     * @param promoteId 主键
     * @return 实例对象
     */
    GtPromote queryById(Integer promoteId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<GtPromote> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param gtPromote 实例对象
     * @return 对象列表
     */
    List<GtPromote> queryAll(GtPromote gtPromote);

    /**
     * 新增数据
     *
     * @param promoteDetailVO 实例对象
     * @return 影响行数
     */
    int insert(PromoteDetailVO promoteDetailVO);

    /**
     * 修改数据
     *
     * @param promoteDetailVO 实例对象
     * @return 影响行数
     */
    int update(PromoteDetailVO promoteDetailVO);

    /**
     * 通过主键删除数据
     *
     * @param promoteId 主键
     * @return 影响行数
     */
    int deleteById(Integer promoteId);

    /**
     *  多条件模糊查询
     *
     * @param promoteCriteria
     * @return
     */
    List<GdPromoteVO> selectByParams(PromoteCriteria promoteCriteria);

    /**
     *  根据促销id查询相关信息
     *
     * @param promoteId
     * @return
     */
    PromoteDetailVO checkPromotes(Integer promoteId);


}