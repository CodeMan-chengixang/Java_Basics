package Practice_List01;

import java.util.ArrayList;
import java.util.Collection;

/*【代码题】
定义一个方法，要求此方法把int数组转成存有相同元素的集合
(集合里面的元素是Integer)，并返回。()*/
public class Practice_List_Demo3 {
    public static void main(String[] args) {
        int[] a = {1, 6, 3, 22, 1, 6, 7, 77, 9};
        Collection<Integer> c = arryToCollection(a);
        System.out.println(c);
    }

    public static Collection<Integer> arryToCollection(int[] arr) {
        Collection<Integer> c = new ArrayList<>();
        for (int i : arr) {
            c.add(i);
        }
        return c;

    }
}
