package com.javasm.salesupply.domain.vo;

import com.javasm.salesupply.domain.vo.base.BaseVo;
import lombok.Data;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/7/14-14:46
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
public class ClassifyVO extends BaseVo {

    private Integer classifyId;
    /**
     * 商品类型名称
     */
    private String classifyName;
    /**
     * 品牌类型描述
     */
    private String classifyDes;
    /**
     * parentId  0-父类 其他-子类
     */
    private Integer classifyIsparent;
}