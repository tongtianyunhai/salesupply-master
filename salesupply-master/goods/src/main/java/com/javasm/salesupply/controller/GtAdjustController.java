package com.javasm.salesupply.controller;


import com.javasm.salesupply.common.http.AxiosResult;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.controller.base.BaseController;
import com.javasm.salesupply.domain.criteria.AdjustCriteria;
import com.javasm.salesupply.domain.entity.GtAdjust;
import com.javasm.salesupply.domain.vo.AdjustVO;
import com.javasm.salesupply.service.IGtAdjustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author chy
 * @since 2021-07-17
 */
@RestController
@RequestMapping("/gtAdjust")
public class GtAdjustController extends BaseController {

    @Autowired
    private IGtAdjustService gtAdjustService;


    @RequestMapping("addAdjust")
    public AxiosResult<Boolean> addProduct(@RequestBody GtAdjust gtAdjust) {
        boolean save = gtAdjustService.saveAndCreateApproval(gtAdjust);
        return toAxiosResult(save);
    }


    /**
     *  @author: chy
     *  @Date: 分页查询 14:46
     *  @Description:
     */
    @RequestMapping("searchPageByCriteria")
    public AxiosResult<PageResult<AdjustVO>> searchPageByCriteria(@RequestBody AdjustCriteria adjustCriteria) {
        PageResult<AdjustVO> productVOPageResult = gtAdjustService.searchPageByCriteria(adjustCriteria);
        return AxiosResult.success(productVOPageResult);
    }
//    /**
//     *  @author: chy
//     *  @Date: 分页查询 14:46
//     *  @Description:
//     */
//    @RequestMapping("update")
//    public AxiosResult<PageResult<AdjustVO>> update(@RequestBody AdjustCriteria adjustCriteria) {
//        PageResult<AdjustVO> productVOPageResult = gtAdjustService.update(adjustCriteria);
//        return AxiosResult.success(productVOPageResult);
//    }
}
