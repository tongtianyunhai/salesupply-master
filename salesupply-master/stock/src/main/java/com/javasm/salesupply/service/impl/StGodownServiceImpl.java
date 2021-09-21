package com.javasm.salesupply.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.controller.SpChangegoodsController;
import com.javasm.salesupply.domain.criteria.GodownCriteria;
import com.javasm.salesupply.domain.entity.*;
import com.javasm.salesupply.mapper.SpChangegoodsMapper;
import com.javasm.salesupply.mapper.SpReturngoodsMapper;
import com.javasm.salesupply.mapper.SpReturnwarehouseMapper;
import com.javasm.salesupply.mapper.StGodownMapper;
import com.javasm.salesupply.service.StGodownService;
import com.javasm.salesupply.domain.vo.GodownVo;
import com.javasm.salesupply.transfer.GodownTransfer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author whl
 * @since 2021-07-14
 */
@Service
@Transactional
@Slf4j
public class StGodownServiceImpl extends ServiceImpl<StGodownMapper, StGodown> implements StGodownService {

    @Resource
    private StGodownMapper godownMapper;
    @Resource
    private GodownTransfer godownTransfer;

    @Resource
    private SpChangegoodsMapper changegoods;
    @Resource
    private SpReturngoodsMapper returngoods;
    @Resource
    private SpReturnwarehouseMapper returnwarehouse;


    @Override
    public boolean add(StGodown stGodown) {

        int insert = godownMapper.insert(stGodown);


        return insert>0;
    }

    @Override
    public PageResult<GodownVo> findAll(GodownCriteria godownCriteria) {
        Integer currentPage = godownCriteria.getCurrentPage();
        Integer pageSize = godownCriteria.getPageSize();


        if (StringUtils.isEmpty(currentPage)){
            currentPage=1;
        }
        if (StringUtils.isEmpty(pageSize)){
            pageSize=5;
        }
        //分页
        PageHelper.startPage(currentPage,pageSize);

        QueryWrapper<StGodown> wrapper = new QueryWrapper<>();
        LambdaQueryWrapper<StGodown> lambda = wrapper.lambda();

        //拼接Sql语句
        //查询时间
        if (godownCriteria.getStartTime()!=null&&godownCriteria.getEndTime()!=null){
            lambda.between(StGodown::getStCreateDate,godownCriteria.getStartTime(),godownCriteria.getEndTime());
        }
        //订单编号
        if (godownCriteria.getOrderid()!=null){
            lambda.like(StGodown::getStOrderid,godownCriteria.getOrderid());
        }
        //订单状态
        if (godownCriteria.getStutas()!=null){
            lambda.eq(StGodown::getStCheckstatus,godownCriteria.getStutas());
        }
        //订单类型
        if (godownCriteria.getOrderType()!=null){
            lambda.eq(StGodown::getSpHandletype,godownCriteria.getOrderType());
        }
        //对应出库订单
        if (godownCriteria.getOutorderid()!=null){
            lambda.eq(StGodown::getStOutorderid,godownCriteria.getOutorderid());
        }

        List<StGodown> stGodownList = godownMapper.selectList(wrapper);

        PageInfo<StGodown> pageInfo = new PageInfo<>(stGodownList);

        long total = pageInfo.getTotal();

        //转换vo

        List<GodownVo> godownVos = godownTransfer.toVO(stGodownList);

        return new PageResult<>(total,godownVos) ;
    }

    @Override
    public boolean addcheck(GodownCriteria godownCriteria) {
            StGodown stGodown=new StGodown();
            stGodown.setSpHandletype(godownCriteria.getSpHandletype());
            stGodown.setStCheckstatus(godownCriteria.getSpCheckstatus());
            stGodown.setStCreateBy(godownCriteria.getSpChecker());

            //不同订单的主键id各自set
        if(godownCriteria.getSpOrderid()!=null){
            stGodown.setStOrderid(godownCriteria.getSpOrderid());
        }
        if(godownCriteria.getSpComplaintsid()!=null) {
            stGodown.setStOrderid(godownCriteria.getSpComplaintsid());
        }
        if(godownCriteria.getSpApplicationid()!=null){
            stGodown.setStOrderid(godownCriteria.getSpApplicationid());
        }
        stGodown.setStCreateDate(godownCriteria.getSpUpdateDate());

        System.out.println("4396"+stGodown);
        int insert = godownMapper.insert(stGodown);
        return insert>0;
    }


    @Override
    public SpChangegoods findChangegoods(Integer id) {

        SpChangegoods spChangegoods = changegoods.selectById(id);

        return spChangegoods;
    }

    @Override
    public SpReturngoods findReturngoods(Integer id) {

        SpReturngoods spReturngoods = returngoods.selectById(id);
        return spReturngoods;
    }

    @Override
    public SpReturnwarehouse findrRturnwarehouse(Integer id) {

        SpReturnwarehouse spReturnwarehouse = returnwarehouse.selectById(id);
        return spReturnwarehouse;
    }

    @Override
    public boolean updateStutas(StGodown stGodown) {

        int i = godownMapper.updateById(stGodown);

        return i>0;
    }

}
