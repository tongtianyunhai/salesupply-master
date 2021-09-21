package com.javasm.salesupply.controller;


import com.javasm.salesupply.common.http.AxiosResult;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.GodownCriteria;
import com.javasm.salesupply.domain.entity.SpChangegoods;
import com.javasm.salesupply.domain.entity.SpReturngoods;
import com.javasm.salesupply.domain.entity.SpReturnwarehouse;
import com.javasm.salesupply.domain.entity.StGodown;
import com.javasm.salesupply.service.StGodownService;
import com.javasm.salesupply.domain.vo.GodownVo;
import com.javasm.salesupply.transfer.GodownTransfer;
import com.sun.org.glassfish.external.probe.provider.annotations.ProbeParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author whl
 * @since 2021-07-14
 */
@RestController
@RequestMapping("/st_godown")
@Api("入库申请单管理")
public class StGodownController {

    @Autowired
    private StGodownService stGodownService;


    /**
     * 添加申请单
     * @param stGodown
     * @return
     */
    @ApiOperation(value = "添加申请入库单", notes = "添加申请入库单")
    @PostMapping("add")
    private AxiosResult add(StGodown stGodown){

        boolean add = stGodownService.add(stGodown);

        return AxiosResult.success(add);
    }

    @ApiOperation(value = "查找所有申请入库单", notes = "查找所有申请入库单")
    @GetMapping("findAll")
    private AxiosResult<PageResult<GodownVo>> findAll(GodownCriteria godownCriteria){

        System.out.println(godownCriteria.getCurrentPage());
        System.out.println(godownCriteria.getPageSize());

        PageResult<GodownVo> all = stGodownService.findAll(godownCriteria);

        return AxiosResult.success(all);
    }

    @ApiOperation(value = "根据id查找换货申请入库单", notes = "查找换货申请入库单")
    @GetMapping("findChangegoodsById")
    private AxiosResult<SpChangegoods> findChangegoods( Integer stOrderid){

        System.out.println(stOrderid);

        SpChangegoods changegoods = stGodownService.findChangegoods(stOrderid);

        return AxiosResult.success(changegoods);
    }

    @ApiOperation(value = "根据id查找退货申请入库单", notes = "查找退货申请入库单")
    @GetMapping("findReturngoodsById")

    private AxiosResult<SpReturngoods> findReturngoods(Integer stOrderid){
        System.out.println(stOrderid);

        SpReturngoods returngoods = stGodownService.findReturngoods(stOrderid);

        return  AxiosResult.success(returngoods);

    }

    @ApiOperation(value = "根据id查找返厂申请入库单", notes = "查找返厂申请入库单")
    @GetMapping("findrRturnwarehouseById")
    private AxiosResult<SpReturnwarehouse> findrRturnwarehouse(Integer stOrderid){
        System.out.println(stOrderid);
        SpReturnwarehouse spReturnwarehouse = stGodownService.findrRturnwarehouse(stOrderid);

        return  AxiosResult.success(spReturnwarehouse);

    }

    @ApiOperation(value = "根据id修改申请单状态", notes = "根据id修改申请单状态")
    @GetMapping("updateStatus")
    private AxiosResult updateStatus(StGodown stGodown){
        boolean b = stGodownService.updateStutas(stGodown);

        return  AxiosResult.success(b);

    }


    @PostMapping("addcheck")
    private AxiosResult addcheck(@RequestBody  GodownCriteria godownCriteria){

        boolean add = stGodownService.addcheck(godownCriteria);

        return AxiosResult.success(add);
    }


}
