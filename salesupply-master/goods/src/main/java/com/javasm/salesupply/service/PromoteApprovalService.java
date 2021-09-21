package com.javasm.salesupply.service;

import com.javasm.salesupply.domain.entity.PromoteApproval;
import java.util.List;

/**
 * (PromoteApproval)表服务接口
 *
 * @author makejava
 * @since 2021-07-16 11:12:35
 */
public interface PromoteApprovalService {

    /**
     * 通过ID查询单条数据
     *
     * @param approvalId 主键
     * @return 实例对象
     */
    PromoteApproval queryById(Integer approvalId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PromoteApproval> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param promoteApproval 实例对象
     * @return 实例对象
     */
    PromoteApproval insert(PromoteApproval promoteApproval);

    /**
     * 修改数据
     *
     * @param promoteApproval 实例对象
     * @return 实例对象
     */
    PromoteApproval update(PromoteApproval promoteApproval);

    /**
     * 通过主键删除数据
     *
     * @param approvalId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer approvalId);


    /**
     * 生成数据获取新增主键ID
     *
     * @params approvalStatus 审核状态-0 未审核
     * @params approvalLevel 0-普通审核,1-价格变化>20%审核,2-价格变化>50%审核
     * @return 新增数据的id主键
     */
    int addPromoteApproval(Integer approvalStatus,Integer approvalLevel);

}