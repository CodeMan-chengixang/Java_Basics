package ClassPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*### 点名器【应用】

- 案例需求
  我有一个文件里面存储了班级同学的姓名，每一个姓名占一行，
  要求通过程序实现随点名器*/
public class CallName_Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader
                (new FileReader("Class_charstream\\ClassName.txt"));
        ArrayList<String> names = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            names.add(line);
        }
        br.close();

        Random r = new Random();
        int index = r.nextInt(names.size());
        String name = names.get(index);
        System.out.println(name);
    }

}
