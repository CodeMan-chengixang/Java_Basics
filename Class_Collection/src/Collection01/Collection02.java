package Collection01;

import java.util.ArrayList;
import java.util.Collection;

public class Collection02 {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<String>();
//        System.out.println(c.add("hello"));
//        System.out.println(c.add("word"));
//        System.out.println(c.add("java"));
//        System.out.println(c.add("word"));
        c.add("hello");
        c.add("word");
        c.add("java");
        c.add("hello");
//        c.remove("hello");
//        c.remove("javaee");
//        c.clear();
//        判断集合中是否有某个元素contains（）
        System.out.println(c.contains("javaee"));
        System.out.println(c.contains("java"));
        System.out.println(c.isEmpty());
        System.out.println(c.size());
        System.out.println(c);
    }
}
