package com.izumi.reflection;

// ����Class��Ĵ�����ʽ����Щ
public class Test03 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("������ǣ�" + person.name);

        // ��ʽһ��ͨ��������
        Class c1 = person.getClass();
        System.out.println(c1.hashCode());

        // ��ʽ����forName���
        Class c11 = Class.forName("com.izumi.reflection.Student");
        System.out.println(c11.hashCode());

        // ��ʽ����ͨ������.class���
        Class c111 = Student.class;
        System.out.println(c111.hashCode());

        // ��ʽ�ģ������������͵İ�װ�඼��һ��Type����
        Class c1111 = Integer.TYPE;
        System.out.println(c1111);

        // ��ø�������
        Class c11111 = c1.getSuperclass();
        System.out.println(c11111);
    }
}

class Person {
    public String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}


class Student extends Person {
    public Student () {
        this.name = "ѧ��";
    }
}

class Teacher extends Person {
    public Teacher () {
        this.name = "��ʦ";
    }
}