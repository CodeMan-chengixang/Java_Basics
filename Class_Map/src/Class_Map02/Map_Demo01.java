package Class_Map02;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*测试类
 * 创建一个HashMap集合，键是学号，值是学生对象，存储3个键值对对象并遍历*/
public class Map_Demo01 {
    public static void main(String[] args) {
        HashMap<String, Student> hm = new HashMap<>();
        Student s1 = new Student("黄飞鸿", 34);
        Student s2 = new Student("叶问", 35);
        Student s3 = new Student("李小龙", 36);
        hm.put("xuehao001", s1);
        hm.put("xuehao002", s2);
        hm.put("xuehao003", s3);

//        遍历map集合方式一：
        Set<String> key = hm.keySet();
        for (String k : key) {
            Student s = hm.get(k);
            System.out.println("学号:" + k + ",姓名:" + s.getName() + "，年龄:" + s.getAge());
        }
        System.out.println("-----------");

//        遍历map集合方式二
        Set<Map.Entry<String, Student>> entrySet = hm.entrySet();
        for (Map.Entry<String, Student> me : entrySet) {
            String key1 = me.getKey();
            Student ss = me.getValue();
            System.out.println("学号:" + key1 + ",姓名:" + ss.getName() + "，年龄:" + ss.getAge());
        }

    }
}
