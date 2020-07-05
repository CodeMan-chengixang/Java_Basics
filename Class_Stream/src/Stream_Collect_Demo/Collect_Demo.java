package Stream_Collect_Demo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*### Stream流的收集操作【应用】
- 概念
  对数据使用Stream流的方式操作完毕后，可以把流中的数据收集到集合中。
- 常用方法
  | 方法名                         | 说明               |
  | R collect(Collector collector) | 把结果收集到集合中 |

- 工具类Collectors提供了具体的收集方式(返回的是Collector实现类对象)
  | 方法名                                | 说明                   |
  | public static <T> Collector toList()  | 把元素收集到List集合中 |
  | public static <T> Collector toSet()   | 把元素收集到Set集合中  |
  | public static  Collector toMap(Function keyMapper,Function valueMapper) | 把元素收集到Map集合中  |*/
public class Collect_Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("刘德华");
        list.add("黎明");
        list.add("郭富城");
        list.add("张学友");
        //需求1：得到名字为3个字的流
        //需求2：把使用Stream流操作完毕的数据收集到List集合中并遍历
        List<String> names = list.stream().filter(s -> s.length() == 3).collect(Collectors.toList());
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("----------------");

        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        //需求3：得到年龄大于25的流
        //需求4：把使用Stream流操作完毕的数据收集到Set集合中并遍历
        Set<Integer> ages = set.stream().filter(i -> i > 25).collect(Collectors.toSet());
        for (Integer age : ages) {
            System.out.println(age);
        }
        System.out.println("-----------------");

        //定义一个字符串数组，每一个字符串数据由姓名数据和年龄数据组合而成
        String[] strArray = {"刘德华，37", "黎明，22", "郭富城，41", "张学友，27"};
        //需求5：得到字符串中年龄数据大于28的流
        //需求6：把使用Stream流操作完毕的数据收集到Map集合中并遍历，字符串中的姓名作键，年龄作值
        Map<String, Integer> map = Stream.of(strArray).filter(s -> Integer.parseInt(s.split("，")[1]) > 28)
                .collect(Collectors.toMap(s -> s.split("，")[0],
                        s -> Integer.parseInt(s.split("，")[1])));
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            Integer value = map.get(key);
            System.out.println(key + "," + value);
        }
    }
}
