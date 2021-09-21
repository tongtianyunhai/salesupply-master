package com.javasm.salesupply.domain.vo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.javasm.salesupply.domain.vo.base.BaseVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

/**
 * @Author：whl
 * @Version：1.0
 * @Date：2021/7/5-11:41
 * @Since:jdk1.8
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SpAbnormalcomplaintVo对象", description="特殊申诉表")
public class SpAbnormalcomplaintVo extends BaseVo {

    /**
     *特殊申诉单编号
     */
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "特殊申诉单编号")
    @TableId(value = "sp_orderid", type = IdType.AUTO)
    private Integer spOrderid;

    /**
     * 特殊申诉方案名
     */
    private String spCasename;

    /**
     * 方案关键字
     */
    private String spKeyword;

    /**
     * 方案创建人
     */
    private String spCreateBy;

    /**
     * 创建日期
     */
    private LocalDate spCreateTime;

    /**
     * 审批人
     */
    private String spChecker;

    /**
     * 审批状态
     */
    private Integer spCheckstatus;
    /**
     * 更新日期
     */
    private LocalDate spUpdateTime;

}
