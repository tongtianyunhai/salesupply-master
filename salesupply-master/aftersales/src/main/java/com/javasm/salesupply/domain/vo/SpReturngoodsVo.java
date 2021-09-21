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
 * @Author：戈李阳
 * @Version：1.0
 * @Date：2021/7/14-14:53
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SpReturngoodsVo对象", description="退货申请单")
public class SpReturngoodsVo extends BaseVo {

    @ApiModelProperty(value = "退货申请单编号")
    @TableId(value = "sp_orderid", type = IdType.AUTO)
    private Integer spOrderid;

    @ApiModelProperty(value = "销售订单编号")
    private String spSellsid;

    @ApiModelProperty(value = "退换货类型（退货:2）")
    private Integer spHandletype;

    @ApiModelProperty(value = "商品串码")
    private String spGoodsiemi;

    @ApiModelProperty(value = "制单人")
    private String spCreateBy;

    @ApiModelProperty(value = "制单日期")
    private LocalDate spCreateDate;

    @ApiModelProperty(value = "制单部门")
    private Integer spOrderdepartment;


    @ApiModelProperty(value = "审批人")
    private String spChecker;

    @ApiModelProperty(value = "审批意见")
    private String spCheckcomment;

    @ApiModelProperty(value = "审批状态[初始:1 审批通过:2  不通过:3]")
    private Integer spCheckstatus;


}
