package Class_Properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();

        FileReader fr = new FileReader("class_otherstream\\a.txt");

        pro.load(fr);
        fr.close();
        System.out.println(pro);
    }
}
