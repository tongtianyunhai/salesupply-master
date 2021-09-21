package com.javasm.salesupply.domain.vo;

import com.javasm.salesupply.domain.vo.base.BaseVo;
import lombok.Data;

/**
 * @author ：ydw
 * @date ：Created in 2021/7/12 17:16
 */

@Data
public class GtGiftVO extends BaseVo {
    /**
     *  赠品id
     */
    private Integer giftId;
    /**
     * 赠品名称
     */
    private String giftName;

    /**
     * 赠品类型
     */
    private String giftClassify;

    /**
     * 最低库存量
     */
    private Integer giftLowstock;

    /**
     * 赠品单价
     */
    private Integer giftPrice;

    /**
     * 赠品成本
     */
    private Integer giftCost;

    /**
     * 赠品状态 1-有效  0-无效
     */
    private Integer giftStatus;

}
