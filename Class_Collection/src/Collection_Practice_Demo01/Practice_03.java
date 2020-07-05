package Collection_Practice_Demo01;

import java.util.ArrayList;

/*【代码题】
定义一个方法listTest(ArrayList<String> al),
要求使用isEmpty()判断al里面是否有元素*/
public class Practice_03 {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        a.add("你好");
        System.out.println(listTest(a));

    }
    public static boolean listTest(ArrayList<String> al){
        return al.isEmpty();
    }
}
