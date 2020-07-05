package Practice_Demo3;

import java.util.Scanner;

/*【代码题】
## 题目4（训练）
请编写程序，由键盘录入一个字符串，
统计字符串中英文字母和数字分别有多少个。
比如：Hello12345World中字母：10个，数字：5个。*/
public class ClassPractice_Demo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串;");
        String s = sc.nextLine();
        int letterCount = 0;
        int numberCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                letterCount++;
            } else if ('A' <= ch && ch <= 'Z') {
                letterCount++;
            } else if ('0' <= ch && ch <= '9') {
                numberCount++;
            }
        }
        System.out.println(s + "中字母：" + letterCount + "个，数字：" + numberCount + "个。");
    }
}
