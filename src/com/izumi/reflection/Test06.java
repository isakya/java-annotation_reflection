package com.izumi.reflection;

// ������ʲôʱ����ʼ��
public class Test06 {
    static {
        System.out.println("main�౻����");
    }


    public static void main(String[] args) throws ClassNotFoundException {
        /***
         *  ��ʱ�ᷢ����ĳ�ʼ����
         *      ����������ã�һ���ᷢ����ĳ�ʼ����
         *
         *  �಻���ʼ��������ǣ�
         *      ��ı������ã����ᷢ����ĳ�ʼ����
         *
         */
        // 1. ��������
        // Son son = new Son();

        // ����Ҳ����������������
        // Class.forName("com.izumi.reflection.Son");

        // 2. �������������õķ���
        // System.out.println(Son.b);

        // ����һ������Ҳ���ᷢ����ĳ�ʼ��
        // Son[] array = new Son[5];
        // �������ᴥ����ĳ�ʼ��
        // System.out.println(Son.M);
    }
}
class Father {
    static int b = 2;
    static {
        System.out.println("���౻����");
    }
}

class Son extends Father {
    static {
        System.out.println("���౻����");
        m = 300;
    }

    static int m = 100;
    static final int M = 1;
}
