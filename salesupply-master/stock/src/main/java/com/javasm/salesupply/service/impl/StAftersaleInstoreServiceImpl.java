package com.javasm.salesupply.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.AftersaleInstoreCriteria;
import com.javasm.salesupply.domain.entity.StAftersaleInstore;
import com.javasm.salesupply.domain.entity.StGodown;
import com.javasm.salesupply.domain.vo.StAftersaleInstoreVo;
import com.javasm.salesupply.mapper.StAftersaleInstoreMapper;
import com.javasm.salesupply.service.StAftersaleInstoreService;
import com.javasm.salesupply.transfer.AftersaleInstoreTranfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.swing.*;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author whl
 * @since 2021-07-12
 */
@Service
@Transactional

public class StAftersaleInstoreServiceImpl extends ServiceImpl<StAftersaleInstoreMapper, StAftersaleInstore> implements StAftersaleInstoreService {

    @Resource
    private StAftersaleInstoreMapper instoreMapper;
    @Resource
    private AftersaleInstoreTranfer instoreTranfer;

    @Override
    public boolean savaAftersaleInstore(StAftersaleInstore stAftersaleInstore) {
        int insert = instoreMapper.insert(stAftersaleInstore);

        return insert>0;
    }

    @Override
    public PageResult<StAftersaleInstoreVo> findAftersaleInstore(AftersaleInstoreCriteria criteria) {

        Integer currentPage = criteria.getCurrentPage();
        Integer pageSize = criteria.getPageSize();


        if (currentPage!=null||currentPage!=0){
            currentPage=1;
        }
        if (pageSize!=null||pageSize!=0){
            pageSize=10;
        }

        //分页
        PageHelper.startPage(criteria.getCurrentPage(),criteria.getPageSize());

        QueryWrapper<StAftersaleInstore> wrapper = new QueryWrapper<>();
        LambdaQueryWrapper<StAftersaleInstore> lambda = wrapper.lambda();

        //拼接Sql语句
        //查询时间
        if (criteria.getStartTime()!=null&&criteria.getEndTime()!=null){

            lambda.between(StAftersaleInstore::getCreateTime,criteria.getStartTime(),criteria.getEndTime());

        }
        //订单编号
        if (criteria.getOrderid()!=null){
            lambda.like(StAftersaleInstore::getOrderId,criteria.getOrderid());
        }
        //订单状态
        if (criteria.getStutas()!=null){
            lambda.eq(StAftersaleInstore::getStatus,criteria.getStutas());
        }
        //订单类型
        if (criteria.getOrderType()!=null){
            lambda.eq(StAftersaleInstore::getOrderType,criteria.getOrderType());
        }
        //对应售后订单
        if (criteria.getOutorderid()!=null){
            lambda.like(StAftersaleInstore::getAfterSaleOrderId,criteria.getOutorderid());
        }

        List<StAftersaleInstore> stAftersaleInstores = instoreMapper.selectList(wrapper);
        //查询总条数

        PageInfo<StAftersaleInstore> stAftersaleInstorePageInfo = new PageInfo<>(stAftersaleInstores);
        long total = stAftersaleInstorePageInfo.getTotal();

        //list转vo
        List<StAftersaleInstoreVo> stAftersaleInstoreVos = instoreTranfer.toVO(stAftersaleInstores);

        return new PageResult<>(total,stAftersaleInstoreVos);
    }

    @Override
    public boolean updataAftersaleInstore(StAftersaleInstore stAftersaleInstore) {
        int i = instoreMapper.updateById(stAftersaleInstore);

        return i>0;
    }

    @Override
    public StAftersaleInstore findInstroeByid(Integer id) {

        StAftersaleInstore stAftersaleInstore = instoreMapper.selectById(id);

        return stAftersaleInstore;
    }


}
