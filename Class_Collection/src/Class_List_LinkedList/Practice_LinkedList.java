package Class_List_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

/*
【代码题】
根据要求练习LinkedList方法：
 (1)用3种遍历方法遍历链表集合
（2）基本方法：add, set, get, remove, clear, size等方法；
（3）特有方法：addFirst, addLast, getFirst, getLast,
 removeFirst, removeLast, push, pop, clear等方法。
*/
public class Practice_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("java");
        linked.add("hello");
        linked.add("world");
        linked.add("javaee");

//        linked.set(1,"你好");//[java, 你好, world, javaee]
//        linked.remove(2);//[java, hello, javaee]
//        linked.remove("hello");//[java, world, javaee]
//        linked.remove();//默认第一个元素；[hello, world, javaee]
//        linked.clear();//[]
//        linked.addFirst("first");//[first, java, hello, world, javaee]
//        linked.addLast("last");//[java, hello, world, javaee, last]
//        System.out.println(linked.getFirst()+","+linked.getLast());//java,javaee
//        linked.removeFirst();//[hello, world, javaee]
//        linked.removeLast();//[java, hello, world]
//        push​(E e) 将元素推送到由此列表表示的堆栈上。
//        linked.push("你好");//[你好, java, hello, world, javaee]
//        pop​() 从此列表表示的堆栈中弹出一个元素。
        /*String s1 = linked.pop();
        System.out.println(s1);//java
        System.out.println(linked);//[hello, world, javaee]*/

//        用迭代器的方法遍历
        Iterator<String> it = linked.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("--------");

//        用普通for循环遍历
        for (int i = 0; i < linked.size(); i++) {
            String s = linked.get(i);
            System.out.println(s);
        }
        System.out.println("--------");

//        用增强for循环遍历
        for (String s : linked) {
            System.out.println(s);
        }
    }
}
