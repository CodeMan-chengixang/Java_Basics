package Collection_Practice_Demo01;

import java.util.ArrayList;
import java.util.Collection;

/*练习三：Collection集合contains()方法使用
三、定义一个方法listTest(ArrayList<String> al, String s),
要求使用contains()方法判断al集合里面是否包含s*/
public class Practice_02 {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList();
        a1.add("黄飞鸿");
        a1.add("叶问");
        a1.add("张三丰");
        System.out.println(listTest(a1, "黄飞"));
    }

    public static boolean listTest(ArrayList<String> al, String s) {
        return al.contains(s);
    }
}
