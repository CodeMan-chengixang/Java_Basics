package Class_Map04_Nexted;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*案例：HashMap集合存储ArrayList集合并遍历
 * 需求：创建一个HashMap集合，存储3个键值对元素
 * 每一个键值对元素的键是String，值是ArrayList集合
 * ArrayList集合中每一个元素是String，并遍历*/
public class Map_HashMap_Nested {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("孙悟空");
        al1.add("猪八戒");
        al1.add("沙悟净");
        al1.add("唐僧");
        hm.put("《西游记》", al1);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("刘备");
        al2.add("关羽");
        al2.add("张飞");
        hm.put("《三国演义》", al2);

        ArrayList<String> al3 = new ArrayList<>();
        al3.add("宋江");
        al3.add("武松");
        hm.put("《水浒传》", al3);

        Set<String> keySet = hm.keySet();
        for (String key : keySet) {
            System.out.println(key + ":");
            ArrayList<String> al = hm.get(key);
            for (String s : al) {
                System.out.println("\t"+ s);
            }
            System.out.println("--------");
        }


    }

}
