package com.javasm.salesupply.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.GoodsCriteria;
import com.javasm.salesupply.domain.entity.GdGoods;
import com.javasm.salesupply.domain.vo.GoodsVO;
import com.javasm.salesupply.mapper.GdGoodsDao;
import com.javasm.salesupply.service.GdGoodsService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * (GdGoods)表服务实现类
 *
 * @author makejava
 * @since 2021-07-14 17:12:58
 */
@Service("gdGoodsService")
public class GdGoodsServiceImpl extends ServiceImpl<GdGoodsDao,GdGoods> implements GdGoodsService {
    @Resource
    private GdGoodsDao gdGoodsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param goodsId 主键
     * @return 实例对象
     */
    @Override
    public GdGoods queryById(Integer goodsId) {
        return this.gdGoodsDao.queryById(goodsId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<GdGoods> queryAllByLimit(int offset, int limit) {
        return this.gdGoodsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param gdGoods 实例对象
     * @return 实例对象
     */
    @Override
    public GdGoods insert(GdGoods gdGoods) {
        this.gdGoodsDao.insert(gdGoods);
        return gdGoods;
    }

    /**
     * 修改数据
     *
     * @param gdGoods 实例对象
     * @return 实例对象
     */
    @Override
    public GdGoods update(GdGoods gdGoods) {
        this.gdGoodsDao.update(gdGoods);
        return this.queryById(gdGoods.getGoodsId());
    }

    /**
     * 通过主键删除数据
     *
     * @param goodsId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer goodsId) {
        return this.gdGoodsDao.deleteById(goodsId) > 0;
    }

    @Override
    public List<GdGoods> findGoodsColorList() {
        return gdGoodsDao.findGoodsColorList();
    }

    @Override
    public PageResult<GoodsVO> searchPageByCriteria(GoodsCriteria goodsCriteria) {
        Integer currentPage = goodsCriteria.getCurrentPage();
        Integer pageSize = goodsCriteria.getPageSize();

        if (StringUtils.isEmpty(currentPage)) {
            currentPage = 1;
        }
        if (StringUtils.isEmpty(pageSize)) {
            pageSize = 5;
        }
        PageHelper.startPage(currentPage, pageSize);
        List<GoodsVO> goodsVOList = gdGoodsDao.selectVO(goodsCriteria);
        PageInfo<GoodsVO> goodsVOPageInfo = new PageInfo<>(goodsVOList);
        long total = goodsVOPageInfo.getTotal();
        return new PageResult<>(total,goodsVOList);
    }
}