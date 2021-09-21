package com.javasm.salesupply.controller;

import com.javasm.salesupply.common.http.AxiosResult;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.controller.base.BaseController;
import com.javasm.salesupply.domain.criteria.SpAbnormalcomplaintCriteria;
import com.javasm.salesupply.domain.criteria.SpReturngoodsCriteria;
import com.javasm.salesupply.domain.entity.SpAbnormalcomplaint;
import com.javasm.salesupply.domain.entity.SpReturngoods;
import com.javasm.salesupply.domain.vo.SpAbnormalcomplaintVo;
import com.javasm.salesupply.domain.vo.SpReturngoodsVo;
import com.javasm.salesupply.service.SpAbnormalcomplaintService;
import com.javasm.salesupply.service.SpReturngoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * @Author：戈李阳
 * @Version：1.0
 * @Date：2021/7/12-18:59
 * @Since:jdk1.8
 * @Description:TODO
 */

@RestController

@RequestMapping("spReturngoods")


public class SpReturngoodsController extends BaseController {


    @Autowired
    private SpReturngoodsService spReturngoodsService;

    @GetMapping("list")
    @ApiOperation(value = "查看退货申请单",notes="查询所有退货申请单")
    public AxiosResult<List<SpReturngoods>>findAll(){
        List<SpReturngoods> list=spReturngoodsService.list();
        return AxiosResult.success(list);
    }


    @ApiOperation(value = "新建退货申请单", notes = "添加退货申请单")
    @PostMapping("save")
    public AxiosResult addcheck(@RequestBody SpReturngoodsCriteria spReturngoodsCriteria){
        boolean save = spReturngoodsService.addcheck(spReturngoodsCriteria);
        return toAxiosResult(save);
    }

    @ApiOperation(value = "更新退货申请单", notes = "更新退货申请单")
    @PutMapping("update")
    public AxiosResult<Integer> update(@RequestBody SpReturngoods spReturngoods){
        int update = spReturngoodsService.updateById(spReturngoods);
        return toAxiosResult(update);
    }


    @ApiOperation(value = "删除退货申请单", notes = "删除退货申请单")
    @DeleteMapping("delete/{id}")
    public  AxiosResult<Integer> update(@PathVariable Long id){

        int delete = spReturngoodsService.deleteById(id);
        return toAxiosResult(delete);
    }

    @ApiOperation(value = "批量删除退货申请单", notes = "批量删除退货申请单")
    @DeleteMapping("batchDelete")
    public AxiosResult<Integer> batchDelete( @RequestParam List<Serializable> idList){
        int batchDeleteRow = spReturngoodsService.batchDeleteByIdList(idList);
        return  toAxiosResult(batchDeleteRow);
    }
    @GetMapping("searchPageByCriteria")
    @ApiOperation(value = "分页查询退货申请单", notes = "分页查询所有退货申请单") //BrandCriteria 传递参数有五个 ，其中四个是公共的
    public AxiosResult<PageResult<SpReturngoodsVo>> searchPageByCriteria(SpReturngoodsCriteria spReturngoodsCriteria){
        PageResult<SpReturngoodsVo> spReturngoodsVoPageResult = spReturngoodsService.searchPageByCriteria(spReturngoodsCriteria);
        System.out.println("asdasdaS"+spReturngoodsVoPageResult);
        return AxiosResult.success(spReturngoodsVoPageResult);
    }
}
