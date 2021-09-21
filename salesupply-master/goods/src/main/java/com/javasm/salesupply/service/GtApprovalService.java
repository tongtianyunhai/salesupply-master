package com.javasm.salesupply.service;

import com.javasm.salesupply.domain.entity.GtApproval;

import java.util.List;

/**
 * (GtApproval)表服务接口
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */
public interface GtApprovalService {

    /**
     * 通过ID查询单条数据
     *
     * @param approvalId 主键
     * @return 实例对象
     */
    GtApproval queryById(Integer approvalId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<GtApproval> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param gtApproval 实例对象
     * @return 实例对象
     */
    GtApproval insert(GtApproval gtApproval);

    /**
     * 修改数据
     *
     * @param gtApproval 实例对象
     * @return 实例对象
     */
    GtApproval update(GtApproval gtApproval);

    /**
     * 通过主键删除数据
     *
     * @param approvalId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer approvalId);

}