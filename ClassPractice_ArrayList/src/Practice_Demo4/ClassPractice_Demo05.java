package Practice_Demo4;

import java.util.Scanner;

/*## 题目5（应用）
请定义一个方法用于判断一个字符串是否是对称的字符串，
并在主方法中测试方法。
例如："abcba"、"上海自来水来自海上"均为对称字符串。*/
public class ClassPractice_Demo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        if (isSymmetry(line)) {
            System.out.println("[" + line + "]是对称字符串");
        } else {
            System.out.println("[" + line + "]不是对称字符串");
        }

    }

    public static boolean isSymmetry(String s) {
        if (s.equals("")) {
            return false;
        }
        StringBuilder sb = new StringBuilder(s);
        String s1 = sb.reverse().toString();
        return s.equals(s1);
    }
}
