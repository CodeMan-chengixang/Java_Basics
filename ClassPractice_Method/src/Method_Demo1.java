/*定义一个方法，该方法能够找出两个小数中的较小值并返回。
在主方法中调用方法进行测试。*/
public class Method_Demo1 {
    public static void main(String[] args) {
        System.out.println("两个小数中的较小值是："+getMin(4.5, 5.4));
    }

    public static double getMin(double a, double b) {
        double min;
        if (a >= b) {
            min = b;
        } else {
            min = a;
        }
        return min;
    }
}
