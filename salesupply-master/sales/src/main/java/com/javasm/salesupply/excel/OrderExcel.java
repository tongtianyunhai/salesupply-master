package com.javasm.salesupply.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author：wanqi
 * @Version：1.0
 * @Date：2021/7/17-11:22
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
public class OrderExcel {
    //设置表头

    @ExcelProperty("订单编号")
    private Integer orderId;

    @ExcelProperty("订单分类B2C")
    private String orderClassify;

    @ExcelProperty("订单类型")
    private String orderType;

    @ExcelProperty("下单日期")
    private String orderTime;


    @ExcelProperty("订单动作（1订购、2换购、3支付）")
    private String orderAction;

    @ExcelProperty("业务类型")
    private String orderBusinesstype;

    @ExcelProperty("商品编号")
    private Integer productId;

    @ExcelProperty("商品名称")
    private String productName;

    @ExcelProperty("商品价格")
    private BigDecimal productPrice;

    @ExcelProperty("数量")
    private Integer orderNumber;

    @ExcelProperty("总金额")
    private BigDecimal orderMoney;

    @ExcelProperty("订单状态")
    private String orderStatus;

    @ExcelProperty("会员帐号")
    private Integer userId;

    @ExcelProperty("配送方式")
    private String deliveryMode;

    @ExcelProperty("配送费用")
    private BigDecimal deliveryPrice;

    @ExcelProperty("配送地区")
    private String deliveryArea;

    @ExcelProperty("收货人名称")
    private String deliveryUsername;

    @ExcelProperty("邮政编码")
    private Integer deliveryMailcode;

    @ExcelProperty("收货人地址")
    private String deliveryAddress;

    @ExcelProperty("电子邮箱")
    private String userEmail;

    @ExcelProperty("联系手机")
    private Integer userPhone;

    @ExcelProperty("支付方式")
    private String orderPayment;

    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss", timezone = "GMT+8")
    @ExcelProperty("自提时间")
    private String orderTothetime;

    @ExcelProperty("备注")
    private String orderRemarks;

    @ExcelProperty("汇款人")
    private String orderRemitter;

    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss", timezone = "GMT+8")
    @ExcelProperty("创建时间")
    private String createTime;

    @ExcelProperty("修改人")
    private String updataUser;


    @ExcelProperty("修改时间")
    private String updataTime;
}
