package com.javasm.salesupply.controller;

import com.javasm.salesupply.domain.entity.GtApproval;
import com.javasm.salesupply.service.GtApprovalService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (GtApproval)表控制层
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */
@RestController
@RequestMapping("gtApproval")
public class GtApprovalController {
    /**
     * 服务对象
     */
    @Resource
    private GtApprovalService gtApprovalService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public GtApproval selectOne(Integer id) {
        return this.gtApprovalService.queryById(id);
    }

}