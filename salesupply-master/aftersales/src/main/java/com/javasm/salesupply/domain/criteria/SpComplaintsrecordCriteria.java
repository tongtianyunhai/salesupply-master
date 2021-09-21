package com.javasm.salesupply.domain.criteria;

import com.javasm.salesupply.domain.criteria.base.BaseQueryCriteria;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDate;

/**
 * @Author：戈李阳
 * @Version：1.0
 * @Date：2021/7/14-16:33
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
public class SpComplaintsrecordCriteria extends BaseQueryCriteria {
    private String spComplaintsid;





    private Integer orderId;//销售订单编号

    private Integer productId;//商品编码

    private String productName;//商品名

    private Integer orderImei;//商品串码

    private String  orderGoodscolor;//商品颜色

    private String orderGoodstype;//商品类型


    @ApiModelProperty(value = "投诉工单号")
    private String spComplaintsorderid;

    private String spComplaintsname;

    @ApiModelProperty(value = "申诉描述")
    private String spComplaintsdescribe;

    @ApiModelProperty(value = "申诉来源")
    private String spComplaintsource;

    @ApiModelProperty(value = "申诉记录状态[已答复:1 二次答复:2 收货核实:3]")
    private Integer spComplaintstatus;

    @ApiModelProperty(value = "申诉人")
    private String spComplainter;

    @ApiModelProperty(value = "申诉日期")
    private LocalDate spComplaintstime;

    @ApiModelProperty(value = "申诉人联系方式")
    private String spComplaintstele;

    @ApiModelProperty(value = "申诉商品编码")
    private String spComplaintsgoodsid;

    @ApiModelProperty(value = "申诉商品名称")
    private String spComplaintsgoodsname;

    @ApiModelProperty(value = "申诉商品型号")
    private String spComplaintsgoodstype;

    @ApiModelProperty(value = "申诉商品颜色 ")
    private String spComplaintsgoodscolor;

    @ApiModelProperty(value = "申诉商品串码")
    private String spComplaintsgoodsiemi;



    @ApiModelProperty(value = "申诉商品销售订单编号")
    private String spSalesorderid;

    @ApiModelProperty(value = "记录人")
    private String spCreateBy;

    @ApiModelProperty(value = "记录日期")
    private LocalDate spCreateTime;

    @ApiModelProperty(value = "审批人")
    private String spChecker;

    @ApiModelProperty(value = "审批日期")
    private LocalDate spChecktime;

    @ApiModelProperty(value = "客服答复意见")
    private String spReplies;

    @ApiModelProperty(value = "客服答复日期")
    private LocalDate spRepliestime;

    @ApiModelProperty(value = "二次客服答复意见")
    private String spSecondreplies;

    @ApiModelProperty(value = "二次客服答复日期")
    private LocalDate spSecondrepliestime;


    @ApiModelProperty(value = "二次客服人员工号")
    private String spSupporterid;

    @ApiModelProperty(value = "收货核实人")
    private String spGoodschecker;

    @ApiModelProperty(value = "收货核实意见")
    private String spCheckcomment;

    @ApiModelProperty(value = "收货核实意见日期")
    private LocalDate spCheckcommenttime;

    @ApiModelProperty(value = "备注")
    private String spAddtion;

    @ApiModelProperty(value = "预留字段1")
    private String spRemark1;

    @ApiModelProperty(value = "预留字段2")
    private String spRemark2;

    @ApiModelProperty(value = "预留字段3")
    private String spRemark3;

    @ApiModelProperty(value = "预留字段4")
    private String spRemark4;

    @ApiModelProperty(value = "修改人")
    private Integer spUpdateBy;

    @ApiModelProperty(value = "修改日期")
    private LocalDate spUpdateTime;


}