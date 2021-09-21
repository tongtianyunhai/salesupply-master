package com.javasm.salesupply.domain.criteria;

import com.javasm.salesupply.domain.criteria.base.BaseQueryCriteria;
import lombok.Data;

/**
 * @Author：戈李阳
 * @Version：1.0
 * @Date：2021/7/16-19:52
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
public class GoodsInfoCriteria extends BaseQueryCriteria {
    private String goodsName;
}
