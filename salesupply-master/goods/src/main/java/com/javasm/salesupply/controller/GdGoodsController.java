package com.javasm.salesupply.controller;

import com.javasm.salesupply.common.http.AxiosResult;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.controller.base.BaseController;
import com.javasm.salesupply.domain.criteria.GoodsCriteria;
import com.javasm.salesupply.domain.entity.GdGoods;
import com.javasm.salesupply.domain.vo.GoodsVO;
import com.javasm.salesupply.service.GdGoodsService;
import com.javasm.salesupply.util.EncodeGenerator;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (GdGoods)表控制层
 *
 * @author makejava
 * @since 2021-07-14 17:12:58
 */
@RestController
@RequestMapping("gdGoods")
public class GdGoodsController extends BaseController {
    /**
     * 服务对象
     */
    @Resource
    private GdGoodsService gdGoodsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public GdGoods selectOne(Integer id) {
        return this.gdGoodsService.queryById(id);
    }


    @RequestMapping("addGoods")
    public AxiosResult<GdGoods> addGoods(@RequestBody GdGoods gdGoods) {
        //编码判空
        if (StringUtils.isEmpty(gdGoods.getGoodsEncode())) {
            gdGoods.setGoodsEncode(EncodeGenerator.encodeGenerator());
        }
        GdGoods insert = gdGoodsService.insert(gdGoods);
        return AxiosResult.success(insert);
    }

    /**
     *  查询产品颜色list
     * @return
     */
    @RequestMapping("findColors")
    public AxiosResult<List<GdGoods>> findGiftColorList(){
        List<GdGoods> giftColorList = gdGoodsService.findGoodsColorList();
        return AxiosResult.success(giftColorList);
    }

    /**
     *  @author: chy
     *  @Date: 分页查询 14:46
     *  @Description:
     */
    @RequestMapping("searchPageByCriteria")
    public AxiosResult<PageResult<GoodsVO>> searchPageByCriteria(GoodsCriteria goodsCriteria) {
        PageResult<GoodsVO> productVOPageResult = gdGoodsService.searchPageByCriteria(goodsCriteria);
        return AxiosResult.success(productVOPageResult);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @ApiOperation(value = "删除品牌", notes = "删除品牌")
    @RequestMapping("delete/{id}")
    public AxiosResult<Boolean> delete(@PathVariable Integer id) {
        boolean b = gdGoodsService.deleteById(id);
        return toAxiosResult(b);
    }
    /**
     * 删除
     * @param gdGoods
     * @return
     */
    @ApiOperation(value = "删除品牌", notes = "删除品牌")
    @RequestMapping("update")
    public AxiosResult<GdGoods> update(@RequestBody GdGoods gdGoods) {
        GdGoods update = gdGoodsService.update(gdGoods);
        return AxiosResult.success(update);
    }
}