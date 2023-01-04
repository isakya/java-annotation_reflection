package com.izumi.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// 通过反射动态的创建对象
public class Test09 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException {
        // 获得Class对象
        Class c1 = Class.forName("com.izumi.reflection.User");
        
        // 构造一个对象
        User user = (User)c1.newInstance(); // 本质上是调用了类的无参构造器
        System.out.println(user);

        // 1. 通过构造器创建对象
        Constructor constructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        User user2 = (User)constructor.newInstance("张三", 6666, 17);
        System.out.println(user2);

        // 2. 通过反射调用普通方法
        User user3 = (User)c1.newInstance();
        // 通过反射获取一个方法
        Method setName = c1.getDeclaredMethod("setName", String.class);

        // invoke: 激活的意思
        // (对象，"方法的值")
        setName.invoke(user3, "izumi");
        System.out.println(user3.getName());

        // 3. 通过反射操作熟悉
        User user4 = (User)c1.newInstance();
        Field name = c1.getDeclaredField("name");

        // 注：不能直接操作私有属性，我们需要关闭程序的安全检测，属性或者方法的setAccessible(true)
        name.setAccessible(true); // 取消安全检测，私有属性就可以直接被访问和修改了
        name.set(user4, "izumi666");
        System.out.println(user4.getName());
    }
}
