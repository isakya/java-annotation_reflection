package com.izumi.reflection;

// 类加载器
public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        // 获取系统类加载器的父类加载器--> 扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        // 获取扩展类加载器的父类加载器--> 根加载器(c/c++)
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

        // 测试当前类是哪个加载器加载的
        ClassLoader classLoader = Class.forName("com.izumi.reflection.Test07").getClassLoader();
        System.out.println(classLoader);

        // 测试JDK内置类是由哪个加载器加载的
        classLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);

        // 如何获得系统类加载器可以加载的路径
        String property = System.getProperty("java.class.path");
        System.out.println(property);


        // 注：根加载器打印出来的是 null，因为无法直接获取根加载器
    }

}
