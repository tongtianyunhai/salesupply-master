package com.javasm.salesupply.controller;

import com.javasm.salesupply.common.http.AxiosResult;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.controller.base.BaseController;

import com.javasm.salesupply.domain.criteria.BrandCriteria;
import com.javasm.salesupply.domain.entity.GdBrand;
import com.javasm.salesupply.domain.vo.BrandVO;
import com.javasm.salesupply.service.GdBrandService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (GdBrand)表控制层
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */
@RestController
@RequestMapping("gdBrand")
public class GdBrandController extends BaseController {
    /**
     * 服务对象
     */
    @Resource
    private GdBrandService gdBrandService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public GdBrand selectOne(Integer id) {
        return gdBrandService.queryById(id);
    }


    @RequestMapping("searchPageByCriteria")
    public AxiosResult<PageResult<BrandVO>> searchPageByCriteria(BrandCriteria brandCriteria) {
        PageResult<BrandVO> brandVOPageResult = gdBrandService.searchPageByCriteria(brandCriteria);
        return AxiosResult.success(brandVOPageResult);
    }

    @ApiOperation(value = "插入品牌", notes = "添加品牌")
    @RequestMapping("save")
    public AxiosResult<Boolean> save(@RequestBody GdBrand brand) {
        GdBrand insert = gdBrandService.insert(brand);
        boolean b = false;
        if (insert != null) {
            b = true;
        }
        return toAxiosResult(b);
    }

    @ApiOperation(value = "删除品牌", notes = "删除品牌")
    @RequestMapping("delete/{id}")
    public AxiosResult<Boolean> delete(@PathVariable Integer id) {
        boolean b = gdBrandService.deleteById(id);
        return toAxiosResult(b);
    }

    @ApiOperation(value = "更新品牌", notes = "更新品牌")
    @RequestMapping("update")
    public AxiosResult<GdBrand> update(@RequestBody GdBrand brand) {
        GdBrand gdBrand = gdBrandService.updateByBrandId(brand);
        if (gdBrand == null) {
            return AxiosResult.error();
        }
        return AxiosResult.success(gdBrand);
    }


    @RequestMapping("allProduct")
    public AxiosResult<List<GdBrand>> AllProduct() {
        List<GdBrand> gdBrands = gdBrandService.queryAllByLimit();
        return AxiosResult.success(gdBrands);
    }

}