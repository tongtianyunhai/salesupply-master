package com.javasm.salesupply.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * @Author：wanqi
 * @Version：1.0
 * @Date：2021/7/17-17:03
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
public class SalesOutExcel {
    @ExcelProperty("订单编号")
    private Integer orderId;
    @ExcelProperty("订单类型")
    private String orderType;
    @ExcelProperty("订单动作（1订购、2换购、3支付）")
    private String orderAction;

    @ExcelProperty("业务类型")
    private String orderBusinesstype;
    @ExcelProperty("支付方式")
    private String orderPayment;

    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss", timezone = "GMT+8")
    @ExcelProperty("创建时间")
    private String createTime;

    @ExcelProperty("订单状态")
    private String orderStatus;
}
