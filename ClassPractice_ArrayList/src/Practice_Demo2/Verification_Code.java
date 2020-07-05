package Practice_Demo2;

import java.util.Random;

/*【代码题】
## 题目2（应用）
在登录注册页面中，除了用户名和密码外，通常也会包含验证码。
验证码是用来区分用户是计算机还是人，防止恶意破解密码、刷票、灌水等行为。
请查看Random、StringBuilder相关API，定义方法，
获取一个包含4个字符的验证码，每一位字符是随机选择的字母和数字，
可包含a-z,A-Z,0-9。例如：
7Kt5
 */
public class Verification_Code {
    public static void main(String[] args) {
        String code = getVerification_Code(6);
        System.out.println(code);
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
        int index ;
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
