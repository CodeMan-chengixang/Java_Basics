package Class_Map04_Nexted;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*案例：ArrayList集合存储HashMap元素并遍历
 * 需求：创建一个ArrayList集合，存储三个元素，
 * 每个元素都是HashMap集合，每个HashMap的键和值都是String，并遍历*/
public class Map_ArrayList_Nested {
    public static void main(String[] args) {
        HashMap<String, String> hm1 = new HashMap<>();
        hm1.put("孙策", "大乔");
        hm1.put("周瑜", "小乔");
        HashMap<String, String> hm2 = new HashMap<>();
        hm2.put("郭靖", "黄蓉");
        hm2.put("杨过", "小龙女");
        HashMap<String, String> hm3 = new HashMap<>();
        hm3.put("令狐冲", "任盈盈");
        hm3.put("林平之", "岳灵珊");

        ArrayList<HashMap<String, String>> al = new ArrayList<>();
        al.add(hm1);
        al.add(hm2);
        al.add(hm3);

        for (HashMap<String, String> hm : al) {
            Set<Map.Entry<String, String>> entries = hm.entrySet();
            for (Map.Entry<String, String> me : entries) {
                String key = me.getKey();
                String value = me.getValue();
                System.out.println(key + "," + value);
            }
            System.out.println("-------------");
        }


    }

}
