package com.javasm.salesupply.service.impl;

import com.javasm.salesupply.mapper.GtApprovalDao;
import com.javasm.salesupply.domain.entity.GtApproval;
import com.javasm.salesupply.service.GtApprovalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (GtApproval)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */
@Service
public class GtApprovalServiceImpl implements GtApprovalService {
    @Resource
    private GtApprovalDao gtApprovalDao;

    /**
     * 通过ID查询单条数据
     *
     * @param approvalId 主键
     * @return 实例对象
     */
    @Override
    public GtApproval queryById(Integer approvalId) {
        return this.gtApprovalDao.queryById(approvalId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<GtApproval> queryAllByLimit(int offset, int limit) {
        return this.gtApprovalDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param gtApproval 实例对象
     * @return 实例对象
     */
    @Override
    public GtApproval insert(GtApproval gtApproval) {
        this.gtApprovalDao.insert(gtApproval);
        return gtApproval;
    }

    /**
     * 修改数据
     *
     * @param gtApproval 实例对象
     * @return 实例对象
     */
    @Override
    public GtApproval update(GtApproval gtApproval) {
        this.gtApprovalDao.update(gtApproval);
        return this.queryById(gtApproval.getApprovalId());
    }

    /**
     * 通过主键删除数据
     *
     * @param approvalId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer approvalId) {
        return this.gtApprovalDao.deleteById(approvalId) > 0;
    }
}