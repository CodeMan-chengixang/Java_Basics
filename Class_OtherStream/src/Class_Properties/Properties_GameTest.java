package Class_Properties;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Properties_GameTest {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("Class_OtherStream\\gessNumber.txt");
        prop.load(fr);
        System.out.println("prop:"+prop);
        fr.close();

        String count = prop.getProperty("count");
        int i = Integer.parseInt(count);
        if (i >= 3) {
            System.out.println("玩游戏次数已用完，请充值(www.chongzhi.com)");
        } else {
            Game_GessNumber.start();
            i++;
            System.out.println("i"+i);
            prop.setProperty("count", String.valueOf(i));
            FileWriter fw = new FileWriter("Class_OtherStream\\gessNumber.txt");
            //BufferedOutputStream
            prop.store(fw, null);
            fw.close();
        }
    }
}
