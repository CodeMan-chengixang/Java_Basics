package Reflect_Demo1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*案例需求
- 通过反射获取公共的构造方法并创建对象*/
public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("Reflect_Demo.Student");
        Constructor<?> con = c.getConstructor(String.class,int.class,String.class);
        Object obj = con.newInstance("刘德华", 45, "香港");
        System.out.println(obj);

    }
}
