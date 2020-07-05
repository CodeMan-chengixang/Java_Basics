import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*【代码题】
        项目需求：请用户从控制台输入信息，程序将信息存储到文件Info.txt中。
        可以输入多条信息，每条信息存储一行。当用户输入：”886”时，程序结束。
*/
public class Practice_Demo {
    public static void main(String[] args) throws IOException {
        BufferedWriter br = new BufferedWriter
                (new FileWriter("Class_CharStream\\Info.txt"));
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入信息：");
        String line;
        while (!(line = sc.nextLine()).equals("886")) {
            br.write(line);
            br.newLine();
            br.flush();
        }
        br.close();
    }
}
