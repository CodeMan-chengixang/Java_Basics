package Stream_Demo;

import java.util.*;
import java.util.stream.Stream;

/*生成Stream流的方式
- Collection体系集合
  使用默认方法stream()生成流， default Stream<E> stream()
- Map体系集合
  把Map转成Set集合，间接的生成流
- 数组
  通过Stream接口的静态方法of(T... values)生成流*/
public class Stream_Demo2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Stream<String> listStream = list.stream();
        Set<String> set=new HashSet<>();
        Stream<String> setList = set.stream();

        Map<Integer,String> map=new HashMap<>();
        Stream<Integer> keysetStream = map.keySet().stream();
        Stream<String> valcollectionStream = map.values().stream();
        Stream<Map.Entry<Integer, String>> entrysetStream = map.entrySet().stream();

        String[] strArray={"12","13","14","17","10"};
        Stream<String> strArrayStream = Stream.of(strArray);
        Stream<Integer> intStream = Stream.of(12, 13, 14, 17, 10);
        Stream<String> stringStream = Stream.of("hello", "world", "java");
    }
}
