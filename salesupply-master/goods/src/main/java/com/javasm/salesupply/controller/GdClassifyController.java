package com.javasm.salesupply.controller;

import com.javasm.salesupply.common.http.AxiosResult;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.controller.base.BaseController;
import com.javasm.salesupply.domain.criteria.ClassifyCriteria;
import com.javasm.salesupply.domain.entity.GdClassify;
import com.javasm.salesupply.domain.vo.ClassifyVO;
import com.javasm.salesupply.service.GdClassifyService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (GdClassify)表控制层
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */
@RestController
@RequestMapping("gdClassify")
public class GdClassifyController extends BaseController {
    /**
     * 服务对象
     */
    @Resource
    private GdClassifyService gdClassifyService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public GdClassify selectOne(Integer id) {
        return this.gdClassifyService.queryById(id);
    }

    /**
     *  @author: chy
     *  @Date: 一级目录 14:44
     *  @Description:
     */ 
    @RequestMapping("primaryClassification")
    public AxiosResult<List<GdClassify>> primaryClassification(){
       return AxiosResult.success(gdClassifyService.primaryClassification());
    }

    /**
     *  @author: chy
     *  @Date: 二级目录 14:44
     *  @Description:
     */ 
    @RequestMapping("secondLevelDirectory/{classifyId}")
    public AxiosResult<List<GdClassify>> secondLevelDirectory(@PathVariable Integer classifyId){
       return AxiosResult.success(gdClassifyService.secondLevelDirectory(classifyId));
    }
    
    /**
     *  @author: chy
     *  @Date: 分页查询 14:46
     *  @Description:
     */ 
    @RequestMapping("searchPageByCriteria")
    public AxiosResult<PageResult<ClassifyVO>> searchPageByCriteria(ClassifyCriteria classifyCriteria) {
        PageResult<ClassifyVO> classifyVOPageResult = gdClassifyService.searchPageByCriteria(classifyCriteria);
        return AxiosResult.success(classifyVOPageResult);
    }


    @ApiOperation(value = "插入分类", notes = "添加分类")
    @RequestMapping("save")
    public AxiosResult<Boolean> save(@RequestBody GdClassify classify) {
        GdClassify insert = gdClassifyService.insert(classify);
        boolean b = false;
        if (insert != null) {
            b = true;
        }
        return toAxiosResult(b);
    }




    @ApiOperation(value = "更新分类", notes = "更新分类")
    @RequestMapping("update")
    public AxiosResult<GdClassify> update(@RequestBody GdClassify classify) {
        GdClassify update = gdClassifyService.update(classify);
        if (update == null) {
            return AxiosResult.error();
        }
        return AxiosResult.success(update);
    }


    @ApiOperation(value = "删除分类", notes = "删除分类")
    @RequestMapping("delete/{id}")
    public AxiosResult<Boolean> delete(@PathVariable Integer id) {
        boolean b = gdClassifyService.deleteById(id);
        return toAxiosResult(b);
    }


    /**
     *  查询产品颜色list
     * @return
     */
    @RequestMapping("findClassifies")
    @ResponseBody
    public AxiosResult<List<GdClassify>> findClassifies(){
        List<GdClassify> gdClassifies = gdClassifyService.queryAllByLimit();
        return AxiosResult.success(gdClassifies);
    }

}