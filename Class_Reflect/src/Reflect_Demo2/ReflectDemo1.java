package Reflect_Demo2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*#### Class类获取成员变量对象的方法
- 方法分类
  | 方法名                              | 说明                           |
  | Field[] getFields()                 | 返回所有公共成员变量对象的数组 |
  | Field[] getDeclaredFields()         | 返回所有成员变量对象的数组     |
  | Field getField(String name)         | 返回单个公共成员变量对象       |
  | Field getDeclaredField(String name) | 返回单个成员变量对象           |*/
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("Reflect_Demo.Student");

        //Field[] getFields()返回所有公共成员变量对象的数组
        Field[] fields1 = c.getFields();
        for (Field field : fields1) {
            System.out.println(field);
        }
        //public java.lang.String Reflect_Demo.Student.address
        System.out.println("----------------");

        //Field[] getDeclaredFields()返回所有成员变量对象的数组
        Field[] fields2 = c.getDeclaredFields();
        for (Field field : fields2) {
            System.out.println(field);
        }
        //private java.lang.String Reflect_Demo.Student.name
        //int Reflect_Demo.Student.age
        //public java.lang.String Reflect_Demo.Student.address
        System.out.println("----------------");

        //Field getField(String name)返回单个公共成员变量对象
        Field addressFiled = c.getField("address");
        //Field getDeclaredField(String name)返回单个成员变量对象
        Field ageFiled = c.getDeclaredField("age");
        Field nameFiled = c.getDeclaredField("name");

        //获取无参构造方法，创建对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
//        obj.addressFiled="香港";//这是错误的，addressFiled本身是一个Filed对象
        // 要调用Field类的方法，设置值:void set​(Object obj, Object value)
        // 将指定的对象参数中由此 Field对象表示的字段设置为指定的新值
        addressFiled.set(obj,"香港");//给obj的成员变量addressFiled赋值为“香港”
        System.out.println(obj);//Student{name='null', age=0, address='香港'}
        ageFiled.setAccessible(true);//暴力反射
        ageFiled.set(obj,45);
        nameFiled.setAccessible(true);//暴力反射
        nameFiled.set(obj,"刘德华");
        System.out.println(obj);//Student{name='刘德华', age=45, address='香港'}


    }
}
