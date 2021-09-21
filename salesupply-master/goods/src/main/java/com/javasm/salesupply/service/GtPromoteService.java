package com.javasm.salesupply.service;

import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.PromoteCriteria;
import com.javasm.salesupply.domain.entity.GtPromote;
import com.javasm.salesupply.domain.vo.GdPromoteVO;
import com.javasm.salesupply.domain.vo.PromoteDetailVO;

import java.util.List;

/**
 * (GtPromote)表服务接口
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */
public interface GtPromoteService {

    /**
     * 通过ID查询单条数据
     *
     * @param promoteId 主键
     * @return 实例对象
     */
    GtPromote queryById(Integer promoteId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<GtPromote> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param promoteDetailVO 实例对象
     * @return 实例对象
     */
    int insert(PromoteDetailVO promoteDetailVO);

    /**
     * 修改数据
     *
     * @param promoteDetailVO 实例对象
     * @return 实例对象
     */
    int update(PromoteDetailVO promoteDetailVO);

    /**
     * 通过主键删除数据
     *
     * @param promoteId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer promoteId);

    /**
     *  多条件分页查询
     *
     * @param promoteCriteria
     * @return
     */
    PageResult<GdPromoteVO> selectByParams(PromoteCriteria promoteCriteria);

    /**
     *  根据促销id查询相关信息
     *
     * @param promoteId
     * @return
     */
    PromoteDetailVO checkPromotes(Integer promoteId);
}