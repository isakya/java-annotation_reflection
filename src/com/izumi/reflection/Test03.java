package com.izumi.reflection;

// 测试Class类的创建方式有哪些
public class Test03 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("这个人是：" + person.name);

        // 方式一：通过对象获得
        Class c1 = person.getClass();
        System.out.println(c1.hashCode());

        // 方式二：forName获得
        Class c11 = Class.forName("com.izumi.reflection.Student");
        System.out.println(c11.hashCode());

        // 方式三：通过类名.class获得
        Class c111 = Student.class;
        System.out.println(c111.hashCode());

        // 方式四：基本内置类型的包装类都有一个Type属性
        Class c1111 = Integer.TYPE;
        System.out.println(c1111);

        // 获得父类类型
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
        this.name = "学生";
    }
}

class Teacher extends Person {
    public Teacher () {
        this.name = "老师";
    }
}