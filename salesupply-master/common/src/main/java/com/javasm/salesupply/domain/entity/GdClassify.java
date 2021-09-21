package com.javasm.salesupply.domain.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (GdClassify)实体类
 *
 * @author makejava
 * @since 2021-07-12 15:41:09
 */
public class GdClassify implements Serializable {
    private static final long serialVersionUID = 149322443535603378L;
    
    private Integer classifyId;
    /**
    * 商品类型名称
    */
    private String classifyName;
    /**
    * 品牌类型描述
    */
    private String classifyDes;
    /**
    * parentId  0-父类 其他-子类
    */
    private Integer classifyIsparent;
    /**
    * 创建者
    */
    private Integer createBy;
    /**
    * 更新者
    */
    private String updateBy;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 更新时间
    */
    private Date updateTime;
    /**
    * 预留字段1
    */
    private String remark1;
    /**
    * 预留字段2
    */
    private String remark2;


    public Integer getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(Integer classifyId) {
        this.classifyId = classifyId;
    }

    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName;
    }

    public String getClassifyDes() {
        return classifyDes;
    }

    public void setClassifyDes(String classifyDes) {
        this.classifyDes = classifyDes;
    }

    public Integer getClassifyIsparent() {
        return classifyIsparent;
    }

    public void setClassifyIsparent(Integer classifyIsparent) {
        this.classifyIsparent = classifyIsparent;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }

}