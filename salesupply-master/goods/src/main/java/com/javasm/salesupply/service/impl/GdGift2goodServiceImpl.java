package com.javasm.salesupply.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.GdGift2GoodCriteria;

import com.javasm.salesupply.domain.vo.EditgdGift2goodVO;
import com.javasm.salesupply.domain.vo.GdGift2goodVO;
import com.javasm.salesupply.mapper.GdGift2goodDao;
import com.javasm.salesupply.domain.entity.GdGift2good;
import com.javasm.salesupply.service.GdGift2goodService;
import com.javasm.salesupply.transfer.GdGift2goodTransfer;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * (GdGift2good)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */
@Service
public class GdGift2goodServiceImpl implements GdGift2goodService {
    @Resource
    private GdGift2goodDao gdGift2goodDao;


    /**
     * 通过ID查询单条数据
     *
     * @param giftId 主键
     * @return 实例对象
     */
    @Override
    public GdGift2good queryById(Integer giftId) {
        return this.gdGift2goodDao.queryById(giftId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<GdGift2good> queryAllByLimit(int offset, int limit) {
        return this.gdGift2goodDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param gdGift2good 实例对象
     * @return 实例对象
     */
    @Override
    public Integer insert(GdGift2good gdGift2good) {
        return this.gdGift2goodDao.insert(gdGift2good);
    }

    @Override
    public int insert1(Integer giftId) {
        return this.gdGift2goodDao.insert1(giftId);
    }

    /**
     * 修改数据
     *
     * @param gdGift2good 实例对象
     * @return 实例对象
     */
    @Override
    public int update(GdGift2good gdGift2good) {

        return this.gdGift2goodDao.update(gdGift2good);
    }

    /**
     * 通过主键删除数据
     *
     * @param giftId 主键
     * @return 是否成功
     */
    @Override
    public Integer deleteById(Integer giftId) {
        return this.gdGift2goodDao.deleteById(giftId);
    }

    /**
     *  多条件分页查询
     *
     * @param gdGift2GoodCriteria
     * @return
     */
    @Override
    public PageResult<GdGift2goodVO> selectByParams(GdGift2GoodCriteria gdGift2GoodCriteria) {

        Integer currentPage = gdGift2GoodCriteria.getCurrentPage();
        Integer pageSize = gdGift2GoodCriteria.getPageSize();
        if (StringUtils.isEmpty(currentPage)){
            currentPage =1;
        }
        if (StringUtils.isEmpty(pageSize)){
            pageSize = 5;
        }
        // 开启分页,并设置起始页和每页条数
        PageHelper.startPage(currentPage,pageSize);
        //调用mapper层查询数据
        List<GdGift2goodVO> gdGift2goodVOS = gdGift2goodDao.selectByParams(gdGift2GoodCriteria);

        //根据pageInfo查询总条数
        PageInfo<GdGift2goodVO> gtGiftList  = new PageInfo<>(gdGift2goodVOS);
        long total = gtGiftList.getTotal();

        return new PageResult<GdGift2goodVO>(total,gdGift2goodVOS);
    }

    @Override
    public EditgdGift2goodVO selectOneByRemark1(Integer integer) {
        return this.gdGift2goodDao.selectOneByRemark1(integer);
    }
}