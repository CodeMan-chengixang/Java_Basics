package Collection_Practice_Demo01;

import java.util.ArrayList;
import java.util.Iterator;

/*【代码题】
定义一个方法listTest(ArrayList<Integer> al, Integer s)，
要求返回s在al里面第一次出现的索引，如果s没出现过返回-1*/
public class Practice_Demo04 {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(11);
        a.add(22);
        a.add(11);
        a.add(22);
        System.out.println(listTest(a,22));
    }

    public static int listTest(ArrayList<Integer> a1, Integer s) {
        int index=-1;
        int i=0;
        Iterator<Integer> it = a1.iterator();
        while (it.hasNext()) {
            i++;
            if (s == it.next()) {
                index=i-1;
                break;
            }
        }
        return index;
    }
}
