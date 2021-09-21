package com.javasm.salesupply.controller;

import com.javasm.salesupply.common.http.AxiosResult;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.controller.base.BaseController;
import com.javasm.salesupply.domain.criteria.GoodsInfoCriteria;
import com.javasm.salesupply.domain.criteria.SpChangegoodsCriteria;
import com.javasm.salesupply.domain.entity.SpChangegoods;
import com.javasm.salesupply.domain.vo.GoodsInfoVo;
import com.javasm.salesupply.domain.vo.SpChangegoodsVo;
import com.javasm.salesupply.service.SpChangegoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * @Author：戈李阳
 * @Version：1.0
 * @Date：2021/7/12-18:57
 * @Since:jdk1.8
 * @Description:TODO
 */


@RestController
@Api(value="spChangegoodsController",description = "换货申请单管理")
@RequestMapping("spChangegoods")

public class SpChangegoodsController extends BaseController {


    @Autowired
    private SpChangegoodsService spChangegoodsService;

    @GetMapping("list")
    @ApiOperation(value = "查看换货申请单",notes="查询所有换货申请单")
    public AxiosResult<List<SpChangegoods>>findAll(){
        List<SpChangegoods> list=spChangegoodsService.list();
        return AxiosResult.success(list);
    }




    @ApiOperation(value = "新建换货申请单", notes = "添加换货申请单")
    @PostMapping("save")
    public AxiosResult save(@RequestBody SpChangegoodsCriteria spChangegoodsCriteria){
        Boolean save = spChangegoodsService.addcheck(spChangegoodsCriteria);
        return toAxiosResult(save);
    }

    @ApiOperation(value = "更新换货申请单", notes = "更新换货申请单")
    @PutMapping("update")
    public AxiosResult<Integer> update(@RequestBody SpChangegoods spChangegoods){
        int update = spChangegoodsService.updateById(spChangegoods);
        return toAxiosResult(update);
    }


    @ApiOperation(value = "删除换货申请单", notes = "删除换货申请单单")
    @DeleteMapping("delete/{id}")
    public  AxiosResult<Integer> update(@PathVariable Long id){

        int delete =spChangegoodsService.deleteById(id);
        return toAxiosResult(delete);
    }

    @ApiOperation(value = "批量删除换货申请单", notes = "批量删除换货申请单")
    @DeleteMapping("batchDelete")
    public AxiosResult<Integer> batchDelete( @RequestParam List<Serializable> idList){
        int batchDeleteRow = spChangegoodsService.batchDeleteByIdList(idList);
        return  toAxiosResult(batchDeleteRow);
    }


    @GetMapping("searchPageByCriteria")
    @ApiOperation(value = "分页查询换货申请单", notes = "分页查询所有换货申请单") //BrandCriteria 传递参数有五个 ，其中四个是公共的
    public AxiosResult<PageResult<SpChangegoodsVo>> searchPageByCriteria(SpChangegoodsCriteria spChangegoodsCriteria){
        PageResult<SpChangegoodsVo> spChangegoodsVoPageResult = spChangegoodsService.searchPageByCriteria(spChangegoodsCriteria);
        System.out.println("4396"+spChangegoodsVoPageResult);
        return AxiosResult.success(spChangegoodsVoPageResult);
    }



    @GetMapping("searchPageBygoodsname")
    @ApiOperation(value = "分页查询商品信息", notes = "分页查询所有商品信息") //BrandCriteria 传递参数有五个 ，其中四个是公共的
    public AxiosResult<PageResult<GoodsInfoVo>> searchPageByCriteria(GoodsInfoCriteria goodsInfoCriteria){
        PageResult<GoodsInfoVo> goodsInfoVoPageResult = spChangegoodsService.searchPageBygoodsname(goodsInfoCriteria);
        System.out.println("4396"+goodsInfoVoPageResult);
        return AxiosResult.success(goodsInfoVoPageResult);
    }


}
