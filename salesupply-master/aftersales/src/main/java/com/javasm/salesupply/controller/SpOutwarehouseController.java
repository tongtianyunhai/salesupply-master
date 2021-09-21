package com.javasm.salesupply.controller;

import com.javasm.salesupply.common.http.AxiosResult;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.controller.base.BaseController;
import com.javasm.salesupply.domain.criteria.SpAbnormalcomplaintCriteria;
import com.javasm.salesupply.domain.criteria.SpOutwarehouseCriteria;
import com.javasm.salesupply.domain.entity.SpAbnormalcomplaint;
import com.javasm.salesupply.domain.entity.SpOutwarehouse;
import com.javasm.salesupply.domain.vo.SpAbnormalcomplaintVo;
import com.javasm.salesupply.domain.vo.SpOutwarehouseVo;
import com.javasm.salesupply.service.SpAbnormalcomplaintService;
import com.javasm.salesupply.service.SpOutwarehouseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * @Author：戈李阳
 * @Version：1.0
 * @Date：2021/7/12-18:58
 * @Since:jdk1.8
 * @Description:TODO
 */
@RestController
@Api(value="spOutwarehouseController",description = "返厂出库申请单")
@RequestMapping("spOutwarehouse")

public class SpOutwarehouseController extends BaseController {

    @Autowired
    private SpOutwarehouseService spOutwarehouseService;

    @GetMapping("list")
    @ApiOperation(value = "查看返厂出库申请单",notes="查询所有返厂出库申请单")
    public AxiosResult<List<SpOutwarehouse>>findAll(){
        List<SpOutwarehouse> list=spOutwarehouseService.list();
        return AxiosResult.success(list);
    }


    @ApiOperation(value = "新建返厂出库申请单", notes = "添加返厂出库申请单")
    @PostMapping("save")
    public AxiosResult save(@RequestBody SpOutwarehouseCriteria spOutwarehouseCriteria){
        boolean save = spOutwarehouseService.addcheck(spOutwarehouseCriteria);
        return toAxiosResult(save);
    }


    @ApiOperation(value = "更新返厂出库申请单", notes = "更新返厂出库申请单")
    @PutMapping("update")
    public AxiosResult<Integer> update(@RequestBody SpOutwarehouse spOutwarehouse){
        int update = spOutwarehouseService.updateById(spOutwarehouse);
        return toAxiosResult(update);
    }


    @ApiOperation(value = "删除返厂出库申请单", notes = "删除返厂出库申请单")
    @DeleteMapping("delete/{id}")
    public  AxiosResult<Integer> update(@PathVariable Long id){

        int delete = spOutwarehouseService.deleteById(id);
        return toAxiosResult(delete);
    }

    @ApiOperation(value = "批量删除返厂出库申请单", notes = "批量删除返厂出库申请单")
    @DeleteMapping("batchDelete")
    public AxiosResult<Integer> batchDelete( @RequestParam List<Serializable> idList){
        int batchDeleteRow = spOutwarehouseService.batchDeleteByIdList(idList);
        return  toAxiosResult(batchDeleteRow);
    }

    @GetMapping("searchPageByCriteria")
    @ApiOperation(value = "查询返厂出库申请单", notes = "查询所有返厂出库申请单") //BrandCriteria 传递参数有五个 ，其中四个是公共的
    public AxiosResult<PageResult<SpOutwarehouseVo>> searchPageByCriteria(SpOutwarehouseCriteria spOutwarehouseCriteria){
        PageResult<SpOutwarehouseVo> spOutwarehouseVoPageResult = spOutwarehouseService.searchPageByCriteria(spOutwarehouseCriteria);
        System.out.println("asdasdaS"+spOutwarehouseVoPageResult);
        return AxiosResult.success(spOutwarehouseVoPageResult);
    }

}
