package Reflect_Practice1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*2、
[题目二]
有如下学生实体类：
package com.itheima;
public class Student {
    private String name;
    private int age;

    public Student() {
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 自行补充getters and setters

    // 显示信息的方法
    public void showInfo() {
        System.out.println(name + " - " + age);
    }
}
请编写一个方法setProperty，该方法可以接收三个参数，
第一个为Object类型的obj对象，第二个为String类型的propertyName，第三个为Object类型的value，
方法的作用是能够为obj对象中名为propertyName的属性的值设置为value。在主方法中调用方法进行测试*/
public class ReflectPractice {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException {
/*
        Student s=new Student();
        setProperty(s,"name","zhangsan");
        setProperty(s,"age",23);
        s.showInfo();
*/
        Class<?> c = Class.forName("Reflect_Practice1.Student");
        Constructor<?> con = c.getDeclaredConstructor(String.class, int.class);
        Object obj = con.newInstance("张三", 21);
        setProperty(obj,"name","李四");
        setProperty(obj,"age",22);

        Method showInfo = c.getDeclaredMethod("showInfo");
        showInfo.setAccessible(true);
        showInfo.invoke(obj);

    }

    public static void setProperty(Object obj, String propertyName, Object value) throws NoSuchFieldException, IllegalAccessException {
        Class<?> c = obj.getClass();
        Field name = c.getDeclaredField(propertyName);
        name.setAccessible(true);
        name.set(obj, value);
    }
}
