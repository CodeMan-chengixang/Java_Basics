package Class_Set_TreeSet01;

import java.util.TreeSet;

/*TreeSet集合存储整数并遍历*/
public class Class_TreeSet_demo1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>();
        //无参构造TreeSet集合，根据元素的自然顺序进行排序
//        自然顺序：从小到大进行存储和取出
        ts.add(50);
        ts.add(43);
        ts.add(22);
        ts.add(15);
        ts.add(33);
//        ts.add(50);//元素的唯一性

        for (Integer i:ts){
            System.out.println(i);//15 22 33 43 50
        }
    }
}
