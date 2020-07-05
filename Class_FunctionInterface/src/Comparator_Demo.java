import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*需求描述
定义一个类(ComparatorDemo)，在类中提供两个方法
一个方法是：Comparator<String> getComparator()   方法返回值Comparator是一个函数式接口

一个方法是主方法，在主方法中调用getComparator方法*/
public class Comparator_Demo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("cccc");
        array.add("aa");
        array.add("bbb");
        array.add("d");

        System.out.println("排序前：" + array);

//        Collections.sort(array);
        Collections.sort(array, getComparator());

        System.out.println("排序后:" + array);


    }

    private static Comparator<String> getComparator() {
//        //匿名内部类的方法
//        return new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length()-s2.length();
//            }
//        };

//        //Lambda表达式方法
//        return (s1, s2) -> s1.length() - s2.length();

         //方法引用方法
        return Comparator.comparingInt(String::length);
    }
}
