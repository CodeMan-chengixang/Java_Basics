package Reflect_Demo1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*案例需求
- 通过反射获取私有构造方法并创建对象
    private Student(String name) {
        this.name = name;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
void setAccessible​(boolean flag) 将此反射对象的 accessible标志设置为指示的布尔值。
 即为暴力反射：取消访问检查*/
public class ReflectDemo3 {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException, ClassNotFoundException {
        Class<?> c = Class.forName("Reflect_Demo.Student");

        Constructor<?> con1 = c.getDeclaredConstructor(String.class);
        con1.setAccessible(true);//暴力反射
        Object obj1 = con1.newInstance("刘德华");//访问异常,要设置暴力反射再创建对象
        System.out.println(obj1);//Student{name='刘德华', age=0, address='null'}

        Constructor<?> con2 = c.getDeclaredConstructor(String.class, int.class);
        con2.setAccessible(true);//暴力反射
        Object obj2 = con2.newInstance("刘德华", 45);//访问异常,要设置暴力反射再创建对象
        System.out.println(obj2);//Student{name='刘德华', age=45, address='null'}
    }
}
