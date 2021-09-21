package com.javasm.salesupply.controller;

import com.javasm.salesupply.common.http.AxiosResult;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.controller.base.BaseController;
import com.javasm.salesupply.domain.criteria.Good2giftCriteria;
import com.javasm.salesupply.domain.entity.GdGood2gift;
import com.javasm.salesupply.domain.vo.Good2giftVO;
import com.javasm.salesupply.service.GdGood2giftService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (GdGood2gift)表控制层
 *
 * @author makejava
 * @since 2021-07-15 23:30:04
 */
@RestController
@RequestMapping("gdGood2gift")
public class GdGood2giftController extends BaseController {
    /**
     * 服务对象
     */
    @Resource
    private GdGood2giftService gdGood2giftService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public GdGood2gift selectOne(Integer id) {
        return this.gdGood2giftService.queryById(id);
    }

    @RequestMapping("add")
    public AxiosResult<GdGood2gift> add(@RequestBody GdGood2gift gdGood2gift) {
        GdGood2gift insert = gdGood2giftService.insert(gdGood2gift);
        return AxiosResult.success(insert);
    }


    /**
     * @author: chy
     * @Date: 分页查询 14:46
     * @Description:
     */
    @RequestMapping("searchPageByCriteria")
    public AxiosResult<PageResult<Good2giftVO>> searchPageByCriteria(Good2giftCriteria good2giftCriteria) {
        PageResult<Good2giftVO> productVOPageResult = gdGood2giftService.searchPageByCriteria(good2giftCriteria);
        return AxiosResult.success(productVOPageResult);
    }

    @RequestMapping("update")
    public AxiosResult<GdGood2gift> update(@RequestBody GdGood2gift gdGood2gift) {
        GdGood2gift update = gdGood2giftService.update(gdGood2gift);
        if (update != null) {
            return AxiosResult.success(update);
        }
        return AxiosResult.error();
    }

    @RequestMapping("delete/{id}")
    public AxiosResult<Boolean> delete(@PathVariable Integer id) {
        boolean b = gdGood2giftService.deleteById(id);
        return toAxiosResult(b);
    }
}