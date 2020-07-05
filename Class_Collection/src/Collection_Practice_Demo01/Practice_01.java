package Collection_Practice_Demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*【代码题】
定义一个集合，并把集合(集合里面的元素是Integer)转成存有相同元素的数组，
并将结果输出在控制台。（可以使用Object[]数组类型接收转换的数组）*/
public class Practice_01 {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(12);
        c.add(16);
        c.add(33);
        c.add(15);
        Iterator<Integer> it = c.iterator();
        Object[] obj = c.toArray();
        System.out.print("[");
        for (int i = 0; i < obj.length; i++) {
            if (i == obj.length - 1) {
                System.out.print(obj[i] + "]");
            } else {
                System.out.print(obj[i]+",");
            }

        }
    }
}
