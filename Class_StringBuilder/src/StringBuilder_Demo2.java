import java.util.Scanner;

/*需求：定义一个方法，使用StringBuilder实现字符串反转。
 * 键盘录入一个字符串，调用该方法后，在控制台输出结果
 * 例如：键盘录入abc，结果输出cba*/
public class StringBuilder_Demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.nextLine();
        String s2 = reverse(s);
        System.out.println(s2);

    }
    public static String reverse(String s){
        /*StringBuilder sb=new StringBuilder(s);
        String s1 = sb.reverse().toString();
        return s1;*/
        return new StringBuilder(s).reverse().toString();

    }
}
