package com.javasm.salesupply.domain.criteria;


import com.javasm.salesupply.domain.criteria.base.BaseQueryCriteria;
import lombok.Data;

/**
 * @Author：whl
 * @Version：1.0
 * @Date：2021/7/5-11:46
 * @Since:jdk1.8
 */
@Data
public class SpAbnormalcomplaintCriteria extends BaseQueryCriteria {
    private String spOrderid;
}
