package Reflect_Demo3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*### 反射获取成员方法并使用【应用】
#### 2.8.1Class类获取成员方法对象的方法
- 方法分类
  | Method[] getMethods()返回所有公共成员方法对象的数组，包括继承的 |
  | Method[] getDeclaredMethods()返回所有成员方法对象的数组，不包括继承的   |
  | Method getMethod(String name, Class<?>... parameterTypes)返回单个公共成员方法对象                   |
  | Method getDeclaredMethod(String name, Class<?>... parameterTypes)返回单个成员方法对象                       |*/
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("Reflect_Demo.Student");
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        //Method[] getMethods()返回所有公共成员方法对象的数组，包括继承的
        Method[] methods1 = c.getMethods();
        for (Method method : methods1) {
            System.out.println(method);
        }
        System.out.println("-----------------------");
        //public java.lang.String Reflect_Demo.Student.toString()
        //public void Reflect_Demo.Student.method1()
        //public java.lang.String Reflect_Demo.Student.method3(java.lang.String,int)
        //public void Reflect_Demo.Student.method2(java.lang.String)
        //public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
        //public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
        //public final void java.lang.Object.wait() throws java.lang.InterruptedException
        //public boolean java.lang.Object.equals(java.lang.Object)
        //public native int java.lang.Object.hashCode()
        //public final native java.lang.Class java.lang.Object.getClass()
        //public final native void java.lang.Object.notify()
        //public final native void java.lang.Object.notifyAll()

        //Method[] getDeclaredMethods()返回所有成员方法对象的数组，不包括继承的
        Method[] methods2 = c.getDeclaredMethods();
        for (Method method : methods2) {
            System.out.println(method);
        }
        System.out.println("-----------------------------");
        //public java.lang.String Reflect_Demo.Student.toString()
        //private void Reflect_Demo.Student.function()
        //public java.lang.String Reflect_Demo.Student.method3(java.lang.String,int)
        //public void Reflect_Demo.Student.method2(java.lang.String)
        //public void Reflect_Demo.Student.method1()

        //Method getMethod(String name, Class<?>... parameterTypes)返回单个公共成员方法对象
        Method method1Method = c.getMethod("method1");
//在类或接口上提供有关单一方法的信息和访问权限
//Object invoke(Object obj, Object... args)
// 在具有指定参数的指定对象上调用此方法对象表示的基础方法
        //Object：返回值类型
        //obj：调用方法的对象
        //args：方法需要的参数
        method1Method.invoke(obj);//输出公共方法method1
        System.out.println("---------------------------");

        //Method getDeclaredMethod(String name, Class<?>... parameterTypes)返回单个成员方法对象
        Method method1 = c.getDeclaredMethod("method1");
        method1.setAccessible(true);
        method1.invoke(obj);
        //公共方法method1

        Method method2 = c.getDeclaredMethod("method2", String.class);
        method2.setAccessible(true);
        method2.invoke(obj, "obj反射调用了带参数的method2");
        //公共方法method2：obj反射调用了带参数的method2

        Method method3 = c.getDeclaredMethod("method3", String.class, int.class);
        method3.setAccessible(true);
        Object s = method3.invoke(obj, "obj反射调用了带两个参数的method3并且有返回值", 3);
        System.out.println(s);
        //obj反射调用了带两个参数的method3并且有返回值

        Method function = c.getDeclaredMethod("function");
        function.setAccessible(true);
        function.invoke(obj);
        //私有方法function
    }
}
