import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Class_Collections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(60);
        list.add(10);
        list.add(50);
        list.add(40);
//      [20, 30, 60, 10, 50, 40]

//        Collections.sort(list);//[10, 20, 30, 40, 50, 60]。列表按升序排序
//        Collections.reverse(list);//[40, 50, 10, 60, 30, 20]。反转列表中元素的顺序
        Collections.shuffle(list);//按照默认的随机源随机排列列表
        //[60, 10, 40, 20, 50, 30]
        //[30, 50, 10, 60, 40, 20]
        //...
        System.out.println(list);

    }
}
