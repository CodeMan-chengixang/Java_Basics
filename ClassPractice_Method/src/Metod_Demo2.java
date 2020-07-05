/*定义一个方法，该方法能够找出三个整数中的最大值并返回。
在主方法中调用方法测试执行。*/
public class Metod_Demo2 {
    public static void main(String[] args) {
        System.out.println("三个整数中的最大值为："+getMax(88,34,99));
    }
    public static int getMax(int a,int b, int c){
        int max=(a>=b)?a:b;
        if (c>=max){
            max=c;
        }
        return max;
    }
}
