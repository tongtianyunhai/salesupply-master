package com.javasm.salesupply.transfer;

import com.javasm.salesupply.domain.entity.SaOrder;
import com.javasm.salesupply.transfer.base.BaseTransfer;
import com.javasm.salesupply.vo.OrderVo;
import org.springframework.stereotype.Component;

/**
 * @Author：wanqi
 * @Version：1.0
 * @Date：2021/7/14-9:55
 * @Since:jdk1.8
 * @Description:TODO
 */
@Component
public class OrderTransfer extends BaseTransfer<SaOrder,OrderVo> {
}
