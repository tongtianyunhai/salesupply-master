package com.javasm.salesupply.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.PromoteCriteria;
import com.javasm.salesupply.domain.vo.GdGift2goodVO;
import com.javasm.salesupply.domain.vo.GdPromoteVO;
import com.javasm.salesupply.domain.vo.PromoteDetailVO;
import com.javasm.salesupply.mapper.GtPromoteDao;
import com.javasm.salesupply.domain.entity.GtPromote;
import com.javasm.salesupply.service.GtPromoteService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * (GtPromote)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */
@Service
public class GtPromoteServiceImpl implements GtPromoteService {
    @Resource
    private GtPromoteDao gtPromoteDao;

    /**
     * 通过ID查询单条数据
     *
     * @param promoteId 主键
     * @return 实例对象
     */
    @Override
    public GtPromote queryById(Integer promoteId) {
        return this.gtPromoteDao.queryById(promoteId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<GtPromote> queryAllByLimit(int offset, int limit) {
        return this.gtPromoteDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param
     * @return 实例对象
     */
    @Override
    public int insert(PromoteDetailVO promoteDetailVO) {

        return this.gtPromoteDao.insert(promoteDetailVO);
    }

    /**
     * 修改数据
     *
     * @param promoteDetailVO 实例对象
     * @return 实例对象
     */
    @Override
    public int update(PromoteDetailVO promoteDetailVO) {

        return this.gtPromoteDao.update(promoteDetailVO);
    }

    /**
     * 通过主键删除数据
     *
     * @param promoteId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer promoteId) {
        return this.gtPromoteDao.deleteById(promoteId) > 0;
    }

    /**
     *  多条件分页查询
     *
     * @param promoteCriteria
     * @return
     */
    @Override
    public PageResult<GdPromoteVO> selectByParams(PromoteCriteria promoteCriteria) {

        Integer currentPage = promoteCriteria.getCurrentPage();
        Integer pageSize = promoteCriteria.getPageSize();
        if (StringUtils.isEmpty(currentPage)){
            currentPage =1;
        }
        if (StringUtils.isEmpty(pageSize)){
            pageSize = 5;
        }
        // 开启分页,并设置起始页和每页条数
        PageHelper.startPage(currentPage,pageSize);

        //调用mapper层查询数据
        List<GdPromoteVO> gdPromoteVOS = gtPromoteDao.selectByParams(promoteCriteria);

        //根据pageInfo查询总条数
        PageInfo<GdPromoteVO> gdPromoteVOPageInfo = new PageInfo<>(gdPromoteVOS);
        long total = gdPromoteVOPageInfo.getTotal();

        return new PageResult<GdPromoteVO>(total,gdPromoteVOS);
    }

    /**
     *  促销详情查询
     *
     * @param promoteId
     * @return
     */
    @Override
    public PromoteDetailVO checkPromotes(Integer promoteId) {
        return this.gtPromoteDao.checkPromotes(promoteId);
    }
}











