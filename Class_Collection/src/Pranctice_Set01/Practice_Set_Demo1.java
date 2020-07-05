package Pranctice_Set01;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*获取不重复的随机数
 * 需求：编写一个程序，获取10个1-20的随机数，
 * 要求随机数不能重复，并在控制台输出*/
public class Practice_Set_Demo1 {
    public static void main(String[] args) {
//        Set<Integer> s=new HashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();
        Random r = new Random();
        while (ts.size() < 10) {
            int i = r.nextInt(20) + 1;
            ts.add(i);
        }

        for (Integer i : ts) {
            System.out.println(i);
        }
    }
}
