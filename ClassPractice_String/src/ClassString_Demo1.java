import java.util.Scanner;

/*需求：
键盘录入一个字符串，统计该字符串中大写字母字符、
小写字母字符和数字字符出现的个数（不考虑其他字符）*/
public class ClassString_Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            }
        }
        System.out.println("大写字母个数为：" + bigCount);
        System.out.println("小写字母个数为：" + smallCount);
        System.out.println("数字个数为：" + numberCount);
    }
}
