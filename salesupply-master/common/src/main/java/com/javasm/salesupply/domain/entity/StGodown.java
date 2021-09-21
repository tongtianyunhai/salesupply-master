package com.javasm.salesupply.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author whl
 * @since 2021-07-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class StGodown implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 申请表id
     */
    @TableId(value = "st_godownid", type = IdType.AUTO)
    private Integer stGodownid;

    /**
     * 订单id
     */
    private Integer stOrderid;

    /**
     * 出库单Id
     */
    private Integer stOutorderid;

    /**
     * 状态 1.待审核 2.已审核 3.待入库 4.已入库
     */
    private Integer stCheckstatus;

    /**
     * 订单类型：1、换货单 2、退货单 3、返厂入库单
     */
    private Integer spHandletype;

    private String stCreateBy;

    private LocalDateTime stCreateDate;

    private String stUpdateBy;

    private LocalDateTime stUpdateTime;


}
