package com.javasm.salesupply.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.SpAbnormalcomplaintCriteria;
import com.javasm.salesupply.domain.entity.SpAbnormalcomplaint;
import com.javasm.salesupply.domain.vo.SpAbnormalcomplaintVo;
import com.javasm.salesupply.mapper.SpAbnormalcomplaintMapper;
import com.javasm.salesupply.service.SpAbnormalcomplaintService;
import com.javasm.salesupply.service.base.impl.BaseServiceImpl;
import com.javasm.salesupply.transfer.SpAbnormalcomplaintTransfer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author：戈李阳
 * @Version：1.0
 * @Date：2021/7/12-15:31
 * @Since:jdk1.8
 * @Description:TODO
 */
@Service
@Transactional
@RequiredArgsConstructor   //相当于@Autoware
public class SpAbnormalcomplaintServiceImpl extends BaseServiceImpl<SpAbnormalcomplaint> implements SpAbnormalcomplaintService {

    private final SpAbnormalcomplaintMapper spAbnormalcomplaintMapper;

    private final SpAbnormalcomplaintTransfer spAbnormalcomplaintTransfer;

    @Override
    public PageResult<SpAbnormalcomplaintVo> searchPageByCriteria(SpAbnormalcomplaintCriteria spAbnormalcomplaintCriteria) {

        Integer currentPage = spAbnormalcomplaintCriteria.getCurrentPage();
        Integer pageSize = spAbnormalcomplaintCriteria.getPageSize();

        if (StringUtils.isEmpty(pageSize)){
            currentPage =1;
        }
        if (StringUtils.isEmpty(pageSize)){
            pageSize = 5;
        }

        PageHelper.startPage(currentPage,pageSize);
        LocalDateTime startTime = spAbnormalcomplaintCriteria.getStartTime();
        LocalDateTime endTime = spAbnormalcomplaintCriteria.getEndTime();
        String spOrderid = spAbnormalcomplaintCriteria.getSpOrderid();

        QueryWrapper<SpAbnormalcomplaint> spAbnormalcomplaintQueryWrapper = new QueryWrapper<SpAbnormalcomplaint>();
        LambdaQueryWrapper<SpAbnormalcomplaint> lambda = spAbnormalcomplaintQueryWrapper.lambda();


        //拼接sql的
        if (startTime!=null &&endTime != null){
            lambda.between(SpAbnormalcomplaint::getSpCreateTime,startTime,endTime);
        }

        if (!StringUtils.isEmpty(spOrderid)){
            lambda.like(SpAbnormalcomplaint::getSpOrderid, spOrderid);
        }


        List<SpAbnormalcomplaint> spAbnormalcomplaintList = spAbnormalcomplaintMapper.selectList(spAbnormalcomplaintQueryWrapper);

        PageInfo<SpAbnormalcomplaint> spAbnormalcomplaintPageInfo = new PageInfo<>(spAbnormalcomplaintList);

        long total = spAbnormalcomplaintPageInfo.getTotal();

        //brandList ------>brandVoList

        List<SpAbnormalcomplaintVo> spAbnormalcomplaintVoList = spAbnormalcomplaintTransfer.toVO(spAbnormalcomplaintList);


        return new PageResult<SpAbnormalcomplaintVo>(total,spAbnormalcomplaintVoList);

    }
}
