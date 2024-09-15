package me.tuzuku.mp.dynamic.table.core;

import me.tuzuku.mp.dynamic.table.config.DynamicTableNameConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@Import(DynamicTableNameConfig.class)
public @interface EnableDynamicTableName {

    /**
     * 动态拦截默认关闭
     */
    boolean value() default true;

}
