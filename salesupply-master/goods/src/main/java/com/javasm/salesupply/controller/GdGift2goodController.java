package com.javasm.salesupply.controller;

import com.javasm.salesupply.common.http.AxiosResult;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.GdGift2GoodCriteria;
import com.javasm.salesupply.domain.entity.GdGift2good;
import com.javasm.salesupply.domain.entity.GtGift;
import com.javasm.salesupply.domain.vo.EditgdGift2goodVO;
import com.javasm.salesupply.domain.vo.GdGift2goodVO;
import com.javasm.salesupply.service.GdGift2goodService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 赠品转商品
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */
@RestController
@RequestMapping("gdGift2good")
public class GdGift2goodController {
    /**
     * 服务对象
     */
    @Resource
    private GdGift2goodService gdGift2goodService;


    /**
     *  根据条件模糊查询 分页显示
     *
     * @param gdGift2GoodCriteria
     * @return
     */
    @RequestMapping("findAll")
    @ResponseBody
    public AxiosResult<PageResult<GdGift2goodVO>> findAll(@RequestBody GdGift2GoodCriteria gdGift2GoodCriteria){

        PageResult<GdGift2goodVO> gdGift2goodVOPageResult = gdGift2goodService.selectByParams(gdGift2GoodCriteria);
        return AxiosResult.success(gdGift2goodVOPageResult);
    }

    /**
     *  添加数据到giftToGood
     * @param gdGift2good
     * @return
     */
    @RequestMapping("addGdGift2good")
    @ResponseBody
    public AxiosResult<Integer> addGifttoGood(@RequestBody GdGift2good gdGift2good){

        //System.out.println("======"+gdGift2good.getGiftId());

        Integer insert = gdGift2goodService.insert(gdGift2good);

        Integer giftId = gdGift2good.getGiftId();
        int i = gdGift2goodService.insert1(giftId);

        int num = insert + i;
        return AxiosResult.success(num);
    }

    /**
     *  修改数据 giftToGood
     * @param gdGift2good
     * @return
     */
    @RequestMapping("editGdGift2good")
    @ResponseBody
    public AxiosResult<Integer> editGdGift2good(@RequestBody GdGift2good gdGift2good){
        int update = gdGift2goodService.update(gdGift2good);
        return AxiosResult.success(update);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    @ResponseBody
    public GdGift2good selectOne(Integer id) {
        return this.gdGift2goodService.queryById(id);
    }

    /**
     *  删除
     *
     * @param id
     * @return
     */
    @RequestMapping("del")
    @ResponseBody
    public AxiosResult<Integer> deleteGiftToGood(Integer id){
        Integer integer = this.gdGift2goodService.deleteById(id);
        return AxiosResult.success(integer);
    }

    /**
     *  根据主键 findOneByRemark1 查询对应数据
     *
     * @param id
     * @return
     */
    @RequestMapping("findOneByRemark1")
    @ResponseBody
    public AxiosResult<EditgdGift2goodVO> selectOneByRemark1(Integer id){
        EditgdGift2goodVO editgdGift2goodVO = this.gdGift2goodService.selectOneByRemark1(id);
        return AxiosResult.success(editgdGift2goodVO);
    }




}