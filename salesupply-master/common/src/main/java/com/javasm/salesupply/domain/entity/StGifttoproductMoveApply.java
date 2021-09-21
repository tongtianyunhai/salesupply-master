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
@ApiModel(value="StGifttoproductMoveApply对象", description="")
public class StGifttoproductMoveApply implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "移库单编号")
    private Integer id;

    @ApiModelProperty(value = "赠品编号")
    private Integer giftId;

    @ApiModelProperty(value = "赠品品牌")
    private String giftBrand;

    @ApiModelProperty(value = "赠品型号")
    private String giftModel;

    @ApiModelProperty(value = "移库数量")
    private Integer moveCount;

    @ApiModelProperty(value = "商品编号")
    private Integer productId;

    @ApiModelProperty(value = "商品品牌")
    private String productBrand;

    @ApiModelProperty(value = "商品型号")
    private Integer productModel;

    @ApiModelProperty(value = "源头仓库")
    private String sourceStore;

    @ApiModelProperty(value = "目地仓库")
    private String targetStore;

    @ApiModelProperty(value = "申请人")
    private String proposer;

    @ApiModelProperty(value = "申请时间")
    private LocalDateTime mobileModel;

    @ApiModelProperty(value = "审核日志")
    private String passLog;

    @ApiModelProperty(value = "供应商信息")
    private String supplierInformation;

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
