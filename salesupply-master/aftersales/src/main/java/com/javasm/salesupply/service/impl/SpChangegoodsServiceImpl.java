package com.javasm.salesupply.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.GoodsInfoCriteria;
import com.javasm.salesupply.domain.criteria.SpChangegoodsCriteria;
import com.javasm.salesupply.domain.criteria.SpOutwarehouseCriteria;
import com.javasm.salesupply.domain.entity.SpChangegoods;
import com.javasm.salesupply.domain.entity.SpOutwarehouse;
import com.javasm.salesupply.domain.vo.GoodsInfoVo;
import com.javasm.salesupply.domain.vo.SpChangegoodsVo;
import com.javasm.salesupply.mapper.SpChangegoodsMapper;
import com.javasm.salesupply.service.SpChangegoodsService;
import com.javasm.salesupply.service.base.impl.BaseServiceImpl;
import com.javasm.salesupply.transfer.SpChangegoodsTransfer;
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
public class SpChangegoodsServiceImpl extends BaseServiceImpl<SpChangegoods> implements SpChangegoodsService {

    private final SpChangegoodsMapper spChangegoodsMapper;

    private final SpChangegoodsTransfer spChangegoodsTransfer;

    @Override
    public PageResult<SpChangegoodsVo> searchPageByCriteria(SpChangegoodsCriteria spChangegoodsCriteria) {

        Integer currentPage = spChangegoodsCriteria.getCurrentPage();
        Integer pageSize = spChangegoodsCriteria.getPageSize();

        if (StringUtils.isEmpty(pageSize)){
            currentPage =1;
        }
        if (StringUtils.isEmpty(pageSize)){
            pageSize = 5;
        }

        PageHelper.startPage(currentPage,pageSize);
        LocalDateTime startTime = spChangegoodsCriteria.getStartTime();
        LocalDateTime endTime = spChangegoodsCriteria.getEndTime();
        String spOrderid = spChangegoodsCriteria.getSpOrderid();

        QueryWrapper<SpChangegoods> spChangegoodsQueryWrapper = new QueryWrapper<SpChangegoods>();
        LambdaQueryWrapper<SpChangegoods> lambda = spChangegoodsQueryWrapper.lambda();


        //拼接sql的
        if (startTime!=null &&endTime != null){
            lambda.between(SpChangegoods::getSpCreateDate,startTime,endTime);
        }

        if (!StringUtils.isEmpty(spOrderid)){
            lambda.like(SpChangegoods::getSpOrderid, spOrderid);
        }


        List<SpChangegoods> spChangegoodsList = spChangegoodsMapper.selectList(spChangegoodsQueryWrapper);

        PageInfo<SpChangegoods> spChangegoodsPageInfo = new PageInfo<>(spChangegoodsList);

        long total = spChangegoodsPageInfo.getTotal();

        //brandList ------>brandVoList

        List<SpChangegoodsVo> spChangegoodsVoList = spChangegoodsTransfer.toVO(spChangegoodsList);


        return new PageResult<SpChangegoodsVo>(total,spChangegoodsVoList);

    }


    @Override
    public PageResult<GoodsInfoVo> searchPageBygoodsname(GoodsInfoCriteria goodsInfoCriteria) {


        Integer currentPage = goodsInfoCriteria.getCurrentPage();
        Integer pageSize = goodsInfoCriteria.getPageSize();

        if (StringUtils.isEmpty(currentPage)) {
            currentPage = 1;
        }
        if (StringUtils.isEmpty(pageSize)) {
            pageSize = 5;
        }

        PageHelper.startPage(currentPage, pageSize);
        List<GoodsInfoVo> goodsInfoVOList = spChangegoodsMapper.selectGoodsInfo(goodsInfoCriteria);
        PageInfo<GoodsInfoVo> goodsInfoVoPageInfo = new PageInfo<>(goodsInfoVOList);
        long total = goodsInfoVoPageInfo.getTotal();
        return new PageResult<>(total,goodsInfoVOList);
    }

    @Override
    public boolean addcheck(SpChangegoodsCriteria spChangegoodsCriteria) {
        SpChangegoods spChangegoods=new SpChangegoods();

        spChangegoods.setSpAddtion(spChangegoodsCriteria.getSpAddtion());
        spChangegoods.setSpCreateBy(spChangegoodsCriteria.getSpCreateBy());
        spChangegoods.setSpCreateDate(spChangegoodsCriteria.getSpCreateDate());
        spChangegoods.setSpOrderdepartment(spChangegoodsCriteria.getSpOrderdepartment());
        spChangegoods.setSpOrderstatus(spChangegoodsCriteria.getSpOrderstatus());
        spChangegoods.setSpMaintenanceid(spChangegoodsCriteria.getSpMaintenanceid());
        spChangegoods.setSpHandletype(spChangegoodsCriteria.getSpHandletype());

        spChangegoods.setSpGoodscolor(spChangegoodsCriteria.getOrderGoodscolor());
        spChangegoods.setSpGoodsid(spChangegoodsCriteria.getProductId().toString());
        spChangegoods.setSpGoodsname(spChangegoodsCriteria.getProductName());
        spChangegoods.setSpGoodsiemi(spChangegoodsCriteria.getOrderImei().toString());
        spChangegoods.setSpGoodstype(spChangegoodsCriteria.getOrderGoodstype());

        spChangegoods.setSpNewgoodstype(spChangegoodsCriteria.getSpNewgoodstype());
        spChangegoods.setSpNewgoodscolor(spChangegoodsCriteria.getSpNewgoodscolor());
        spChangegoods.setSpNewgoodsid(spChangegoodsCriteria.getSpNewgoodsid());
        spChangegoods.setSpNewgoodsname(spChangegoodsCriteria.getSpNewgoodsname());
        spChangegoods.setSpNewgoodsiemi(spChangegoodsCriteria.getSpNewgoodsiemi().toString());

        spChangegoods.setSpSalesid(spChangegoodsCriteria.getOrderId().toString());


        System.out.println("4396"+spChangegoods);
        int insert = spChangegoodsMapper.insert(spChangegoods);
        return insert>0;
    }
}
