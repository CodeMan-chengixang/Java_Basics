import java.util.Scanner;

/*请定义一个方法，
对正数的小数进行四舍五入的操作(不考虑负数情况)。
四舍五入之后的结果是一个int整数类型并返回。
最后对方法进行测试。*/
public class Method_Demo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个小数：");
        double number = sc.nextDouble();
        System.out.println("对这个小数四舍五入后的结果是：" + round(number));
    }

    public static int round(double n) {
        int a = (int) (n * 10) % 10;
        int num = 0;
        if (a <= 4) {
            num = (int) n;
        } else if (a >= 5) {
            num = (int) n + 1;
        }
        return num;
    }
}
