package com.javasm.salesupply.controller;

import com.javasm.salesupply.common.http.AxiosResult;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.controller.base.BaseController;
import com.javasm.salesupply.domain.criteria.ProductCriteria;
import com.javasm.salesupply.domain.entity.GdProduct;
import com.javasm.salesupply.domain.vo.ProductVO;
import com.javasm.salesupply.service.GdProductService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (GdProduct)表控制层
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */
@RestController
@RequestMapping("gdProduct")
public class GdProductController extends BaseController {
    /**
     * 服务对象
     */
    @Resource
    private GdProductService gdProductService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public GdProduct selectOne(Integer id) {
        return this.gdProductService.queryById(id);
    }


    @RequestMapping("addProduct")
    public GdProduct addProduct(GdProduct gdProduct) {
        GdProduct insert = gdProductService.insert(gdProduct);
        return insert;
    }

    /**
     *  查询产品颜色list
     * @return
     */
    @RequestMapping("findColors")
    public AxiosResult<List<GdProduct>> findProductColorList(){
        List<GdProduct> giftColorList = gdProductService.findProductColorList();
        return AxiosResult.success(giftColorList);
    }


    /**
     *  @author: chy
     *  @Date: 分页查询 14:46
     *  @Description:
     */
    @RequestMapping("searchPageByCriteria")
    public AxiosResult<PageResult<ProductVO>> searchPageByCriteria( ProductCriteria productCriteria) {
        PageResult<ProductVO> productVOPageResult = gdProductService.searchPageByCriteria(productCriteria);
        return AxiosResult.success(productVOPageResult);
    }

}