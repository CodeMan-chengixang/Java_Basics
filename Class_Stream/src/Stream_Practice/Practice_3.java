package Stream_Practice;

import java.util.stream.Stream;

/*《代码题》
4、
问题：
有如下7个元素黄药师，冯蘅，郭靖，黄蓉，郭芙，郭襄，郭破虏，
使用Stream将以郭字开头的元素存入新数组*/
public class Practice_3 {
    public static void main(String[] args) {
        String[] arrString = {"黄药师", "冯蘅", "郭靖", "黄蓉", "郭芙", "郭襄", "郭破虏"};
        String[] guos = Stream.of(arrString).filter(s -> s.startsWith("郭")).toArray(String[]::new);
        for (String s : guos) {
            System.out.println(s);
        }
    }
}