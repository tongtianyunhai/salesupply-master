package com.javasm.salesupply.controller;

import com.javasm.salesupply.domain.entity.GdImei;
import com.javasm.salesupply.service.GdImeiService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (GdImei)表控制层
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */
@RestController
@RequestMapping("gdImei")
public class GdImeiController {
    /**
     * 服务对象
     */
    @Resource
    private GdImeiService gdImeiService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public GdImei selectOne(Integer id) {
        return this.gdImeiService.queryById(id);
    }

}