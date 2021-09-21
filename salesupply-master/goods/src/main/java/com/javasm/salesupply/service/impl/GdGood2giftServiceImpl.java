package com.javasm.salesupply.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.Good2giftCriteria;
import com.javasm.salesupply.domain.entity.GdGood2gift;
import com.javasm.salesupply.domain.vo.Good2giftVO;
import com.javasm.salesupply.mapper.GdGood2giftDao;
import com.javasm.salesupply.service.GdGood2giftService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * (GdGood2gift)表服务实现类
 *
 * @author makejava
 * @since 2021-07-15 23:30:04
 */
@Service("gdGood2giftService")
public class GdGood2giftServiceImpl implements GdGood2giftService {
    @Resource
    private GdGood2giftDao gdGood2giftDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public GdGood2gift queryById(Integer id) {
        return this.gdGood2giftDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<GdGood2gift> queryAllByLimit(int offset, int limit) {
        return this.gdGood2giftDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param gdGood2gift 实例对象
     * @return 实例对象
     */
    @Override
    public GdGood2gift insert(GdGood2gift gdGood2gift) {
        this.gdGood2giftDao.insert(gdGood2gift);
        return gdGood2gift;
    }

    /**
     * 修改数据
     *
     * @param gdGood2gift 实例对象
     * @return 实例对象
     */
    @Override
    public GdGood2gift update(GdGood2gift gdGood2gift) {
        this.gdGood2giftDao.update(gdGood2gift);
        return this.queryById(gdGood2gift.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.gdGood2giftDao.deleteById(id) > 0;
    }

    @Override
    public PageResult<Good2giftVO> searchPageByCriteria(Good2giftCriteria good2giftCriteria) {
        Integer currentPage = good2giftCriteria.getCurrentPage();
        Integer pageSize = good2giftCriteria.getPageSize();

        if (StringUtils.isEmpty(currentPage)) {
            currentPage = 1;
        }
        if (StringUtils.isEmpty(pageSize)) {
            pageSize = 5;
        }
        PageHelper.startPage(currentPage, pageSize);
        List<Good2giftVO> good2giftVOS = gdGood2giftDao.selectVO(good2giftCriteria);
        PageInfo<Good2giftVO> goodsVOPageInfo = new PageInfo<>(good2giftVOS);
        long total = goodsVOPageInfo.getTotal();
        return new PageResult<>(total,good2giftVOS);
    }
}