package com.javasm.salesupply.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.SpAbnormalcomplaintCriteria;
import com.javasm.salesupply.domain.criteria.SpOutwarehouseCriteria;
import com.javasm.salesupply.domain.criteria.SpReturnwarehouseCriteria;
import com.javasm.salesupply.domain.entity.SpAbnormalcomplaint;
import com.javasm.salesupply.domain.entity.SpOutwarehouse;
import com.javasm.salesupply.domain.entity.SpReturnwarehouse;
import com.javasm.salesupply.domain.vo.SpAbnormalcomplaintVo;
import com.javasm.salesupply.domain.vo.SpReturnwarehouseVo;
import com.javasm.salesupply.mapper.SpAbnormalcomplaintMapper;
import com.javasm.salesupply.mapper.SpReturnwarehouseMapper;
import com.javasm.salesupply.service.SpReturnwarehouseService;
import com.javasm.salesupply.service.base.impl.BaseServiceImpl;
import com.javasm.salesupply.transfer.SpAbnormalcomplaintTransfer;
import com.javasm.salesupply.transfer.SpReturnwarehouseTransfer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author：戈李阳
 * @Version：1.0
 * @Date：2021/7/12-19:09
 * @Since:jdk1.8
 * @Description:TODO
 */
@Service
@Transactional
@RequiredArgsConstructor
public class SpReturnwarehouseServiceImpl extends BaseServiceImpl<SpReturnwarehouse> implements SpReturnwarehouseService {

    private final SpReturnwarehouseMapper spReturnwarehouseMapper;

    private final SpReturnwarehouseTransfer spReturnwarehouseTransfer;

    @Override
    public PageResult<SpReturnwarehouseVo> searchPageByCriteria(SpReturnwarehouseCriteria spReturnwarehouseCriteria) {

        Integer currentPage = spReturnwarehouseCriteria.getCurrentPage();
        Integer pageSize = spReturnwarehouseCriteria.getPageSize();

        if (StringUtils.isEmpty(pageSize)){
            currentPage =1;
        }
        if (StringUtils.isEmpty(pageSize)){
            pageSize = 5;
        }

        PageHelper.startPage(currentPage,pageSize);
        LocalDateTime startTime = spReturnwarehouseCriteria.getStartTime();
        LocalDateTime endTime = spReturnwarehouseCriteria.getEndTime();
        String spOrderid = spReturnwarehouseCriteria.getSpOrderid();

        QueryWrapper<SpReturnwarehouse> spReturnwarehouseQueryWrapper = new QueryWrapper<SpReturnwarehouse>();
        LambdaQueryWrapper<SpReturnwarehouse> lambda = spReturnwarehouseQueryWrapper.lambda();


        //拼接sql的
        if (startTime!=null &&endTime != null){
            lambda.between(SpReturnwarehouse::getSpCreateTime,startTime,endTime);
        }

        if (!StringUtils.isEmpty(spOrderid)){
            lambda.like(SpReturnwarehouse::getSpOrderid, spOrderid);
        }


        List<SpReturnwarehouse> spReturnwarehouseList = spReturnwarehouseMapper.selectList(spReturnwarehouseQueryWrapper);

        PageInfo<SpReturnwarehouse> spReturnwarehousePageInfo = new PageInfo<>(spReturnwarehouseList);

        long total =spReturnwarehousePageInfo.getTotal();

        //brandList ------>brandVoList

        List<SpReturnwarehouseVo> spReturnwarehouseVoList = spReturnwarehouseTransfer.toVO(spReturnwarehouseList);


        return new PageResult<SpReturnwarehouseVo>(total,spReturnwarehouseVoList);

    }



    @Override
    public boolean addcheck(SpReturnwarehouseCriteria spReturnwarehouseCriteria) {
        SpReturnwarehouse spReturnwarehouse=new SpReturnwarehouse();

        spReturnwarehouse.setSpCauses(spReturnwarehouseCriteria.getSpCauses());

        spReturnwarehouse.setSpCreatedepartment(spReturnwarehouseCriteria.getSpOrderdepartment().toString());
        spReturnwarehouse.setSpCreateBy(spReturnwarehouseCriteria.getSpCreateBy());
        spReturnwarehouse.setSpCreateTime(spReturnwarehouseCriteria.getSpCreateTime());
        spReturnwarehouse.setSpAddition(spReturnwarehouseCriteria.getSpAddtion());
        spReturnwarehouse.setSpInstatus(spReturnwarehouseCriteria.getSpInstatus());
        spReturnwarehouse.setSpOrderstatus(spReturnwarehouseCriteria.getSpOrderstatus());
        spReturnwarehouse.setSpOutlookstatus(spReturnwarehouseCriteria.getSpOutlookstatus());
        spReturnwarehouse.setSpOrderstatus(spReturnwarehouseCriteria.getSpHandletype());
        spReturnwarehouse.setSpSites(spReturnwarehouseCriteria.getSpSites());
        spReturnwarehouse.setSpHandletype(spReturnwarehouseCriteria.getSpHandletype());

        spReturnwarehouse.setSpSellsid(spReturnwarehouseCriteria.getOrderId().toString());
        spReturnwarehouse.setSpGoodsid(spReturnwarehouseCriteria.getProductId().toString());
        spReturnwarehouse.setSpGoodsname(spReturnwarehouseCriteria.getProductName());
        spReturnwarehouse.setSpGoodsimei(spReturnwarehouseCriteria.getOrderImei().toString());
        spReturnwarehouse.setSpGoodscolor(spReturnwarehouseCriteria.getOrderGoodscolor());
        spReturnwarehouse.setSpGoodstype(spReturnwarehouseCriteria.getOrderGoodstype());





        System.out.println("4396"+spReturnwarehouse);
        int insert = spReturnwarehouseMapper.insert(spReturnwarehouse);
        return insert>0;
    }

}
