package com.izumi.annotation;

import java.lang.annotation.*;

// Ԫע��
@MyAnnotation
public class Test02 extends Object {
    // @MyAnnotation
    public void test() {

    }
}

// ����һ��ע��
// @Target ��ʾ���ǵ�ע�����������Щ�ط�
@Target(value = {ElementType.METHOD, ElementType.TYPE})
// @Retention ��ʾע����ʲôʱ�����Ч��return > class > sources
@Retention(value = RetentionPolicy.RUNTIME)
// @Documented ��ʾ�Ƿ����ǵ�ע��������JAVAdoc��
@Documented
// @Inherited ��ʾ������Լ̳и����ע��
@Inherited
@interface MyAnnotation {

}
