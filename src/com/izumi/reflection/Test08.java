package com.izumi.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// ��������Ϣ
public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("com.izumi.reflection.User");

        // ����������
        System.out.println(c1.getName()); // ��ð���+����
        System.out.println(c1.getSimpleName()); // ��ð���

        // ����������
        Field[] fields = c1.getFields(); // ֻ���ҵ�public����
        for (Field field : fields) {
            System.out.println(field);
        }


        Field[] fields1 = c1.getDeclaredFields(); // ���ҵ�ȫ��������
        for (Field field : fields1) {
            System.out.println(field);
        }

        // ��ȡָ�����Ե�ֵ
        Field name = c1.getDeclaredField("name");
        System.out.println(name);
        
        // �����ķ���
        Method[] methods = c1.getMethods(); // ��ñ��༰�丸���ȫ��public����
        for (Method method : methods) {
            System.out.println("methods�ģ�" + method);
        }
        Method[] declaredMethods = c1.getDeclaredMethods(); // ��ñ�������з���
        for (Method declaredMethod : declaredMethods) {
            System.out.println("declaredMethods�ģ�" + declaredMethod);
        }

        // ���ָ������
        // ��Ϊjava�����أ�������Ҫ���������ͣ��������ֱܷ�����ĸ�����
        Method getName = c1.getMethod("getName", null);
        Method setName = c1.getMethod("setName", String.class);
        System.out.println(getName);
        System.out.println(setName);

        // ��ȡָ���Ĺ�����
        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        Constructor[] declaredConstructors = c1.getDeclaredConstructors(); // ��ȡȫ���Ĺ��췽��
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        
        // ���ָ���Ĺ�����
        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        System.out.println(declaredConstructor);
    }
}
