package Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

/*### Predicate接口练习之筛选满足条件数据【应用】
- 练习描述
  - String[] strArray = {"林青霞,30", "柳岩,34", "张曼玉,35", "貂蝉,31", "王祖贤,33"};
  - 字符串数组中有多条信息，请通过Predicate接口的拼装
  将符合要求的字符串筛选到集合ArrayList中，并遍历ArrayList集合
  - 同时满足如下要求：姓名长度大于2；年龄大于33*/
public class PredicateTest_Demo {
    public static void main(String[] args) {
        String[] strArray = {"刘德华,30", "郭富城,34", "黎明,35", "张学友,31", "成龙,33"};
        ArrayList<String> array = filter(strArray, s -> s.split(",")[0].length() > 2,
                s -> Integer.parseInt(s.split(",")[1]) > 33);

        for (String s : array) {
            System.out.println(s);
        }
    }

    private static ArrayList<String> filter(String[] strArray, Predicate<String> pre1, Predicate<String> pre2) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String s : strArray) {
            if (pre1.and(pre2).test(s)) {
                arrayList.add(s);
            }
        }
        return arrayList;
    }
}
