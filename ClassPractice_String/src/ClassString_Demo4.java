import java.util.Scanner;

/*需求：定义一个方法，实现字符串反转。
 * 键盘录入一个字符串，调用该方法后，在控制台输出结果
 * 例如：键盘录入abc，结果输出cba*/
public class ClassString_Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        String s = reverse(line);
        System.out.println("反转后为："+s);

    }

    public static String reverse(String s) {
        String line="" ;
        for (int i = s.length()-1; i >=0; i--) {
            line += s.charAt(i);
        }

        return line;
    }
}
