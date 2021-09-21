package com.javasm.salesupply.controller;


import com.javasm.salesupply.common.http.AxiosResult;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.AftersaleInstoreCriteria;
import com.javasm.salesupply.domain.entity.StAftersaleInstore;
import com.javasm.salesupply.domain.vo.StAftersaleInstoreVo;
import com.javasm.salesupply.service.StAftersaleInstoreService;
import com.javasm.salesupply.service.impl.StAftersaleInstoreServiceImpl;
import com.javasm.salesupply.service.impl.StGodownServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author whl
 * @since 2021-07-12
 * 售后入库单
 */
@RestController
@RequestMapping("/salesupply")
public class StAftersaleInstoreController {

    @Autowired
    private StAftersaleInstoreService aftersaleInstoreService;

    /**
     * 添加入库单
     * @return
     */
    @RequestMapping("addInstore")
    public AxiosResult addInstore(StAftersaleInstore stAftersaleInstore){

        boolean b = aftersaleInstoreService.savaAftersaleInstore(stAftersaleInstore);
        return AxiosResult.success(b);
    }

    /**
     * 查询入库单
     * @return
     */

    @RequestMapping("findInstore")
    public AxiosResult<PageResult<StAftersaleInstoreVo>>  findAll(AftersaleInstoreCriteria aftersaleInstoreCriteria){

        PageResult<StAftersaleInstoreVo> aftersaleInstore = aftersaleInstoreService.findAftersaleInstore(aftersaleInstoreCriteria);


        return AxiosResult.success(aftersaleInstore);
    }

    /**
     * 修改入库单状态
     */
    @RequestMapping("updateInstore")
    public AxiosResult  updataStutas(StAftersaleInstore aftersaleInstore){

        boolean b = aftersaleInstoreService.updataAftersaleInstore(aftersaleInstore);

        return AxiosResult.success(b);
    }

    /**
     * 根据id查找入库单
     * @param id
     * @return
     */
    @RequestMapping("findInstroeByid")
    public AxiosResult<StAftersaleInstore> findInstroeByid(Integer id){

        StAftersaleInstore instroeByid = aftersaleInstoreService.findInstroeByid(id);

        return AxiosResult.success(instroeByid);
    }



}
