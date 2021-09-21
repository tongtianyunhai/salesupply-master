package com.javasm.salesupply.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.ProductCriteria;
import com.javasm.salesupply.domain.entity.GdProduct;
import com.javasm.salesupply.domain.vo.ProductVO;
import com.javasm.salesupply.mapper.GdProductDao;
import com.javasm.salesupply.service.GdProductService;
import com.javasm.salesupply.transfer.ProductTransfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * (GdProduct)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */
@Service
public class GdProductServiceImpl extends ServiceImpl<GdProductDao,GdProduct> implements GdProductService {
    @Resource
    private GdProductDao gdProductDao;
    @Autowired
    private ProductTransfer productTransfer;

    /**
     * 通过ID查询单条数据
     *
     * @param productId 主键
     * @return 实例对象
     */
    @Override
    public GdProduct queryById(Integer productId) {
        return this.gdProductDao.queryById(productId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<GdProduct> queryAllByLimit(int offset, int limit) {
        return this.gdProductDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param gdProduct 实例对象
     * @return 实例对象
     */
    @Override
    public GdProduct insert(GdProduct gdProduct) {
        this.gdProductDao.insert(gdProduct);
        return gdProduct;
    }

    /**
     * 修改数据
     *
     * @param gdProduct 实例对象
     * @return 实例对象
     */
    @Override
    public GdProduct update(GdProduct gdProduct) {
        this.gdProductDao.update(gdProduct);
        return this.queryById(gdProduct.getProductId());
    }

    /**
     * 通过主键删除数据
     *
     * @param productId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer productId) {
        return this.gdProductDao.deleteById(productId) > 0;
    }

    @Override
    public List<GdProduct> findProductColorList() {
        return gdProductDao.findProductColorList();
    }

    @Override
    public PageResult<ProductVO> searchPageByCriteria(ProductCriteria productCriteria) {
        Integer currentPage = productCriteria.getCurrentPage();
        Integer pageSize = productCriteria.getPageSize();

        if (StringUtils.isEmpty(currentPage)) {
            currentPage = 1;
        }
        if (StringUtils.isEmpty(pageSize)) {
            pageSize = 5;
        }
        PageHelper.startPage(currentPage, pageSize);

//        QueryWrapper<GdProduct> productQueryWrapper = new QueryWrapper<>();
//        LambdaQueryWrapper<GdProduct> lambda = productQueryWrapper.lambda();
//        if (!StringUtils.isEmpty(productCriteria.getProductColor())) {
//            lambda.like(GdProduct::getProductColor, productCriteria.getProductColor());
//        }
//        if (!StringUtils.isEmpty(productCriteria.getProductBrand())) {
//            lambda.like(GdProduct::getProductBrand, productCriteria.getProductBrand());
//        }
//        if (!StringUtils.isEmpty(productCriteria.getProductEncode())) {
//            lambda.like(GdProduct::getProductEncode, productCriteria.getProductEncode());
//        }
//        if (!StringUtils.isEmpty(productCriteria.getProductClassify())) {
//            lambda.like(GdProduct::getProductClassify, productCriteria.getProductClassify());
//        }
//        if (!StringUtils.isEmpty(productCriteria.getProductType())) {
//            lambda.like(GdProduct::getProductType, productCriteria.getProductType());
//        }

        List<ProductVO> gdProductList = gdProductDao.selectVO(productCriteria);
        PageInfo<ProductVO> gdProductPageInfo = new PageInfo<>(gdProductList);
        long total = gdProductPageInfo.getTotal();
        return new PageResult<>(total,gdProductList);
    }
}