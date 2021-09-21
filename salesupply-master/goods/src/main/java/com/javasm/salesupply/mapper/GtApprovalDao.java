package com.javasm.salesupply.mapper;

import com.javasm.salesupply.domain.entity.GtApproval;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (GtApproval)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */
public interface GtApprovalDao {

    /**
     * 通过ID查询单条数据
     *
     * @param approvalId 主键
     * @return 实例对象
     */
    GtApproval queryById(Integer approvalId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<GtApproval> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param gtApproval 实例对象
     * @return 对象列表
     */
    List<GtApproval> queryAll(GtApproval gtApproval);

    /**
     * 新增数据
     *
     * @param gtApproval 实例对象
     * @return 影响行数
     */
    int insert(GtApproval gtApproval);

    /**
     * 修改数据
     *
     * @param gtApproval 实例对象
     * @return 影响行数
     */
    int update(GtApproval gtApproval);

    /**
     * 通过主键删除数据
     *
     * @param approvalId 主键
     * @return 影响行数
     */
    int deleteById(Integer approvalId);

}