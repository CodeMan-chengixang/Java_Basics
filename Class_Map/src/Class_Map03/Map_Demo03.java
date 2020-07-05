package Class_Map03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*测试类
 * 创建一个HashMap集合，键是学生对象，值是居住地，存储多个键值对元素并遍历
 * 要求保证键的唯一性：如果学生对象的成员变量值相同，我们就认为是同一个对象*/
public class Map_Demo03 {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<>();
        hm.put(new Student("李小龙", 18), "北京");
        hm.put(new Student("叶问", 19), "香港");
        hm.put(new Student("黄飞鸿", 22), "佛山");
        hm.put(new Student("黄飞鸿", 22), "广东");

        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> me : entries) {
            Student key = me.getKey();
            String value = me.getValue();
            System.out.println(key.getName() + "," + key.getAge() + "," + value);

        }
    }
}
