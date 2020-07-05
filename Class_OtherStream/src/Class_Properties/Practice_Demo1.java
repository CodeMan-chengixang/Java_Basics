package Class_Properties;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/*、
描述:
我有一个文本文件score.txt，我知道数据是键值对形式的，但是不知道内容是什么。
请写一个程序判断是否有"lisi"这样的键存在，如果有就改变其实为"100"
score.txt文件内容如下：
zhangsan = 90
lisi = 80
wangwu = 85*/
public class Practice_Demo1 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        BufferedReader br = new BufferedReader
                (new FileReader("class_otherstream\\score.txt"));
        prop.load(br);
        br.close();

        Set<Object> keySet = prop.keySet();
        if (keySet.contains("lisi")) {
            System.out.println("lisi存在");
            for (Object key : keySet) {
                if (key.equals("lisi")) {
                    prop.setProperty((String) key, "100");
                    BufferedWriter bw = new BufferedWriter
                            (new FileWriter("class_otherstream\\score.txt"));
                    prop.store(bw, null);
                    bw.close();
                }
            }
        } else {
            System.out.println("lisi不存在");
        }


    }
}
