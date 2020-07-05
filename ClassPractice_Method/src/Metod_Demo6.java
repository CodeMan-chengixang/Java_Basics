import java.util.Scanner;

/*数字是有绝对值的，
负数的绝对值是它本身取反，非负数的绝对值是它本身。
请定义一个方法，方法能够得到小数类型数字的绝对值并返回。
请定义方法并测试。*/
public class Metod_Demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个小数：");
        double number = sc.nextDouble();
        System.out.println("这个数的绝对值是：" + value(number));
    }

    public static double value(double number) {
        if (number < 0) {
            return -number;
        } else {
            return number;
        }
    }

}
