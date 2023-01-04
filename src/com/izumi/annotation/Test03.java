package com.izumi.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 自定义注解
public class Test03 {
    // 注解可以显示复制，如果没有默认值，我们就必须给注解赋值
    @MyAnnotation2(name = "ddd", school = {"啦啦啦", "略略略"})
    public void test() {

    }

    @MyAnnotation3(value = "123")
    public void test2() {}

}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2 {
    // 注解的参数：参数类型 + 参数名()
    // default 默认值
    String name() default "";
    int age() default 0;
    int id() default -1; // 如果默认值为-1，代表不存在
    String[] school() default {""};
}


@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3 {
    // 只有一个参数的情况下，建议用value命名, 因为使用时等号左边value是可以省略的
    String value();
}
