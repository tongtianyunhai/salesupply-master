package com.javasm.salesupply.controller;

import com.javasm.salesupply.common.http.AxiosResult;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.GdGift2GoodCriteria;
import com.javasm.salesupply.domain.criteria.PromoteCriteria;
import com.javasm.salesupply.domain.entity.GdGift2good;
import com.javasm.salesupply.domain.entity.GdGoods;
import com.javasm.salesupply.domain.entity.GtPromote;
import com.javasm.salesupply.domain.vo.GdGift2goodVO;
import com.javasm.salesupply.domain.vo.GdPromoteVO;
import com.javasm.salesupply.domain.vo.PromoteDetailVO;
import com.javasm.salesupply.mapper.PromoteApprovalDao;
import com.javasm.salesupply.service.GdGoodsService;
import com.javasm.salesupply.service.GtPromoteService;
import com.javasm.salesupply.service.impl.PromoteApprovalServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (GtPromote)表控制层
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */
@RestController
@RequestMapping("gtPromote")
public class GtPromoteController {
    /**
     * 服务对象
     */
    @Resource
    private GtPromoteService gtPromoteService;

    @Resource
    private GdGoodsService gdGoodsService;

    @Resource
    private PromoteApprovalServiceImpl promoteApprovalService;

    @Resource
    private PromoteApprovalDao promoteApprovalDao;

    /**
     *  添加数据到giftToGood
     * @param
     * @return
     */
    @RequestMapping("addPromote")
    @ResponseBody
    public AxiosResult<Integer> addPromote(@RequestBody PromoteDetailVO promoteDetailVO){

        // 添加审核数据到审核表中
        promoteApprovalService.addPromoteApproval(0,promoteDetailVO.getApprovalLevel());
        // 获取其 自增主键ID ==> 促销商品对应的 审批id
        int approvalId = promoteApprovalDao.selectMaxId();
        promoteDetailVO.setPromoteApprovaid(approvalId);

        int insert = gtPromoteService.insert(promoteDetailVO);

        return AxiosResult.success(insert);
    }

    /**
     *  修改 giftToGood
     * @param
     * @return
     */
    @RequestMapping("editPromote")
    @ResponseBody
    public AxiosResult<Integer> editPromote(@RequestBody PromoteDetailVO promoteDetailVO){

        int insert = gtPromoteService.update(promoteDetailVO);

        return AxiosResult.success(insert);
    }


    /**
     * 通过主键查询单条数据
     *
     * @param goodsId 主键
     * @return 单条数据
     */
    @RequestMapping("selectOne")
    @ResponseBody
    public AxiosResult<GdGoods> selectOne1(Integer goodsId) {

        GdGoods gdGoods = this.gdGoodsService.queryById(goodsId);
        return AxiosResult.success(gdGoods);
    }

    /**
     *  根据促销主键ID,查询相关VO表中信息
     *
     * @param promoteId
     * @return
     */
    @RequestMapping("checkPromotes")
    @ResponseBody
    public AxiosResult<PromoteDetailVO> checkPromotes(Integer promoteId){
        //System.out.println("=========="+promoteId);
        PromoteDetailVO promoteDetailVO = gtPromoteService.checkPromotes(promoteId);
        System.out.println("促销数量:"+promoteDetailVO.getRemark1());
        return AxiosResult.success(promoteDetailVO);
    }

    /**
     *  根据条件模糊查询
     *
     * @param
     * @return
     */
    @RequestMapping("findAll")
    @ResponseBody
    public AxiosResult<PageResult<GdPromoteVO>> findAll(@RequestBody PromoteCriteria promoteCriteria) {
        PageResult<GdPromoteVO> gdPromoteVOPageResult = gtPromoteService.selectByParams(promoteCriteria);

        return AxiosResult.success(gdPromoteVOPageResult);
    }



}