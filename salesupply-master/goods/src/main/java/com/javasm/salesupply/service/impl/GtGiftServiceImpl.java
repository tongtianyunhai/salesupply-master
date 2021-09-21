package com.javasm.salesupply.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.salesupply.common.http.AxiosResult;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.GtGiftCriteria;
import com.javasm.salesupply.domain.entity.GdBrand;
import com.javasm.salesupply.domain.entity.GdClassify;
import com.javasm.salesupply.domain.entity.GtGift;
import com.javasm.salesupply.domain.vo.GtGiftVO;
import com.javasm.salesupply.mapper.GtGiftDao;
import com.javasm.salesupply.service.GtGiftService;
import com.javasm.salesupply.transfer.GiftTransfer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * (GtGift)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */
@Service
@RequiredArgsConstructor
public class GtGiftServiceImpl implements GtGiftService {
    @Resource
    private GtGiftDao gtGiftDao;

    private final GiftTransfer giftTransfer;


    /**
     * 通过ID查询单条数据
     *
     * @param giftId 主键
     * @return 实例对象
     */
    @Override
    public AxiosResult<GtGift> queryById(Integer giftId) {
        GtGift gtGift = this.gtGiftDao.queryById(giftId);
        return AxiosResult.success(gtGift);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<GtGift> queryAllByLimit(int offset, int limit) {
        return this.gtGiftDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param gtGift 实例对象
     * @return 实例对象
     */
    @Override
    public Integer insert(GtGift gtGift) {
        return this.gtGiftDao.insert(gtGift);
    }

    /**
     * 修改数据
     *
     * @param gtGift 实例对象
     * @return 实例对象
     */
    @Override
    public AxiosResult<Integer> update(GtGift gtGift) {
        int update = this.gtGiftDao.update(gtGift);
        return AxiosResult.success(update);
    }

    /**
     * 通过主键删除数据
     *
     * @param giftId 主键
     * @return 是否成功
     */
    @Override
    public Integer deleteById(Integer giftId) {
        return this.gtGiftDao.deleteById(giftId);
    }

    @Override
    public List<GtGift> queryAll(GtGiftCriteria gtGiftCriteria) {
        return null;
    }

    /**
     * 多条件查询
     * @param gtGiftCriteria
     * @return
     */
    @Override
    public PageResult<GtGiftVO> selectByParams(GtGiftCriteria gtGiftCriteria) {

        Integer currentPage = gtGiftCriteria.getCurrentPage();
        Integer pageSize = gtGiftCriteria.getPageSize();

        if (StringUtils.isEmpty(currentPage)){
            currentPage =1;
        }
        if (StringUtils.isEmpty(pageSize)){
            pageSize = 5;
        }
        // 开启分页,并设置起始页和每页条数
        PageHelper.startPage(currentPage,pageSize);

        //调用mapper层查询数据
        List<GtGift> gtGiftList = gtGiftDao.selectByParams(gtGiftCriteria);

        //根据pageInfo查询总条数
        PageInfo<GtGift> gtGiftPageInfo = new PageInfo<>(gtGiftList);
        long total = gtGiftPageInfo.getTotal();

        //List<GtGiftVO> giftVOList = giftTransfer.toVO(gtGiftList);

        List<GtGiftVO> giftVOList = giftTransfer.toVO(gtGiftList);

        return new PageResult<GtGiftVO>(total, giftVOList);
    }

    @Override
    public List<GdBrand> selectAllGdBrand() {
        return this.gtGiftDao.selectAllGdBrand();
    }

    @Override
    public List<GtGift> selectAllGtBrand() {
        return  this.gtGiftDao.selectAllGtBrand();
    }

    @Override
    public List<GdClassify> selectAllGdClassify() {
        return this.gtGiftDao.selectAllGdClassify();
    }

    @Override
    public List<GtGift> selectAllGtClassify() {
        return  this.gtGiftDao.selectAllGtClassify();
    }

    @Override
    public List<GtGift> selectAllGiftColor() {
        return this.gtGiftDao.selectAllGiftColor();
    }

    @Override
    public List<GtGift> selectAllGift() {
        return this.gtGiftDao.queryAll();
    }

}