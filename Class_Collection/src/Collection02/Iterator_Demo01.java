package Collection02;
/*通过迭代器Iterator，遍历集合*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator_Demo01 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("hello");
        c.add("world");
        c.add("java");
        System.out.println(c);
//        创建迭代器对象(通过集合调用集合的iterator（）方法得到)
        Iterator<String> it = c.iterator();//使用多态的形式创建了实现类对象
       /* public Iterator<E> iterator() {
                return new Itr();
            }
        private class Itr implements Iterator<E>{}
        */
//       E next()方法，返回迭代中的下一个元素
       /* System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());//NoSuchElementException被各种访问器方法抛出，表示被请求的元素不存在。
        */
//       boolean hasNext（）如果迭代中具有更多元素，则返回true
/*
        if (it.hasNext()) {
            System.out.println(it.next());
        }
        if (it.hasNext()) {
            System.out.println(it.next());
        }
        if (it.hasNext()) {
            System.out.println(it.next());
        }
        if (it.hasNext()) {
            System.out.println(it.next());
        }
        */
//用while循环来改进
        while (it.hasNext()){
//            System.out.println(it.next());
            String s = it.next();
            System.out.println(s);
        }
    }
}
