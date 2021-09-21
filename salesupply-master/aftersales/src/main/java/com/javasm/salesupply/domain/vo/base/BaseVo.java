package com.javasm.salesupply.domain.vo.base;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Author：whl
 * @Version：1.0
 * @Date：2021/7/5-11:42
 * @Since:jdk1.8
 */
@Data //使用缓存的时候需要实现
public class BaseVo implements Serializable {
    private Long id;
    /**
     * 创建者
     */
    @JsonIgnore
    private Long createBy;

    /**
     * 创建时间
     */
    @JsonIgnore
    private LocalDateTime createTime;

    /**
     * 修改者
     */
    @JsonIgnore
    private Long updateBy;

    /**
     * 修改时间
     */
    @JsonIgnore
    private LocalDateTime updateTime;

}
