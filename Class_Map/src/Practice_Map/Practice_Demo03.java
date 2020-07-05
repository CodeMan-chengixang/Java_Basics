package Practice_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*【代码题】
有2个数组，第一个数组内容为：
[黑龙江省,浙江省,江西省,广东省,福建省]，
第二个数组为：[哈尔滨,杭州,南昌,广州,福州]，
将第一个数组元素作为key，第二个数组元素作为value存储到Map集合中。
如{黑龙江省=哈尔滨, 浙江省=杭州, …}。*/
public class Practice_Demo03 {
    public static void main(String[] args) {
        String[] s1 = {"黑龙江省", "浙江省", "江西省", "广东省", "福建省"};
        String[] s2 = {"哈尔滨", "杭州", "南昌", "广州", "福州"};
        TreeMap<String, String> hm = new TreeMap<>();
        for (int i = 0; i < s1.length; i++) {
            hm.put(s1[i], s2[i]);
        }
        System.out.println(hm);
    }

}
