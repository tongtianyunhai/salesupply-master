package com.javasm.salesupply.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.SpAbnormalcomplaintCriteria;
import com.javasm.salesupply.domain.criteria.SpComplaintsrecordCriteria;
import com.javasm.salesupply.domain.entity.SpAbnormalcomplaint;
import com.javasm.salesupply.domain.entity.SpChangegoods;
import com.javasm.salesupply.domain.entity.SpComplaintsrecord;
import com.javasm.salesupply.domain.vo.SpAbnormalcomplaintVo;
import com.javasm.salesupply.domain.vo.SpComplaintsrecordVo;
import com.javasm.salesupply.mapper.SpAbnormalcomplaintMapper;
import com.javasm.salesupply.mapper.SpComplaintsrecordMapper;
import com.javasm.salesupply.service.SpAbnormalcomplaintService;
import com.javasm.salesupply.service.SpComplaintsrecordService;
import com.javasm.salesupply.service.base.impl.BaseServiceImpl;
import com.javasm.salesupply.transfer.SpAbnormalcomplaintTransfer;
import com.javasm.salesupply.transfer.SpComplaintsrecordTransfer;
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
@RequiredArgsConstructor   //相当于@Autoware
public class SpComplaintsrecordServiceImpl extends BaseServiceImpl<SpComplaintsrecord> implements SpComplaintsrecordService {

    private final SpComplaintsrecordMapper spComplaintsrecordMapper;

    private final SpComplaintsrecordTransfer spComplaintsrecordTransfer;

    @Override
    public PageResult<SpComplaintsrecordVo> searchPageByCriteria(SpComplaintsrecordCriteria spComplaintsrecordCriteria) {

        Integer currentPage = spComplaintsrecordCriteria.getCurrentPage();
        Integer pageSize = spComplaintsrecordCriteria.getPageSize();

        if (StringUtils.isEmpty(pageSize)){
            currentPage =1;
        }
        if (StringUtils.isEmpty(pageSize)){
            pageSize = 5;
        }

        PageHelper.startPage(currentPage,pageSize);
        LocalDateTime startTime = spComplaintsrecordCriteria.getStartTime();
        LocalDateTime endTime = spComplaintsrecordCriteria.getEndTime();
        String spComplaintsid = spComplaintsrecordCriteria.getSpComplaintsid();

        QueryWrapper<SpComplaintsrecord> spComplaintsrecordQueryWrapper = new QueryWrapper<SpComplaintsrecord>();
        LambdaQueryWrapper<SpComplaintsrecord> lambda = spComplaintsrecordQueryWrapper.lambda();


        //拼接sql的
        if (startTime!=null &&endTime != null){
            lambda.between(SpComplaintsrecord::getSpCreateTime,startTime,endTime);
        }

        if (!StringUtils.isEmpty(spComplaintsid)){
            lambda.like(SpComplaintsrecord::getSpComplaintsid, spComplaintsid);
        }


        List<SpComplaintsrecord> spComplaintsrecordList = spComplaintsrecordMapper.selectList(spComplaintsrecordQueryWrapper);

        PageInfo<SpComplaintsrecord> spComplaintsrecordPageInfo = new PageInfo<>(spComplaintsrecordList);

        long total = spComplaintsrecordPageInfo.getTotal();

        //brandList ------>brandVoList

        List<SpComplaintsrecordVo> spComplaintsrecordVoList = spComplaintsrecordTransfer.toVO(spComplaintsrecordList);


        return new PageResult<SpComplaintsrecordVo>(total,spComplaintsrecordVoList);

    }

    @Override
    public boolean addcheck(SpComplaintsrecordCriteria spComplaintsrecordCriteria) {
        SpComplaintsrecord spComplaintsrecord=new SpComplaintsrecord();

        spComplaintsrecord.setSpSalesorderid(spComplaintsrecordCriteria.getOrderId().toString());
        spComplaintsrecord.setSpComplaintsgoodscolor(spComplaintsrecordCriteria.getOrderGoodscolor());
        spComplaintsrecord.setSpComplaintsgoodsid(spComplaintsrecordCriteria.getProductId().toString());
        spComplaintsrecord.setSpComplaintsgoodsname(spComplaintsrecordCriteria.getProductName());
        spComplaintsrecord.setSpComplaintsgoodsiemi(spComplaintsrecordCriteria.getOrderImei().toString());
        spComplaintsrecord.setSpComplaintsgoodstype(spComplaintsrecordCriteria.getOrderGoodstype());


       spComplaintsrecord.setSpComplaintsname(spComplaintsrecordCriteria.getSpComplaintsname());
       spComplaintsrecord.setSpComplaintsource(spComplaintsrecordCriteria.getSpComplaintsource());
       spComplaintsrecord.setSpComplaintsdescribe(spComplaintsrecordCriteria.getSpComplaintsdescribe());
       spComplaintsrecord.setSpComplaintstatus(spComplaintsrecordCriteria.getSpComplaintstatus());
       spComplaintsrecord.setSpComplaintsorderid(spComplaintsrecordCriteria.getSpComplaintsorderid());
       spComplaintsrecord.setSpCreateBy(spComplaintsrecordCriteria.getSpCreateBy());
       spComplaintsrecord.setSpCreateTime(spComplaintsrecordCriteria.getSpCreateTime());
       spComplaintsrecord.setSpAddtion(spComplaintsrecordCriteria.getSpAddtion());






        System.out.println("4396"+spComplaintsrecord);
        int insert = spComplaintsrecordMapper.insert(spComplaintsrecord);
        return insert>0;
    }
}
