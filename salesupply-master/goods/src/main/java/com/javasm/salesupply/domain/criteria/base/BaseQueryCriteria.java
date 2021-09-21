package com.javasm.salesupply.domain.criteria.base;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/7/12-22:11
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
public class BaseQueryCriteria {
    private Integer currentPage=1;//当前所在页

    private Integer pageSize=5;//当前页显示

    //开始时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime startTime;
    //结束时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime endTime;
}