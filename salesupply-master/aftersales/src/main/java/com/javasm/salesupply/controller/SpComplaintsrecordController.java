package com.javasm.salesupply.controller;

import com.javasm.salesupply.common.http.AxiosResult;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.controller.base.BaseController;
import com.javasm.salesupply.domain.criteria.SpChangegoodsCriteria;
import com.javasm.salesupply.domain.criteria.SpComplaintsrecordCriteria;
import com.javasm.salesupply.domain.entity.SpAbnormalcomplaint;
import com.javasm.salesupply.domain.entity.SpComplaintsrecord;
import com.javasm.salesupply.domain.vo.SpChangegoodsVo;
import com.javasm.salesupply.domain.vo.SpComplaintsrecordVo;
import com.javasm.salesupply.service.SpAbnormalcomplaintService;
import com.javasm.salesupply.service.SpComplaintsrecordService;
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
@Api(value="spComplaintsrecordController",description = "普通申诉单管理")
@RequestMapping("spComplaintsrecord")



public class SpComplaintsrecordController extends BaseController {

    @Autowired
    private SpComplaintsrecordService spComplaintsrecordService;

    @GetMapping("list")
    @ApiOperation(value = "查看普通申诉单",notes="查询所有普通申诉单")
    public AxiosResult<List<SpComplaintsrecord>>findAll(){
        List<SpComplaintsrecord> list=spComplaintsrecordService.list();
        return AxiosResult.success(list);
    }

    @ApiOperation(value = "新建普通申诉单", notes = "添加普通申诉单")
    @PostMapping("save")
    public AxiosResult save(@RequestBody SpComplaintsrecordCriteria spComplaintsrecordCriteria){
        Boolean save = spComplaintsrecordService.addcheck(spComplaintsrecordCriteria);
        return toAxiosResult(save);
    }

    @ApiOperation(value = "更新普通申诉单", notes = "更新普通申诉单")
    @PutMapping("update")
    public AxiosResult<Integer> update(@RequestBody SpComplaintsrecord spComplaintsrecord){
        int update = spComplaintsrecordService.updateById(spComplaintsrecord);
        return toAxiosResult(update);
    }


    @ApiOperation(value = "删除普通申诉单", notes = "删除普通申诉单")
    @DeleteMapping("delete/{id}")
    public  AxiosResult<Integer> update(@PathVariable Long id){

        int delete = spComplaintsrecordService.deleteById(id);
        return toAxiosResult(delete);
    }

    @ApiOperation(value = "批量删除普通申诉单", notes = "批量删除普通申诉单")
    @DeleteMapping("batchDelete")
    public AxiosResult<Integer> batchDelete( @RequestParam List<Serializable> idList){
        int batchDeleteRow = spComplaintsrecordService.batchDeleteByIdList(idList);
        return  toAxiosResult(batchDeleteRow);
    }

    @GetMapping("searchPageByCriteria")
    @ApiOperation(value = "分页查询普通申诉单", notes = "分页查询所有普通申诉单") //BrandCriteria 传递参数有五个 ，其中四个是公共的
    public AxiosResult<PageResult<SpComplaintsrecordVo>> searchPageByCriteria(SpComplaintsrecordCriteria spComplaintsrecordCriteria){
        PageResult<SpComplaintsrecordVo> spComplaintsrecordVoPageResult = spComplaintsrecordService.searchPageByCriteria(spComplaintsrecordCriteria);
        System.out.println("4396"+spComplaintsrecordVoPageResult);
        return AxiosResult.success(spComplaintsrecordVoPageResult);
    }


}
