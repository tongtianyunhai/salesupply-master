package com.javasm.salesupply.domain.criteria;

import com.javasm.salesupply.domain.criteria.base.BaseQueryCriteria;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/7/14-14:48
 * @Since:jdk1.8
 * @Description:TODO
 */

public class ClassifyCriteria extends BaseQueryCriteria {
    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName;
    }

    public Integer getRid1() {
        return rid1;
    }

    public void setRid1(Integer rid1) {
        this.rid1 = rid1;
    }

    public Integer getRid2() {
        return rid2;
    }

    public void setRid2(Integer rid2) {
        this.rid2 = rid2;
    }

    /**
     * 商品类型名称
     */
    private String classifyName;

    /**
     * 一类分类
     */
    private Integer rid1;

    /**
     * 二类分类
     */
    private Integer rid2;

}