package com.javasm.salesupply.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.AdjustCriteria;
import com.javasm.salesupply.domain.entity.GtAdjust;
import com.javasm.salesupply.domain.vo.AdjustVO;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author chy
 * @since 2021-07-17
 */
public interface IGtAdjustService extends IService<GtAdjust> {

    /**
     * 添加两张表的数据
     *
     * @param gtAdjust
     * @return
     */
    Boolean saveAndCreateApproval(GtAdjust gtAdjust);

    /**
     * 分页查询
     * @param adjustCriteria
     * @return
     */
    PageResult<AdjustVO> searchPageByCriteria(AdjustCriteria adjustCriteria);

}
