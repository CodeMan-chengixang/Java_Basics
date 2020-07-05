package Stream_MapAndMapToInt_Demo;

import java.util.ArrayList;

/*<R> Stream<R> map(Function mapper)
      返回由给定函数应用于此流的元素的结果组成的流
 IntStream mapToInt(ToIntFunction mapper)
      返回一个IntStream其中包含将给定函数应用于此流的元素的结果
      Interface ToIntFunction<T>中的唯一的方法：
                    int applyAsInt​(T value) 将此函数应用于给定的参数。
                    返回的是int类型的数据
      IntStream是一个接口，里面有很多int类型数据运算的方法，比如sum（）
*/
public class MapAndMapToInt_Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");
        list.add("50");

        //需求：将集合中的字符串数据转换为整数之后在控制台输出
        list.stream().map(Integer::parseInt).forEach(System.out::println);

        //需求：求IntStream（原始int流）中的数据和
        int sum = list.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(sum);

    }
}
