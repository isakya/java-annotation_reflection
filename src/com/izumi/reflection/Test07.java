package com.izumi.reflection;

// �������
public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException {
        // ��ȡϵͳ��ļ�����
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        // ��ȡϵͳ��������ĸ��������--> ��չ�������
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        // ��ȡ��չ��������ĸ��������--> ��������(c/c++)
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

        // ���Ե�ǰ�����ĸ����������ص�
        ClassLoader classLoader = Class.forName("com.izumi.reflection.Test07").getClassLoader();
        System.out.println(classLoader);

        // ����JDK�����������ĸ����������ص�
        classLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);

        // ��λ��ϵͳ����������Լ��ص�·��
        String property = System.getProperty("java.class.path");
        System.out.println(property);


        // ע������������ӡ�������� null����Ϊ�޷�ֱ�ӻ�ȡ��������
    }

}
