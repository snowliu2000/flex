package com.xjy.app.sales.aspect;

import java.lang.annotation.*;

/**
 * FeignResult
 *
 * 一句话功能简述 功能详细描述
 *
 * @author hewei
 * @version [1.0.0, 2019-03-04]
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface FeignConverter {

    /**
     * 需要转大写的字段
     */
    String[] upper() default {};

    /**
     * 需要转小写的字段
     */
    String[] lower() default {};
}
