package com.javasm.salesupply.domain.criteria;

import com.javasm.salesupply.domain.criteria.base.BaseQueryCriteria;
import lombok.Data;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/7/12-22:11
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
public class BrandCriteria extends BaseQueryCriteria {
    private String brandName;
}