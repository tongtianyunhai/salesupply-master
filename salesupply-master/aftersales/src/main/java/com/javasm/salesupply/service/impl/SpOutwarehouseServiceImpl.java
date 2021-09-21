package com.javasm.salesupply.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.SpOutwarehouseCriteria;
import com.javasm.salesupply.domain.criteria.SpReturngoodsCriteria;
import com.javasm.salesupply.domain.entity.SpAbnormalcomplaint;
import com.javasm.salesupply.domain.entity.SpOutwarehouse;
import com.javasm.salesupply.domain.entity.SpReturngoods;
import com.javasm.salesupply.domain.vo.SpOutwarehouseVo;
import com.javasm.salesupply.domain.vo.SpReturngoodsVo;
import com.javasm.salesupply.mapper.SpOutwarehouseMapper;
import com.javasm.salesupply.mapper.SpReturngoodsMapper;
import com.javasm.salesupply.service.SpAbnormalcomplaintService;
import com.javasm.salesupply.service.SpOutwarehouseService;
import com.javasm.salesupply.service.base.impl.BaseServiceImpl;
import com.javasm.salesupply.transfer.SpOutwarehouseTransfer;
import com.javasm.salesupply.transfer.SpReturngoodsTransfer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author：戈李阳
 * @Version：1.0
 * @Date：2021/7/12-19:08
 * @Since:jdk1.8
 * @Description:TODO
 */
@Service
@Transactional
@RequiredArgsConstructor
public class SpOutwarehouseServiceImpl extends BaseServiceImpl<SpOutwarehouse> implements SpOutwarehouseService {

    private final SpOutwarehouseMapper spOutwarehouseMapper;

    private final SpOutwarehouseTransfer spOutwarehouseTransfer;

    @Override
    public PageResult<SpOutwarehouseVo> searchPageByCriteria(SpOutwarehouseCriteria spOutwarehouseCriteria) {

        Integer currentPage = spOutwarehouseCriteria.getCurrentPage();
        Integer pageSize =spOutwarehouseCriteria.getPageSize();

        if (StringUtils.isEmpty(pageSize)){
            currentPage =1;
        }
        if (StringUtils.isEmpty(pageSize)){
            pageSize = 5;
        }

        PageHelper.startPage(currentPage,pageSize);
        LocalDateTime startTime = spOutwarehouseCriteria.getStartTime();
        LocalDateTime endTime = spOutwarehouseCriteria.getEndTime();
        String spApplicationid = spOutwarehouseCriteria.getSpApplicationid();

        QueryWrapper<SpOutwarehouse> spOutwarehouseQueryWrapper = new QueryWrapper<SpOutwarehouse>();
        LambdaQueryWrapper<SpOutwarehouse> lambda = spOutwarehouseQueryWrapper.lambda();


        //拼接sql的
        if (startTime!=null &&endTime != null){
            lambda.between(SpOutwarehouse::getSpCreatTime,startTime,endTime);
        }

        if (!StringUtils.isEmpty(spApplicationid)){
            lambda.like(SpOutwarehouse::getSpApplicationid, spApplicationid);
        }


        List<SpOutwarehouse> spOutwarehouseList = spOutwarehouseMapper.selectList(spOutwarehouseQueryWrapper);

        PageInfo<SpOutwarehouse> spOutwarehousePageInfo = new PageInfo<>(spOutwarehouseList);

        long total = spOutwarehousePageInfo.getTotal();

        //brandList ------>brandVoList

        List<SpOutwarehouseVo> spOutwarehouseVoList = spOutwarehouseTransfer.toVO(spOutwarehouseList);


        return new PageResult<SpOutwarehouseVo>(total,spOutwarehouseVoList);
    }

    @Override
    public boolean addcheck(SpOutwarehouseCriteria spOutwarehouseCriteria) {
        SpOutwarehouse spOutwarehouse=new SpOutwarehouse();

        spOutwarehouse.setSpCauses(spOutwarehouseCriteria.getSpCauses());

        spOutwarehouse.setSpCreatedepartment(spOutwarehouseCriteria.getSpOrderdepartment().toString());
        spOutwarehouse.setSpCreateBy(spOutwarehouseCriteria.getSpCreateBy());
        spOutwarehouse.setSpCreatTime(spOutwarehouseCriteria.getSpCreateDate());
        spOutwarehouse.setSpAddition(spOutwarehouseCriteria.getSpAddtion());
        spOutwarehouse.setSpOutstatus(spOutwarehouseCriteria.getSpOutstatus());
        spOutwarehouse.setSpOrderstatus(spOutwarehouseCriteria.getSpOrderstatus());
        spOutwarehouse.setSpOutlookstatus(spOutwarehouseCriteria.getSpOutlookstatus());
        spOutwarehouse.setSpOrderstatus(spOutwarehouseCriteria.getSpHandletype());
        spOutwarehouse.setSpSites(spOutwarehouseCriteria.getSpSites());

        spOutwarehouse.setSpSellsid(spOutwarehouseCriteria.getOrderId().toString());
        spOutwarehouse.setSpGoodsid(spOutwarehouseCriteria.getProductId().toString());
        spOutwarehouse.setSpGoodsname(spOutwarehouseCriteria.getProductName());
        spOutwarehouse.setSpGoodsimei(spOutwarehouseCriteria.getOrderImei().toString());
        spOutwarehouse.setSpGoodscolor(spOutwarehouseCriteria.getOrderGoodscolor());
        spOutwarehouse.setSpGoodstype(spOutwarehouseCriteria.getOrderGoodstype());





        System.out.println("4396"+spOutwarehouse);
        int insert = spOutwarehouseMapper.insert(spOutwarehouse);
        return insert>0;
    }

}
