package com.javasm.salesupply.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.javasm.salesupply.domain.criteria.AdjustCriteria;
import com.javasm.salesupply.domain.entity.GtAdjust;
import com.javasm.salesupply.domain.vo.AdjustVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author chy
 * @since 2021-07-17
 */
@Mapper
public interface GtAdjustMapper extends BaseMapper<GtAdjust> {

    /**
     * 分页条件查询
     * @param adjustCriteria
     * @return
     */
    List<AdjustVO> selectVO(AdjustCriteria adjustCriteria);

}
