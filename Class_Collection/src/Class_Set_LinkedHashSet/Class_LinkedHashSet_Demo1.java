package Class_Set_LinkedHashSet;

import java.util.LinkedHashSet;

/*使用LinkedHashSet集合：存储字符串并遍历*/
public class Class_LinkedHashSet_Demo1 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("hello");
        lhs.add("world");
        lhs.add("java");
//        lhs.add("java");//添加不进去，因为元素不能重复

        for (String s:lhs){
            System.out.println(s);
        }
        System.out.println(lhs);
    }


}
