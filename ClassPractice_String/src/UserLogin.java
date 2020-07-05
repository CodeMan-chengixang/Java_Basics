import java.util.Scanner;

/*需求：已知用户名和密码，用程序实现模拟用户登录。
总共有三次机会，登录之后，给出相应的提示。
**/
public class UserLogin {
    public static void main(String[] args) {
        String username = "admin";
        String password = "abc001002";
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String name = sc.nextLine();
            System.out.println("请输入密码：");
            String psw = sc.nextLine();
            if (name.equals(username) && psw.equals(password)) {
                System.out.println("您已登录成功");
                break;
            } else {
                if (2 - i == 0) {
                    System.out.println("输入错误三次，您的账户已被锁定，请与管理员联系");
                } else {
                    System.out.println("登录失败,您还有" + (2 - i) + "次机会");
                }
            }
        }

    }

}
