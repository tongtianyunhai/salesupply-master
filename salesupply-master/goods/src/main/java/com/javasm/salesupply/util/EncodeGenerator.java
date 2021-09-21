package com.javasm.salesupply.util;

import java.util.Date;
import java.util.UUID;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/7/15-21:04
 * @Since:jdk1.8
 * @Description:TODO
 */

public class EncodeGenerator {

    /**
     * encode编码随机生成  应该不会重复
     * @return
     */
    public static String encodeGenerator() {
        Date date = new Date();
        long time = date.getTime();
        UUID uuid = UUID.randomUUID();
        String substring = uuid.toString().substring(0, 12).replace('-','9');
        return time + substring;
    }

}