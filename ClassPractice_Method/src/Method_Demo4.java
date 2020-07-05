import java.util.Scanner;

/*我们知道数学中有九九乘法表。请定义一个方法，
方法的功能是打印nn乘法表。
在主方法中键盘录入取值范围为[1-9]的变量n，测试方法。
执行效果如下：

```
请输入一个1-9之间的整数：
4
乘法表：
1×1=1
1×2=2    2×2=4
1×3=3    2×3=6    3×3=9
1×4=4    2×4=8    3×4=12    4×4=16

```*/
public class Method_Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个1-9之间的整数：");
        int x = sc.nextInt();
        printMultiplyTable(x);
    }

    public static void printMultiplyTable(int i) {
        for (int a = 1; a <= i; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(b + "*" + a + "=" + a * b + "  ");

            }
            System.out.println();
        }
    }
}
