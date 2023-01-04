package com.izumi.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// �Զ���ע��
public class Test03 {
    // ע�������ʾ���ƣ����û��Ĭ��ֵ�����Ǿͱ����ע�⸳ֵ
    @MyAnnotation2(name = "ddd", school = {"������", "������"})
    public void test() {

    }

    @MyAnnotation3(value = "123")
    public void test2() {}

}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2 {
    // ע��Ĳ������������� + ������()
    // default Ĭ��ֵ
    String name() default "";
    int age() default 0;
    int id() default -1; // ���Ĭ��ֵΪ-1����������
    String[] school() default {""};
}


@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3 {
    // ֻ��һ������������£�������value����, ��Ϊʹ��ʱ�Ⱥ����value�ǿ���ʡ�Ե�
    String value();
}
