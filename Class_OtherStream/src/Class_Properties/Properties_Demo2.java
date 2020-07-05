package Class_Properties;

import java.util.Properties;
import java.util.Set;

public class Properties_Demo2 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.setProperty("java001", "刘德华");
        prop.setProperty("java002", "张学友");
        prop.setProperty("java003", "黎明");
        prop.setProperty("java004", "郭富城");

        Set<String> names = prop.stringPropertyNames();
        for (String name : names) {
            String value = prop.getProperty(name);
            System.out.println(name + "," + value);
        }
    }
}
