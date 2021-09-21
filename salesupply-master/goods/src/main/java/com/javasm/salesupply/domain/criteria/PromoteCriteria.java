package com.javasm.salesupply.domain.criteria;

import com.javasm.salesupply.domain.criteria.base.BaseQueryCriteria;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author ：ydw
 * @date ：Created in 2021/7/16 14:48
 */

@Data
public class PromoteCriteria extends BaseQueryCriteria {

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 审核状态 0-未审核 1-已审核 2-未通过
     */
    private Integer approvalStatus;

    /**
     * 活动开始时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date promoteStartime;

    /**
     * 希望价格生效时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date promotePricestartime;

}
