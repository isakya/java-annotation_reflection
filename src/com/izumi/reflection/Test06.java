package com.izumi.reflection;

// 测试类什么时候会初始化
public class Test06 {
    static {
        System.out.println("main类被加载");
    }


    public static void main(String[] args) throws ClassNotFoundException {
        /***
         *  何时会发生类的初始化？
         *      类的主动引用（一定会发生类的初始化）
         *
         *  类不会初始化的情况是？
         *      类的被动引用（不会发生类的初始化）
         *
         */
        // 1. 主动引用
        // Son son = new Son();

        // 反射也会产生类的主动引用
        // Class.forName("com.izumi.reflection.Son");

        // 2. 不会产生类的引用的方法
        // System.out.println(Son.b);

        // 定义一个数组也不会发生类的初始化
        // Son[] array = new Son[5];
        // 常量不会触发类的初始化
        // System.out.println(Son.M);
    }
}
class Father {
    static int b = 2;
    static {
        System.out.println("父类被加载");
    }
}

class Son extends Father {
    static {
        System.out.println("子类被加载");
        m = 300;
    }

    static int m = 100;
    static final int M = 1;
}
