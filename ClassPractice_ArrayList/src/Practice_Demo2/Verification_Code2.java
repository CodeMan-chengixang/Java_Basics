package Practice_Demo2;

import java.util.Random;
import java.util.Scanner;

/*【代码题】
## 题目3（应用）
在登录注册页面中，除了用户名和密码外，通常也会包含验证码。
验证码是用来区分用户是计算机还是人，防止恶意破解密码、刷票、灌水等行为。
在判断验证码时一般不区分大小写。请编写程序模拟验证码的判断过程，
如果输入正确，给出提示，结束程序。
如果输入错误，给出提示，验证码刷新，重新输入，直至正确为止。
生成4位随机验证码的功能在之前的题目中已经完成，可以直接使用。
《定义方法，获取一个包含4个字符的验证码，每一位字符是随机选择的字母和数字，
可包含a-z,A-Z,0-9。》
运行效果如下：
生成的验证码为：BkhD
请输入验证码
abcd
输入错误，请重新输入...
生成的验证码为：n1wX
请输入验证码
aaaa
输入错误，请重新输入...
生成的验证码为：Fm1a
请输入验证码
fm1a
输入正确*/
public class Verification_Code2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String code = getVerification_Code(4);
            System.out.println("生成的验证码为：" + code);
            System.out.println("请输入验证码：");
            String line = sc.nextLine();
            if (code.equalsIgnoreCase(line)) {
                System.out.println("输入正确");
                break;
            } else {
                System.out.println("输入错误，请重新输入...");
            }
        }
    }

    public static String getVerification_Code(int number) {
        StringBuilder sb = new StringBuilder();
        for (char ch = '0'; '0' <= ch && ch <= '9'; ch++) {
            sb.append(ch);
        }
        for (char ch = 'A'; 'A' <= ch && ch <= 'Z'; ch++) {
            sb.append(ch);
        }
        for (char ch = 'a'; 'a' <= ch && ch <= 'z'; ch++) {
            sb.append(ch);
        }
        int index;
        StringBuilder sb2 = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < number; i++) {
            index = r.nextInt(sb.length());
            sb2.append(sb.charAt(index));
        }
        String s = sb2.toString();
        return s;

    }
}
