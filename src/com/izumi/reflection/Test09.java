package com.izumi.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// ͨ�����䶯̬�Ĵ�������
public class Test09 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException {
        // ���Class����
        Class c1 = Class.forName("com.izumi.reflection.User");
        
        // ����һ������
        User user = (User)c1.newInstance(); // �������ǵ���������޲ι�����
        System.out.println(user);

        // 1. ͨ����������������
        Constructor constructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        User user2 = (User)constructor.newInstance("����", 6666, 17);
        System.out.println(user2);

        // 2. ͨ�����������ͨ����
        User user3 = (User)c1.newInstance();
        // ͨ�������ȡһ������
        Method setName = c1.getDeclaredMethod("setName", String.class);

        // invoke: �������˼
        // (����"������ֵ")
        setName.invoke(user3, "izumi");
        System.out.println(user3.getName());

        // 3. ͨ�����������Ϥ
        User user4 = (User)c1.newInstance();
        Field name = c1.getDeclaredField("name");

        // ע������ֱ�Ӳ���˽�����ԣ�������Ҫ�رճ���İ�ȫ��⣬���Ի��߷�����setAccessible(true)
        name.setAccessible(true); // ȡ����ȫ��⣬˽�����ԾͿ���ֱ�ӱ����ʺ��޸���
        name.set(user4, "izumi666");
        System.out.println(user4.getName());
    }
}
