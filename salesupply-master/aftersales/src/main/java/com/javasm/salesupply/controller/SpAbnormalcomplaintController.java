package com.javasm.salesupply.controller;

import com.javasm.salesupply.common.http.AxiosResult;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.controller.base.BaseController;
import com.javasm.salesupply.domain.criteria.SpAbnormalcomplaintCriteria;
import com.javasm.salesupply.domain.entity.SpAbnormalcomplaint;
import com.javasm.salesupply.domain.entity.StGodown;
import com.javasm.salesupply.domain.vo.SpAbnormalcomplaintVo;
import com.javasm.salesupply.service.SpAbnormalcomplaintService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * @Author：戈李阳
 * @Version：1.0
 * @Date：2021/7/12-15:42
 * @Since:jdk1.8
 * @Description:TODO
 */
@RestController
@Api(value="spAbnormalcomplaintController",description = "特殊申诉单管理")
@RequestMapping("spAbnormalcomplaint")

public class SpAbnormalcomplaintController extends BaseController {

    /**
     *
     */
    @Autowired
    private SpAbnormalcomplaintService spAbnormalcomplaintService;

    @GetMapping("list")
    @ApiOperation(value = "查看特殊申诉订单",notes="查询所有特殊申诉订单")
    public AxiosResult<List<SpAbnormalcomplaint>>findAll(){
        List<SpAbnormalcomplaint> list=spAbnormalcomplaintService.list();
        return AxiosResult.success(list);
    }
    @ApiOperation(value = "新建特殊申诉订单", notes = "添加特殊申诉订单")
    @PostMapping("save")
    public AxiosResult<Integer> save(@RequestBody SpAbnormalcomplaint spAbnormalcomplaint){
        int save = spAbnormalcomplaintService.save(spAbnormalcomplaint);

        return toAxiosResult(save);
    }

    @ApiOperation(value = "更新特殊申诉订单", notes = "更新特殊申诉订单")
    @PutMapping("update")
    public AxiosResult<Integer> update(@RequestBody SpAbnormalcomplaint spAbnormalcomplaint){
        int update = spAbnormalcomplaintService.updateById(spAbnormalcomplaint);
        StGodown stGodown = new StGodown();

        return toAxiosResult(update);
    }


    @ApiOperation(value = "删除特殊申诉订单", notes = "删除特殊申诉订单")
    @DeleteMapping("delete/{id}")
    public  AxiosResult<Integer> update(@PathVariable Long id){

        int delete = spAbnormalcomplaintService.deleteById(id);
        return toAxiosResult(delete);
    }

    @ApiOperation(value = "批量删除特殊申诉订单", notes = "批量删除特殊申诉订单")
    @DeleteMapping("batchDelete")
    public AxiosResult<Integer> batchDelete( @RequestParam List<Serializable> idList){
        int batchDeleteRow = spAbnormalcomplaintService.batchDeleteByIdList(idList);
        return  toAxiosResult(batchDeleteRow);
    }


    @GetMapping("searchPageByCriteria")
    @ApiOperation(value = "查询特殊申诉订单", notes = "查询所有特殊申诉订单") //BrandCriteria 传递参数有五个 ，其中四个是公共的
    public AxiosResult<PageResult<SpAbnormalcomplaintVo>> searchPageByCriteria(SpAbnormalcomplaintCriteria spAbnormalcomplaintCriteria){
        PageResult<SpAbnormalcomplaintVo> spAbnormalcomplaintVoPageResult = spAbnormalcomplaintService.searchPageByCriteria(spAbnormalcomplaintCriteria);
        System.out.println("asdasdaS"+spAbnormalcomplaintVoPageResult);
        return AxiosResult.success(spAbnormalcomplaintVoPageResult);
    }
}
