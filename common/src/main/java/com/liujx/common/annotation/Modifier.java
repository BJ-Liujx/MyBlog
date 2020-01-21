package com.liujx.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName: creator
 * @Auther: 刘金鑫
 * @Date: 2020/1/21 15:39
 * @Version: 1.0
 * @Description:
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface Modifier {
    String value() default "";
}
