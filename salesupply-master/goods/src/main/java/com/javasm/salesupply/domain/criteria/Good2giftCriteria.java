package com.javasm.salesupply.domain.criteria;

import com.javasm.salesupply.domain.criteria.base.BaseQueryCriteria;
import lombok.Data;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/7/16-20:08
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
public class Good2giftCriteria extends BaseQueryCriteria {
    private String goodsName;
    private Integer classifyId;
    private Integer approvalStatus;

}