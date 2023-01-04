package com.izumi.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// 获得类的信息
public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("com.izumi.reflection.User");

        // 获得类的名字
        System.out.println(c1.getName()); // 获得包名+类名
        System.out.println(c1.getSimpleName()); // 获得包名

        // 获得类的属性
        Field[] fields = c1.getFields(); // 只能找到public属性
        for (Field field : fields) {
            System.out.println(field);
        }


        Field[] fields1 = c1.getDeclaredFields(); // 能找到全部的属性
        for (Field field : fields1) {
            System.out.println(field);
        }

        // 获取指定属性的值
        Field name = c1.getDeclaredField("name");
        System.out.println(name);
        
        // 获得类的方法
        Method[] methods = c1.getMethods(); // 获得本类及其父类的全部public方法
        for (Method method : methods) {
            System.out.println("methods的：" + method);
        }
        Method[] declaredMethods = c1.getDeclaredMethods(); // 获得本类的所有方法
        for (Method declaredMethod : declaredMethods) {
            System.out.println("declaredMethods的：" + declaredMethod);
        }

        // 获得指定方法
        // 因为java有重载，所以需要丢参数类型，这样才能分辨出是哪个方法
        Method getName = c1.getMethod("getName", null);
        Method setName = c1.getMethod("setName", String.class);
        System.out.println(getName);
        System.out.println(setName);

        // 获取指定的构造器
        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        Constructor[] declaredConstructors = c1.getDeclaredConstructors(); // 获取全部的构造方法
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        
        // 获得指定的构造器
        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        System.out.println(declaredConstructor);
    }
}
