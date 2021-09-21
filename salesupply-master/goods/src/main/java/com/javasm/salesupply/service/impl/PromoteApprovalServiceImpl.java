package com.javasm.salesupply.service.impl;

import com.javasm.salesupply.domain.entity.PromoteApproval;
import com.javasm.salesupply.mapper.PromoteApprovalDao;
import com.javasm.salesupply.service.PromoteApprovalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (PromoteApproval)表服务实现类
 *
 * @author makejava
 * @since 2021-07-16 11:12:35
 */
@Service("promoteApprovalService")
public class PromoteApprovalServiceImpl implements PromoteApprovalService {
    @Resource
    private PromoteApprovalDao promoteApprovalDao;

    /**
     * 通过ID查询单条数据
     *
     * @param approvalId 主键
     * @return 实例对象
     */
    @Override
    public PromoteApproval queryById(Integer approvalId) {
        return this.promoteApprovalDao.queryById(approvalId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PromoteApproval> queryAllByLimit(int offset, int limit) {
        return this.promoteApprovalDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param promoteApproval 实例对象
     * @return 实例对象
     */
    @Override
    public PromoteApproval insert(PromoteApproval promoteApproval) {
        this.promoteApprovalDao.insert(promoteApproval);
        return promoteApproval;
    }

    /**
     * 修改数据
     *
     * @param promoteApproval 实例对象
     * @return 实例对象
     */
    @Override
    public PromoteApproval update(PromoteApproval promoteApproval) {
        this.promoteApprovalDao.update(promoteApproval);
        return this.queryById(promoteApproval.getApprovalId());
    }

    /**
     * 通过主键删除数据
     *
     * @param approvalId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer approvalId) {
        return this.promoteApprovalDao.deleteById(approvalId) > 0;
    }

    /**
     *  传入信息返回新增主键
     *
     * @param approvalStatus
     * @param approvalLevel
     * @return
     */
    @Override
    public int addPromoteApproval(Integer approvalStatus, Integer approvalLevel) {
        return this.promoteApprovalDao.addPromoteApproval(approvalStatus,approvalLevel);
    }
}