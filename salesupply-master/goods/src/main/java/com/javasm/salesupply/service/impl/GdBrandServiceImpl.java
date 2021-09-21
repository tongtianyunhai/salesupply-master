package com.javasm.salesupply.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.BrandCriteria;
import com.javasm.salesupply.domain.entity.GdBrand;
import com.javasm.salesupply.domain.vo.BrandVO;
import com.javasm.salesupply.mapper.GdBrandDao;
import com.javasm.salesupply.service.GdBrandService;
import com.javasm.salesupply.transfer.BrandTransfer;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * (GdBrand)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */
@Service
public class GdBrandServiceImpl extends ServiceImpl<GdBrandDao, GdBrand> implements GdBrandService {
    @Resource
    private GdBrandDao gdBrandDao;
    @Resource
    private BrandTransfer brandTransfer;

    /**
     * 通过ID查询单条数据
     *
     * @param brandId 主键
     * @return 实例对象
     */
    @Override
    public GdBrand queryById(Integer brandId) {
        return this.gdBrandDao.queryById(brandId);
    }

    /**
     * 查询多条数据

     * @return 对象列表
     */
    @Override
    public List<GdBrand> queryAllByLimit() {
        return this.gdBrandDao.queryAllByLimit();
    }

    /**
     * 新增数据
     *
     * @param gdBrand 实例对象
     * @return 实例对象
     */
    @Override
    public GdBrand insert(GdBrand gdBrand) {
        gdBrand.setCreateTime(new Date());
        this.gdBrandDao.insert(gdBrand);
        return gdBrand;
    }

    /**
     * 修改数据
     *
     * @param gdBrand 实例对象
     * @return 实例对象
     */
    @Override
    public GdBrand updateByBrandId(GdBrand gdBrand) {
        gdBrand.setUpdateTime(new Date());
        this.gdBrandDao.update(gdBrand);
        return this.queryById(gdBrand.getBrandId());
    }

    /**
     * 通过主键删除数据
     *
     * @param brandId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer brandId) {
        return this.gdBrandDao.deleteById(brandId) > 0;
    }

    @Override
    public PageResult<BrandVO> searchPageByCriteria(BrandCriteria brandCriteria) {
        Integer currentPage = brandCriteria.getCurrentPage();
        Integer pageSize = brandCriteria.getPageSize();

        if (StringUtils.isEmpty(currentPage)) {
            currentPage = 1;
        }
        if (StringUtils.isEmpty(pageSize)) {
            pageSize = 5;
        }

        PageHelper.startPage(currentPage, pageSize);
        LocalDateTime startTime = brandCriteria.getStartTime();
        LocalDateTime endTime = brandCriteria.getEndTime();
        String brandName = brandCriteria.getBrandName();

        QueryWrapper<GdBrand> brandQueryWrapper = new QueryWrapper<GdBrand>();
        LambdaQueryWrapper<GdBrand> lambda = brandQueryWrapper.lambda();


        //拼接sql的
        if (startTime != null && endTime != null) {
            lambda.between(GdBrand::getCreateTime, startTime, endTime);
        }

        if (!StringUtils.isEmpty(brandName)) {
            lambda.like(GdBrand::getBrandName, brandName);
        }

        List<GdBrand> brandList = gdBrandDao.selectList(brandQueryWrapper);

        PageInfo<GdBrand> brandPageInfo = new PageInfo<>(brandList);

        long total = brandPageInfo.getTotal();

        //brandList ------>brandVoList

        List<BrandVO> brandVoList = brandTransfer.toVO(brandList);


        return new PageResult<BrandVO>(total, brandVoList);
    }
}