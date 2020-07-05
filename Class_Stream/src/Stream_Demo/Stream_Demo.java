package Stream_Demo;

import java.util.ArrayList;

/*### 体验Stream流【理解】
- 案例需求
  按照下面的要求完成集合的创建和遍历
  - 创建一个集合，存储多个字符串元素
  - 把集合中所有以"张"开头的元素存储到一个新的集合
  - 把"张"开头的集合中的长度为3的元素存储到一个新的集合
  - 遍历上一步得到的集合*/
public class Stream_Demo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");

        list.stream().filter(s->s.startsWith("张")).filter(s->s.length()==3).forEach(s -> System.out.println(s));
    }
}
