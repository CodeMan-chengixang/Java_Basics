package Reflect_Demo2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
练习：通过反射实现如下操作
Student s=new Student()
s.name="张学友";
s.age=33;
s.address="北京";
*/
public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("Reflect_Demo.Student");

        Field name = c.getDeclaredField("name");
        name.setAccessible(true);
        Field age = c.getDeclaredField("age");
        age.setAccessible(true);
        Field address = c.getDeclaredField("address");
        address.setAccessible(true);

        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        name.set(obj,"张学友");
        age.set(obj,33);
        address.set(obj,"北京");

        System.out.println(obj);
        //Student{name='张学友', age=33, address='北京'}
    }
}
