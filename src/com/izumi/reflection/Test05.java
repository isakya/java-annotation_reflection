package com.izumi.reflection;

// ������ڴ����
public class Test05 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(A.m);

        /***
         * 1.���ص��ڴ棬�����һ�����ӦClass����
         * 2. ���ӣ����ӽ����� m = 0
         * 3. ��ʼ��
         *      <clinit>() {
         *              System.out.println("A�ྲ̬������ʼ��");
         *              m = 300;
         *              m = 100;
         *      }
         */
    }
}

class A {
    static {
        System.out.println("A�ྲ̬������ʼ��");
        m = 300;
    }

    static int m = 100;


    public A() {
        System.out.println("A����޲ι����ʼ��");
    }
}