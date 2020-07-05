package Reflect_Test01;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/*#### 反射练习之越过泛型检查
- 案例需求
  - 通过反射技术，向一个泛型为Integer的集合中添加一些字符串数据*/
public class ReflectTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> array=new ArrayList<>();
        Class<? extends ArrayList> c = array.getClass();
        Method add = c.getMethod("add", Object.class);
        add.invoke(array,"hello");
        add.invoke(array,"world");
        add.invoke(array,"java");
        System.out.println(array);
    }
}
