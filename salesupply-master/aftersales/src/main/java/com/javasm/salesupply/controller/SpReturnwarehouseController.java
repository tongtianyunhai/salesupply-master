package com.javasm.salesupply.controller;

import com.javasm.salesupply.common.http.AxiosResult;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.controller.base.BaseController;


import com.javasm.salesupply.domain.criteria.SpReturngoodsCriteria;
import com.javasm.salesupply.domain.criteria.SpReturnwarehouseCriteria;
import com.javasm.salesupply.domain.entity.SpReturnwarehouse;
import com.javasm.salesupply.domain.vo.SpReturngoodsVo;
import com.javasm.salesupply.domain.vo.SpReturnwarehouseVo;
import com.javasm.salesupply.service.SpReturnwarehouseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * @Author：戈李阳
 * @Version：1.0
 * @Date：2021/7/12-19:00
 * @Since:jdk1.8
 * @Description:TODO
 */
@RestController
@Api(value = "spReturnwarehouseController", description = "返厂入库申请单")
@RequestMapping("spReturnwarehouse")


public class SpReturnwarehouseController extends BaseController {

    @Autowired
    private SpReturnwarehouseService spReturnwarehouseService;

    @GetMapping("list")
    @ApiOperation(value = "查看返厂入库申请单", notes = "查询所有返厂入库申请单")
    public AxiosResult<List<SpReturnwarehouse>> findAll() {
        List<SpReturnwarehouse> list=spReturnwarehouseService.list();
        return AxiosResult.success(list);
    }

    @ApiOperation(value = "新建返厂入库申请单", notes = "添加返厂入库申请单")
    @PostMapping("save")
    public AxiosResult save(@RequestBody SpReturnwarehouseCriteria spReturnwarehouseCriteria) {
        boolean save = spReturnwarehouseService.addcheck(spReturnwarehouseCriteria);
        return toAxiosResult(save);
    }

    @ApiOperation(value = "更新返厂入库申请单", notes = "更新返厂入库申请单")
    @PutMapping("update")
    public AxiosResult<Integer> update(@RequestBody SpReturnwarehouse spReturnwarehouse) {
        int update = spReturnwarehouseService.updateById(spReturnwarehouse);
        return toAxiosResult(update);
    }


    @ApiOperation(value = "删除返厂入库申请单", notes = "删除返厂入库申请单")
    @DeleteMapping("delete/{id}")
    public AxiosResult<Integer> update(@PathVariable Long id) {

        int delete = spReturnwarehouseService.deleteById(id);
        return toAxiosResult(delete);
    }

    @ApiOperation(value = "批量删除返厂入库申请单", notes = "批量删除返厂入库申请单")
    @DeleteMapping("batchDelete")
    public AxiosResult<Integer> batchDelete(@RequestParam List<Serializable> idList) {
        int batchDeleteRow = spReturnwarehouseService.batchDeleteByIdList(idList);
        return toAxiosResult(batchDeleteRow);
    }

    @GetMapping("searchPageByCriteria")
    @ApiOperation(value = "分页查询返厂入库申请单", notes = "分页查询所有返厂入库申请单") //BrandCriteria 传递参数有五个 ，其中四个是公共的
    public AxiosResult<PageResult<SpReturnwarehouseVo>> searchPageByCriteria(SpReturnwarehouseCriteria spReturnwarehouseCriteria){
        PageResult<SpReturnwarehouseVo> spReturnwarehouseVoPageResult = spReturnwarehouseService.searchPageByCriteria(spReturnwarehouseCriteria);
        System.out.println("asdasdaS"+spReturnwarehouseVoPageResult);
        return AxiosResult.success(spReturnwarehouseVoPageResult);
    }

}
