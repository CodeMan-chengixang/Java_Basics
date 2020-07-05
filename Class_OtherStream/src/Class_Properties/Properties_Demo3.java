package Class_Properties;

import java.io.*;
import java.util.Properties;

public class Properties_Demo3 {
    public static void main(String[] args) throws IOException {
        myStore();
        myLoad();
    }

    private static void myLoad() throws IOException{
        Properties prop=new Properties();
        FileReader fr=new FileReader("Class_OtherStream\\prop.txt");
        prop.load(fr);
        fr.close();
        System.out.println(prop);
    }

    private static void myStore() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("java001", "刘德华");
        prop.setProperty("java002", "张学友");
        prop.setProperty("java003", "黎明");
        prop.setProperty("java004", "郭富城");

        FileWriter fw = new FileWriter("Class_OtherStream\\prop.txt");
        prop.store(fw, null);
        fw.close();
    }
}
