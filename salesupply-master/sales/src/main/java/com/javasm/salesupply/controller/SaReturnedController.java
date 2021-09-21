package com.javasm.salesupply.controller;


import com.javasm.salesupply.common.http.AxiosResult;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.criteria.SaReturnedCriteria;
import com.javasm.salesupply.domain.entity.SaReturned;
import com.javasm.salesupply.service.SaReturnedService;
import com.javasm.salesupply.vo.SaReturnedVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wq
 * @since 2021-07-12
 */
@RestController
@RequestMapping("/salesupply/sa-returned")

public class SaReturnedController {
    @Autowired
    private SaReturnedService saReturnedService;
    /**
     * 条件查询
     * @param
     * @return
     */
    @GetMapping("searchPageByCriteria")
    @ApiOperation(value = "退货单", notes = "条件查询退货单")
    public AxiosResult<PageResult<SaReturnedVo>> searchPageByCriteria(SaReturnedCriteria saReturnedCriteria){
        PageResult<SaReturnedVo> orderVoPageResult = saReturnedService.searchPageByCriteria(saReturnedCriteria);

        return AxiosResult.success(orderVoPageResult);
    }
    @GetMapping("returnedInfoFindById")
    @ApiOperation(value = "退货单详情",notes="查询退货单详情")
    public  AxiosResult<SaReturned> returnedInfoFindById(Integer returnedId){
        SaReturned byId = saReturnedService.findById(returnedId);

        return AxiosResult.success(byId);
    }
}
