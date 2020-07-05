import java.util.Scanner;

/*案例：递归求阶乘*/
public class Digui_Demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int i = sc.nextInt();
        System.out.println(i+"!结果是："+getJiecheng(i));

    }
    public static int getJiecheng(int i){
        if (i==1){
            return i;
        }else {
            return i*getJiecheng(i-1);
        }
    }
}
