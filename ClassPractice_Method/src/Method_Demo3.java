import java.util.Scanner;

/*通过键盘录入两个整数n和m。n代表行数，m代表列数。
定义一个方法，方法的功能是打印n行m列的@符号。
执行效果如下：

```
请输入行数：
4
请输入列数：
5
@@@@@
@@@@@
@@@@@
@@@@@
```*/
public class Method_Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行数：");
        int n = sc.nextInt();
        System.out.println("请输入列数：");
        int m = sc.nextInt();
        print(n, m);

    }

    public static void print(int a, int b) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
