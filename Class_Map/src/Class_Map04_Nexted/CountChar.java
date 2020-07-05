package Class_Map04_Nexted;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*案例：统计字符串中，每个字符出现的次数
 * 需求：键盘录入一个字符串，要求统计字符串中，每个字符出现的次数
 * 如：键盘录入abcdeaabbceeeeeddd,在控制台输出a(3)b(3)c(2)d(4)e(6)*/
public class CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();

//        HashMap<Character, Integer> hm = new HashMap<>();//不保证顺序
        TreeMap<Character, Integer> hm = new TreeMap<>();//自然排序
        for (int i = 0; i < line.length(); i++) {
            char key = line.charAt(i);
            Integer value = hm.get(key);
            if (value == null) {
                hm.put(key, 1);
            } else {
                value++;
                hm.put(key, value);
            }
        }

        StringBuilder sb=new StringBuilder();
        Set<Character> keySet = hm.keySet();
        for (Character key:keySet){
            Integer value = hm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }
        String result = sb.toString();
        System.out.println(result);

//        Set<Character> keySet = hm.keySet();
//        for (Character k : keySet) {
//            Integer i = hm.get(k);
//            System.out.print(k + "(" + i + ")");
//        }

    }
}
