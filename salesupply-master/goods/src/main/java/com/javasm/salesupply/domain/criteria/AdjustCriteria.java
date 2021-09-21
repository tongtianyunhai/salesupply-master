package com.javasm.salesupply.domain.criteria;

import com.javasm.salesupply.domain.criteria.base.BaseQueryCriteria;
import lombok.Data;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/7/17-17:30
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
public class AdjustCriteria extends BaseQueryCriteria {

    /**
     * 审核状态
     */
    private Integer approvalStatus;

    /**
     * 商品名称
     */
    private String goodsName;
}