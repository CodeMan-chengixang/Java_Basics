package Stream_ForeachAndCount_Demo;

import java.util.ArrayList;

/*### Stream流终结操作方法【应用】
- 概念
  终结操作的意思是，执行完此方法之后，Stream流将不能再执行其他操作。
- 常见方法
  | 方法名                        | 说明                     |
  | void forEach(Consumer action) | 对此流的每个元素执行操作 |
  | long count()                  | 返回此流中的元素数       |*/
public class ForeachAndCount_Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");

        //需求1：把集合中的元素在控制台输出
        list.stream().forEach(System.out::println);
        System.out.println("------------");

        //需求2：统计集合中有几个以张开头的元素，并把统计结果在控制台输出
        long count = list.stream().filter(s -> s.startsWith("张")).count();
        System.out.println(count);
    }
}
