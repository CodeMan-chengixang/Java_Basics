package Class_List_ListIteratot;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Practice_ListIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("hello");
        list.add("world");

        ListIterator<String> lit = list.listIterator();
/*//用列表迭代器遍历list集合
        while (lit.hasNext()) {
            String s = lit.next();
            System.out.println(s);
        }
        System.out.println("--------");

// 用列表迭代器倒序遍历集合
        while (lit.hasPrevious()) {
            String s = lit.previous();
            System.out.println(s);
        }
        System.out.println("--------");*/

//    用列表迭代器插入指定元素
        while (lit.hasNext()){
            String s = lit.next();
            if (s.equals("java")){
                lit.add("javaee");
            }
        }

        System.out.println(list);
    }


}
