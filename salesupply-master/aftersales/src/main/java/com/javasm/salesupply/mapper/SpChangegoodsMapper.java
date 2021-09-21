package com.javasm.salesupply.mapper;

import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.GoodsInfoCriteria;
import com.javasm.salesupply.domain.entity.SpChangegoods;
import com.javasm.salesupply.domain.vo.GoodsInfoVo;
import com.javasm.salesupply.mapper.base.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author：戈李阳
 * @Version：1.0
 * @Date：2021/7/12-19:00
 * @Since:jdk1.8
 * @Description:TODO
 */
@Repository
@Mapper
public interface SpChangegoodsMapper extends MyMapper<SpChangegoods> {
    List<GoodsInfoVo> selectGoodsInfo(GoodsInfoCriteria goodsInfoCriteria);

}
