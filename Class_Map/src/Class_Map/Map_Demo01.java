package Class_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*创建Map集合*/
public class Map_Demo01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("java001", "刘德华");
        map.put("java002", "郭富城");
        map.put("java003", "黎明");
        map.put("java004", "张学友");
//        map.put("java003","张国荣");
        //当键没有重复是，put（）方法是添加元素，当键重复时，put（）方法是修改元素为新的值
//        System.out.println(map);

//        System.out.println(map.remove("java002"));
//        System.out.println(map.remove("郭富城"));//null
//        map.clear();
//        System.out.println(map.containsValue("黎明"));
//        System.out.println(map.containsKey("java001"));
//        System.out.println(map.isEmpty());
//        System.out.println(map.size());

//        String s = map.get("java001");//根据键获取值
//        System.out.println(s);//刘德华
//        Set<String> set = map.keySet();//获取所有键的集合（键是唯一的，所以用set集合）
//        System.out.println(set);//[java004, java002, java003, java001]
//        Collection<String> values = map.values();//获取所有值得集合（值可以重复，所以用collection集合）
//        System.out.println(values);//[张学友, 郭富城, 黎明, 刘德华]

//map集合的遍历方式一：根据键来找值
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            String values = map.get(key);
            System.out.println(key + ":" + values);
        }
        System.out.println("-----------");


// map集合的遍历方式二：根据键值对对象map.Entry来获取键和值
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        //获取所有键值对对象的集合
        for (Map.Entry<String, String> mapEntry : entrySet) {
            String key1 = mapEntry.getKey();
            String value1 = mapEntry.getValue();
            System.out.println(key1 + ":" + value1);
        }

    }
}
