package com.javasm.salesupply.domain.vo;

import com.javasm.salesupply.domain.vo.base.BaseVo;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author ：ydw
 * @date ：Created in 2021/7/16 14:47
 */
@Data
public class GdPromoteVO  {

    /**
     *  促销活动主键ID
     */
    private Integer promoteId;
    /**
     * 商品ID
     */
    private Integer goodsId;
    /**
     * 活动名称
     */
    private String promoteName;
    /**
     * 活动开始时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date promoteStartime;
    /**
     * 商场促销价
     */
    private String promoteShopProprice;
    /**
     * 希望价格生效时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date promotePricestartime;
    /**
     * 审核状态 0-未审核 1-已审核 2-未通过
     */
    private Integer approvalStatus;

}
