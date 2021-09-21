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
 * @Date：2021/7/14-16:23
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SpComplaintsrecordVo对象", description="特殊申诉表")
public class SpComplaintsrecordVo extends BaseVo {


    private String spComplaintsname;

    @ApiModelProperty(value = "申诉记录编号")
    @TableId(value = "sp_complaintsid", type = IdType.AUTO)
    private Integer spComplaintsid;

    @ApiModelProperty(value = "申诉来源")
    private String spComplaintsource;

    @ApiModelProperty(value = "申诉记录状态[已答复:1 二次答复:2 收货核实:3]")
    private Integer spComplaintstatus;

    @ApiModelProperty(value = "申诉商品串码")
    private String spComplaintsgoodsiemi;

    @ApiModelProperty(value = "创建人")
    private String spCreateBy;

    @ApiModelProperty(value = "创建日期")
    private LocalDate spCreateTime;

    @ApiModelProperty(value = "客服答复意见")
    private String spReplies;

    @ApiModelProperty(value = "二次客服答复意见")
    private String spSecondreplies;


    @ApiModelProperty(value = "收货核实人")
    private String spGoodschecker;

    @ApiModelProperty(value = "审批人")
    private String spChecker;

    @ApiModelProperty(value = "审批日期")
    private LocalDate spChecktime;
}
