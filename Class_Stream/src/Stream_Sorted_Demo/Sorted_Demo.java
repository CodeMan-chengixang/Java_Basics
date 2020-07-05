package Stream_Sorted_Demo;

import java.util.ArrayList;

/*Stream<T> sorted()返回由此流的元素组成的流，根据自然顺序排序
Stream<T> sorted(Comparator comparator)
            返回由该流的元素组成的流，根据提供的Comparator进行排序*/
public class Sorted_Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("linqingxia");
        list.add("zhangmanyu");
        list.add("wangzuxian");
        list.add("liuyan");
        list.add("zhangmin");
        list.add("zhangwuji");

        //需求1：按照字母顺序把数据在控制台输出
        list.stream().sorted().forEach(System.out::println);
        System.out.println("---------------");

        //需求2：按照字符串长度把数据在控制台输出
        list.stream().sorted((s1, s2) -> {
            int num1 = s1.length() - s2.length();
            int num2 = num1 == 0 ? s1.compareTo(s2) : num1;
            return num2;
        }).forEach(System.out::println);
    }
}
