package Stream_Filter_Demo;

import java.util.ArrayList;

/*Stream流中间操作方法:
Stream<T> filter(Predicate predicate)用于对流中的数据进行过滤
* */
public class Filter_Demo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");

        //需求1：把list集合中以张开头的元素在控制台输出
        list.stream().filter(s->s.startsWith("张")).forEach(System.out::println);
        System.out.println("-------------------");

        //需求2：把list集合中长度为3的元素在控制台输出
        list.stream().filter(s->s.length()==3).forEach(System.out::println);
        System.out.println("--------------------");

        //需求3：把list集合中以张开头的，长度为3的元素在控制台输出
        list.stream().filter(s->s.startsWith("张")).filter(s->s.length()==3).forEach(System.out::println);

    }
}
