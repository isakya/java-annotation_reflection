package com.izumi.annotation;

import java.util.ArrayList;
import java.util.List;

// ����ע��
public class Test01 extends Object {

    // @Override ��д��ע��
    @Override
    public String toString() {
        return super.toString();
    }

    // @Deprecated ����ע�⣬jdk9���Ƽ�����Աʹ�ã����ǿ���ʹ�ã����ߴ��ڸ��õķ�ʽ
    @Deprecated
    public static void test() {
        System.out.println("Deprecated");
    }
    // @SuppressWarnings ��ѹ����
    @SuppressWarnings("all")
    public void test02() {
        List list = new ArrayList();

    }

    public static void main(String[] args) {
        test();
    }
}
