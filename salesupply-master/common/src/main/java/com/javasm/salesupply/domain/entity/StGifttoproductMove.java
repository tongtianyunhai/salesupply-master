package com.javasm.salesupply.domain.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author javasm
 * @since 2021-07-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="StGifttoproductMove对象", description="")
public class StGifttoproductMove implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "移库单编号")
    private Integer id;

    @ApiModelProperty(value = "移库申请单编号")
    private Integer moveApplyid;

    @ApiModelProperty(value = "业务类型")
    private String businessType;

    @ApiModelProperty(value = "移库商品/赠品编号")
    private Integer giftId;

    @ApiModelProperty(value = "移库商品/赠品原始属性")
    private String giftProperty;

    @ApiModelProperty(value = "源头仓库")
    private String sourceStore;

    @ApiModelProperty(value = "目地仓库")
    private String targetStore;

    @ApiModelProperty(value = "订单编号")
    private Integer orderId;

    @ApiModelProperty(value = "制单人")
    private String preparedBy;

    @ApiModelProperty(value = "审核人")
    private String verifier;

    @ApiModelProperty(value = "处理时间")
    private LocalDateTime processTime;

    @ApiModelProperty(value = "供应商信息")
    private String supplierInformation;

    @ApiModelProperty(value = "移库数量")
    private Integer moveCount;

    @ApiModelProperty(value = "状态")
    private String status;

    @ApiModelProperty(value = "创建者")
    private Integer createBy;

    @ApiModelProperty(value = "更新者")
    private String updateBy;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "预留字段1")
    private Integer remark1;

    @ApiModelProperty(value = "预留字段2")
    private Integer remark2;


}
