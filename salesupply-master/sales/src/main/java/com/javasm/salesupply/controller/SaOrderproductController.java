package com.javasm.salesupply.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.javasm.salesupply.common.http.AxiosResult;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.controller.base.BaseController;
import com.javasm.salesupply.criteria.SaOrderproductCriteria;
import com.javasm.salesupply.domain.entity.SaOrderproduct;
import com.javasm.salesupply.service.SaOrderproductService;
import com.javasm.salesupply.vo.SaOrderproductVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wq
 * @since 2021-07-12
 */
@RestController
@Api(value="saOrderproduct",description = "销售商品管理")
@RequestMapping("saOrderproduct")
public class SaOrderproductController extends BaseController {

        @Autowired
        private SaOrderproductService saOrderproductService;

    @GetMapping("list")
    @ApiOperation(value = "查看特殊申诉订单",notes="查询所有特殊申诉订单")
    public AxiosResult<List<SaOrderproduct>>findAll(){
        List<SaOrderproduct> list=saOrderproductService.list();
        return AxiosResult.success(list);
    }



    @GetMapping("findById")
    @ApiOperation(value = "查看特殊申诉订单",notes="查询所有特殊申诉订单")
    public  AxiosResult<SaOrderproduct> search(@RequestParam("id") Integer id){

        SaOrderproduct saOrderproduct=saOrderproductService.findById(id);
        return AxiosResult.success(saOrderproduct);
    }
    @GetMapping("findByOrderId")
    @ApiOperation(value = "查看商品详情",notes="通过orderid查看商品详情")
    public AxiosResult<List<SaOrderproduct>> findByOrderId(Integer orderId){
        QueryWrapper<SaOrderproduct> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("order_Id", orderId);
        List<SaOrderproduct> list = saOrderproductService.search(queryWrapper);
        return AxiosResult.success(list);
    }


    @GetMapping("searchPageByCriteria")
    @ApiOperation(value = "查询销售产品信息", notes = "查询所有销售产品信息") //BrandCriteria 传递参数有五个 ，其中四个是公共的
    public AxiosResult<PageResult<SaOrderproductVo>> searchPageByCriteria(SaOrderproductCriteria saOrderproductCriteria){
        PageResult<SaOrderproductVo> saOrderproductVoPageResult = saOrderproductService.searchPageByCriteria(saOrderproductCriteria);
        System.out.println("asdasdaS"+saOrderproductVoPageResult);
        return AxiosResult.success(saOrderproductVoPageResult);
    }

}
