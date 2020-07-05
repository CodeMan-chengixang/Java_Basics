package Class_Set_HashSet01;

import java.util.HashSet;

/*HashSet集合存储字符串并遍历*/
public class Class_HashSet_demo1 {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("hello");
        hs.add("java");
        hs.add("world");
        hs.add("javaee");
        System.out.println("".hashCode());
        /*
        * 语音太卡了，我先打字
        *         int h = 0;
        for (byte v : value) {
            h = 31 * h + (v & 0xff);
        }
        return h;
        *
        * 这个是hashCode算法， 一个公式
        * 这个重复的几率很小，但是还是会有漏网的。 汉字就是 视频中的那个
        * 导致计算后得值相同
        * hashCode  和 equals 两层判断是否重复
        * */

//        System.out.println(hs);
        for (String s:hs){
            System.out.println(s);
        }
    }
}
