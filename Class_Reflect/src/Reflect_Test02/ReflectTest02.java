package Reflect_Test02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Set;

/*#### 运行配置文件中指定类的指定方法
- 案例需求
  - 通过反射运行配置文件中指定类的指定方法*/
public class ReflectTest02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Properties prop=new Properties();
        FileReader fr=new FileReader("Class_Reflect\\class.txt");
        prop.load(fr);
        fr.close();
/*        Set<String> names = prop.stringPropertyNames();
        for (String name : names) {
            String value = prop.getProperty(name);
            System.out.println(name+","+value);
        }*/

        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");

        Class<?> c = Class.forName(className);
        Constructor<?> con = c.getConstructor();
        Object obj= con.newInstance();
        Method method = c.getMethod(methodName);
        method.invoke(obj);
    }
}
