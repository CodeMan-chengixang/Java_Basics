package Class_Properties;

import java.util.Properties;
import java.util.Set;

public class Properties_Demo1 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.put("java001", "刘德华");
        prop.put("java002", "张学友");
        prop.put("java003", "黎明");
        prop.put("java004", "郭富城");
        Set<Object> keySet = prop.keySet();
        for (Object key : keySet) {
            Object value = prop.get(key);
            System.out.println(key + "," + value);
        }
    }
}
