package com.javasm.salesupply.controller;


import com.alibaba.excel.EasyExcel;
import com.javasm.salesupply.common.http.AxiosResult;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.controller.base.BaseController;
import com.javasm.salesupply.criteria.OrderCriteria;
import com.javasm.salesupply.domain.entity.SaOrder;
import com.javasm.salesupply.excel.OrderExcel;
import com.javasm.salesupply.excel.SalesOutExcel;
import com.javasm.salesupply.service.SaOrderService;
import com.javasm.salesupply.vo.OrderVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author wq
 * @since 2021-07-12
 */
@RestController
@RequestMapping("/salesupply/sa-order")
@Api(value = "SaOrderController", description = "订单管理")
public class SaOrderController extends BaseController {
    @Autowired
    private SaOrderService saOrderService;

    @GetMapping("findAll")
    @ApiOperation(value = "查询订单", notes = "查询所有订单")
    public AxiosResult<List<SaOrder>> finAll() {
        List<SaOrder> list = saOrderService.list();
        return AxiosResult.success(list);
    }

    /**
     * 条件查询
     *
     * @param
     * @return
     */
    @GetMapping("searchPageByCriteria")
    @ApiOperation(value = "查询订单", notes = "查询所有订单")
    public AxiosResult<PageResult<OrderVo>> searchPageByCriteria(OrderCriteria orderCriteria) {
        PageResult<OrderVo> orderVoPageResult = saOrderService.searchPageByCriteria(orderCriteria);

        return AxiosResult.success(orderVoPageResult);
    }

    //    网店
    @GetMapping("searchPageByCriteria2")
    @ApiOperation(value = "查询订单", notes = "查询所有订单 网店")
    public AxiosResult<PageResult<OrderVo>> searchPageByCriteria2(OrderCriteria orderCriteria) {
        PageResult<OrderVo> orderVoPageResult = saOrderService.searchPageByCriteria2(orderCriteria);

        return AxiosResult.success(orderVoPageResult);
    }

    //    待出库
    @GetMapping("searchPageByCriteria3")
    @ApiOperation(value = "查询订单", notes = "查询所有订单 待出库")
    public AxiosResult<PageResult<OrderVo>> searchPageByCriteria3(OrderCriteria orderCriteria) {
        PageResult<OrderVo> orderVoPageResult = saOrderService.searchPageByCriteria3(orderCriteria);

        return AxiosResult.success(orderVoPageResult);
    }
    //    已出库
    @GetMapping("searchPageByCriteria4")
    @ApiOperation(value = "查询订单", notes = "查询所有订单 已出库")
    public AxiosResult<PageResult<OrderVo>> searchPageByCriteria4(OrderCriteria orderCriteria) {
        PageResult<OrderVo> orderVoPageResult = saOrderService.searchPageByCriteria4(orderCriteria);

        return AxiosResult.success(orderVoPageResult);
    }

    @GetMapping("findById")
    @ApiOperation(value = "查看特殊申诉订单", notes = "查询所有特殊申诉订单")
    public AxiosResult<SaOrder> search(Integer orderId) {

        SaOrder saOrder = saOrderService.findById(orderId);
        return AxiosResult.success(saOrder);
    }
    @GetMapping("updateOrderStatus")
    @ApiOperation(value = "修改状态", notes = "修改状态为已出库")
    public void updateOrderStatus(Integer orderId) {
        SaOrder saOrder = new SaOrder();
        saOrder.setOrderId(orderId);
        saOrder.setOrderStatus("已出库");
        int i = saOrderService.updateById(saOrder);

    }

    @GetMapping("orderExcel")
    public void OrderExcel(Integer orderId) throws IOException {

        //随机uuid
        UUID uuid = UUID.randomUUID();
        //获取系统毫秒数
        long millis = System.currentTimeMillis();

        //拼接文件名
        String name = uuid + "-" + millis + "." + "xlsx";


        File file = new File("E:\\order\\" + name);
        File file1 = new File("E:\\order");
//        创建文件
        file1.mkdirs();
//        创建文件
        file.createNewFile();


        EasyExcel.write("E:\\order\\" + name, OrderExcel.class).sheet("写入方法一").doWrite(data(orderId));
    }

    /**
     * 生成出库单
     *
     * @param orderId
     * @throws IOException
     */
    @GetMapping("salesOutExcel")
    public void SalesOutExcel(Integer orderId) throws IOException {
        //        调用修改状态的方法
        updateOrderStatus(orderId);
        System.out.println(orderId);
        //随机uuid
        UUID uuid = UUID.randomUUID();
        //获取系统毫秒数
        long millis = System.currentTimeMillis();

        //拼接文件名
        String name = uuid + "-" + millis + "." + "xlsx";


        File file = new File("E:\\SalesOutExcel\\" + name);
        File file1 = new File("E:\\SalesOutExcel");
//        创建文件
        file1.mkdirs();
//        创建文件
        file.createNewFile();


        EasyExcel.write("E:\\SalesOutExcel\\" + name, SalesOutExcel.class).sheet("写入方法一").doWrite(data2(orderId));
    }

    //生成订单
    public List<OrderExcel> data(Integer orderId) {
        List<OrderExcel> list = new ArrayList<OrderExcel>();
        OrderExcel orderExcel = new OrderExcel();
        SaOrder byId = saOrderService.findById(orderId);
        BeanUtils.copyProperties(byId, orderExcel);
        orderExcel.setCreateTime(byId.getCreateTime().toString());
        orderExcel.setOrderTime(byId.getOrderTime().toString());
        orderExcel.setUpdataTime(byId.getUpdataTime().toString());
        orderExcel.setOrderTothetime(byId.getOrderTothetime().toString());
        list.add(orderExcel);
        return list;
    }

    //    生成入库单
    public List<SalesOutExcel> data2(Integer orderId) {
        List<SalesOutExcel> list = new ArrayList<SalesOutExcel>();
        SalesOutExcel salesOutExcel = new SalesOutExcel();
        SaOrder byId = saOrderService.findById(orderId);
        BeanUtils.copyProperties(byId, salesOutExcel);
        salesOutExcel.setCreateTime(byId.getCreateTime().toString());
        list.add(salesOutExcel);
        return list;
    }


}
