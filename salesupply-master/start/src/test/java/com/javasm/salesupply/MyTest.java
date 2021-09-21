package com.javasm.salesupply;

import com.javasm.salesupply.common.http.AxiosResult;
import com.javasm.salesupply.controller.GdBrandController;
import com.javasm.salesupply.domain.criteria.AdjustCriteria;
import com.javasm.salesupply.domain.entity.GdBrand;
import com.javasm.salesupply.domain.vo.AdjustVO;
import com.javasm.salesupply.mapper.GtAdjustMapper;
import com.javasm.salesupply.mapper.PromoteApprovalDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/7/13-20:48
 * @Since:jdk1.8
 * @Description:TODO
 */
@SpringBootTest(classes = SaleSupplyApplication.class)
public class MyTest {
    @Autowired
    private GdBrandController gdBrandController;

    @Autowired
    private PromoteApprovalDao promoteApprovalDao;

    @Autowired
    private GtAdjustMapper gtAdjustMapper;

    @Test
    public void test(){
        GdBrand gdBrand = new GdBrand();
        gdBrand.setBrandName("reew");

        AxiosResult<Boolean> save = gdBrandController.save(gdBrand);

        System.out.println(save);
    }

    @Test
    public void testT() {
        int insert = promoteApprovalDao.selectMaxId();
        System.out.println(insert);

    }
    @Test
    public void testT1() {
        List<AdjustVO> adjustVOS = gtAdjustMapper.selectVO(new AdjustCriteria());

        System.out.println(adjustVOS);

    }
}