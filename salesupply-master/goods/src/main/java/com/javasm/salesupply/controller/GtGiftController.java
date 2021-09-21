package com.javasm.salesupply.controller;

import com.javasm.salesupply.common.http.AxiosResult;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.controller.base.BaseController;
import com.javasm.salesupply.domain.entity.GdBrand;
import com.javasm.salesupply.domain.entity.GdClassify;
import com.javasm.salesupply.domain.entity.GtGift;
import com.javasm.salesupply.domain.vo.GtGiftVO;
import com.javasm.salesupply.service.GtGiftService;
import com.javasm.salesupply.domain.criteria.GtGiftCriteria;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (GtGift)表控制层
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */
@Controller
@RequestMapping("gtGift")
public class GtGiftController extends BaseController {
    /**
     * 服务对象
     */
    @Resource
    private GtGiftService gtGiftService;


    /**
     * 赠品的添加
     *
     * @return
     */
    @RequestMapping("add")
    @ResponseBody
    public AxiosResult<Integer> addGift(@RequestBody GtGift gtGift){
        Integer insert = this.gtGiftService.insert(gtGift);
        return  toAxiosResult(insert);
    }

    /**
     * 根据条件 模糊查询
     * 查找所有的赠品list
     *
     * @return
     */
    @RequestMapping("findByParams")
    @ResponseBody
    public AxiosResult<PageResult<GtGiftVO>> findAllGift(GtGiftCriteria gtGiftCriteria){
        PageResult<GtGiftVO> gtGiftVOPageResult = gtGiftService.selectByParams(gtGiftCriteria);
        return AxiosResult.success(gtGiftVOPageResult);
    }
    /**
     * 根据条件 模糊查询
     * 查找所有的赠品list
     *
     * @return
     */
    @RequestMapping("findByParam")
    @ResponseBody
    public AxiosResult<PageResult<GtGiftVO>> findGifts(@RequestBody GtGiftCriteria gtGiftCriteria){

        PageResult<GtGiftVO> gtGiftVOPageResult = gtGiftService.selectByParams(gtGiftCriteria);
        return AxiosResult.success(gtGiftVOPageResult);
    }

    /**
     * 修改赠品属性
     * @param gtGift
     * @return
     */
    @RequestMapping("update")
    @ResponseBody
    public AxiosResult<Integer> updateGift(@RequestBody GtGift gtGift){
        System.out.println("=========="+gtGift.getGiftId());
        return this.gtGiftService.update(gtGift);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param giftId 主键
     * @return 单条数据
     */
    @RequestMapping("getGiftById")
    @ResponseBody
    public AxiosResult<GtGift> selectOne(Integer giftId) {
        return gtGiftService.queryById(giftId);
    }

//    /**
//     *  查询商品品牌list
//     * @return
//     */
//    @RequestMapping("findBrands")
//    @ResponseBody
//    public AxiosResult<List<GdBrand>> findGdBrandList(){
//        List<GdBrand> gdBrands = gtGiftService.selectAllGdBrand();
//        return AxiosResult.success(gdBrands);
//    }
//    /**
//     *  查询商品类型list
//     * @return
//     */
//    @RequestMapping("findTypes")
//    @ResponseBody
//    public AxiosResult<List<GdClassify>> findGdClassifyList(){
//        List<GdClassify> gdClassify = gtGiftService.selectAllGdClassify();
//        return AxiosResult.success(gdClassify);
//    }
//}
    /**
     *  查询赠品类型list
     * @return
     */
    @RequestMapping("findTypes")
    @ResponseBody
    public AxiosResult<List<GtGift>> findGdClassifyList(){
        List<GtGift> gtGiftList = gtGiftService.selectAllGtClassify();
        return AxiosResult.success(gtGiftList);
    }
    /**
     *  查询赠品品牌list
     * @return
     */
    @RequestMapping("findBrands")
    @ResponseBody
    public AxiosResult<List<GtGift>> findGtBrandList(){
        List<GtGift> gtGiftList = gtGiftService.selectAllGtBrand();
        return AxiosResult.success(gtGiftList);
    }

    /**
     *  查询赠品颜色list
     * @return
     */
    @RequestMapping("findColors")
    @ResponseBody
    public AxiosResult<List<GtGift>> findGiftColorList(){
        List<GtGift> gtGiftList = gtGiftService.selectAllGiftColor();
        return AxiosResult.success(gtGiftList);
    }

    /**
     *  删除Gift
     *
     * @return
     */
    @RequestMapping("delete")
    @ResponseBody
    public AxiosResult<Integer> deleteGift(Integer giftId){
        Integer integer = gtGiftService.deleteById(giftId);
        return toAxiosResult(integer);
    }


    @RequestMapping("findAll")
    @ResponseBody
    public AxiosResult<List<GtGift>> findAllGift(){
        List<GtGift> gtGiftList = gtGiftService.selectAllGift();
        return AxiosResult.success(gtGiftList);
    }

}