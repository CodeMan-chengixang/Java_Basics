package Reflect_Demo1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("Reflect_Demo.Student");
        //Constructor<?>[] getConstructors​() 返回一个包含 Constructor对象的数组，
        // Constructor对象反映了由该 Class对象表示的类的所有公共构造函数。
        Constructor<?>[] cons1 = c.getConstructors();
        for (Constructor<?> con : cons1) {
            System.out.println(con);
            //public Reflect_Demo.Student(java.lang.String,int,java.lang.String)
            //public Reflect_Demo.Student()
        }
        System.out.println("-----------------");

        //Constructor<?>[] getDeclaredConstructors​()
        // 返回反映由该 Class对象表示的类声明的所有(包括私有)构造函数的 Constructor对象的数组
        Constructor<?>[] cons2 = c.getDeclaredConstructors();
        for (Constructor<?> con : cons2) {
            System.out.println(con);
            //public Reflect_Demo.Student(java.lang.String,int,java.lang.String)
            //public Reflect_Demo.Student()
            //public Reflect_Demo.Student(java.lang.String,int,java.lang.String)
            //Reflect_Demo.Student(java.lang.String,int)
            //private Reflect_Demo.Student(java.lang.String)
            //public Reflect_Demo.Student()
        }
        System.out.println("------------------");

        //Constructor<T> getConstructor​(Class<?>... parameterTypes) 返回一个 Constructor对象，
        // 该对象反映由该 Class对象表示的类的指定公共构造函数
        Constructor<?> con1 = c.getConstructor();
        System.out.println(con1);//public Reflect_Demo.Student()

        //Constructor<T> getDeclaredConstructor​(Class<?>... parameterTypes)
        // 返回一个 Constructor对象，该对象反映由此 Class对象表示的类或接口的指定(包括私有)构造函数
        Constructor<?> con2 = c.getDeclaredConstructor();
        System.out.println(con2);//public Reflect_Demo.Student()
        //T newInstance​(Object... initargs) 使用由此 Constructor对象表示的构造函数，
        // 使用指定的初始化参数来创建和初始化构造函数的声明类的新实例。
        System.out.println("---------------");
        Object obj = con1.newInstance();
        System.out.println(obj);//Student{name='null', age=0, address='null'}

    }
}
