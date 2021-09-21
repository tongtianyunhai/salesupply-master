package com.javasm.salesupply.domain.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (GdImei)实体类
 *
 * @author makejava
 * @since 2021-07-12 22:06:22
 */
public class GdImei implements Serializable {
    private static final long serialVersionUID = 236298452945717294L;
    
    private Integer imeiId;
    /**
    * 串码
    */
    private Integer imeiNumber;
    /**
    * 状态  0- 已销售 1-未销售
    */
    private Integer imeiStatus;
    /**
    * 商品或赠品的id
    */
    private Integer gdgtId;
    /**
    * 1-赠品 0-商品
    */
    private Integer flag;
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


    public Integer getImeiId() {
        return imeiId;
    }

    public void setImeiId(Integer imeiId) {
        this.imeiId = imeiId;
    }

    public Integer getImeiNumber() {
        return imeiNumber;
    }

    public void setImeiNumber(Integer imeiNumber) {
        this.imeiNumber = imeiNumber;
    }

    public Integer getImeiStatus() {
        return imeiStatus;
    }

    public void setImeiStatus(Integer imeiStatus) {
        this.imeiStatus = imeiStatus;
    }

    public Integer getGdgtId() {
        return gdgtId;
    }

    public void setGdgtId(Integer gdgtId) {
        this.gdgtId = gdgtId;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
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