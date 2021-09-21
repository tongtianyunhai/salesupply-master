package com.javasm.salesupply.controller;

import com.javasm.salesupply.domain.entity.PromoteApproval;
import com.javasm.salesupply.service.PromoteApprovalService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (PromoteApproval)表控制层
 *
 * @author makejava
 * @since 2021-07-16 11:12:35
 */
@RestController
@RequestMapping("promoteApproval")
public class PromoteApprovalController {
    /**
     * 服务对象
     */
    @Resource
    private PromoteApprovalService promoteApprovalService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PromoteApproval selectOne(Integer id) {
        return this.promoteApprovalService.queryById(id);
    }

}