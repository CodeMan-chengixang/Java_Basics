package Practice_Demo5;

import java.util.Scanner;

/*## 题目6（应用）
我国的居民身份证号码，
由由十七位数字本体码和一位数字校验码组成。
请定义方法判断用户输入的身份证号码是否合法，
并在主方法中调用方法测试结果。
规则为：号码为18位，不能以数字0开头，前17位只可以是数字，
最后一位可以是数字或者大写字母X。*/
public class ClassPractice_Demo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证号码：");
        String id = sc.nextLine();
        if (isLegal(id)) {
            System.out.println("输入的身份证号码合法");
        } else {
            System.out.println("输入的身份证号码不合法");
        }
    }

    /*    public static boolean isLegal(String s) {
            boolean flag = true;
            if (s.length() != 18) {
                flag = false;
            }
            if (s.charAt(0) == '0') {
                flag = false;
            }
            for (int i = 0; i < s.length() - 1; i++) {
                if ('0' >s.charAt(i) || s.charAt(i) > '9') {
                    flag = false;
                    break;
                }
            }
            if ('0' >s.charAt(s.length() - 1) || s.charAt(s.length() - 1) > '9') {
                if (s.charAt(s.length() - 1) != 'X') {
                    flag = false;
                }
            }
            return flag;
        }*/
    public static boolean isLegal(String s) {
        if (s==null) {
            return false;
        }
        if (s.length() != 18) {
            return false;
        }
        if (s.startsWith("0")) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i == s.length() - 1) {
                if (ch < '0' || ch > '9' && ch != 'X') {
                    return false;
                }
            }else if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }
}

