import java.util.Scanner;

/*在主方法中通过键盘录入三个整数。
定义一个方法，方法接收三个整数变量，
在方法中从大到小依次打印三个变量。执行效果如下：

```
请输入第一个整数：10
请输入第二个整数：30
请输入第三个整数：20
从大到小的顺序是： 30 20 10
```*/
public class Method_Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.print("请输入第二个整数：");
        int b = sc.nextInt();
        System.out.print("请输入第三个整数：");
        int c = sc.nextInt();
        System.out.print("从大到小的顺序是：");
        order(a, b, c);
    }

    public static void order(int n1, int n2, int n3) {
        int max = 0;
        int mid = 0;
        int min = 0;
//        求最大值
        if (n1 >= n2 && n1 >= n3) {
            max = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            max = n2;
        } else {
            max = n3;
        }
//        求最小值
        if (n1 <= n2 && n1 <= n3) {
            min = n1;
        } else if (n2 <= n1 && n2 <= n3) {
            min = n2;
        } else {
            min = n3;
        }
//        求中间值
        if (n1 >= n2 && n1 <= n3) {
            mid = n1;
        } else if (n2 >= n1 && n2 <= n3) {
            mid = n2;
        } else {
            mid = n3;
        }
        System.out.println(max + " " + mid + " " + min);
    }
}
