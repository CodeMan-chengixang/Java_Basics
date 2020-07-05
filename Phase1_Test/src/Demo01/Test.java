package Demo01;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        //2.1创建一个File对象，关联number1.txt文件
        File file=new File("Phase1_Test\\number1.txt");
        //2.2通过File对象进行判断，如果当前对象是一个文件的话，则继续执行下面步骤
        if (file.isFile()){
            //2.3创建一个BufferedReader对象，关键已有的File对象
            BufferedReader br=new BufferedReader(new FileReader(file));
            //2.4创建HashSet集合对象，泛型为String
            HashSet<String> hs=new HashSet<>();
            //2.5通过输入流对象读取文件中内容，将每个数字都保存到集合中
            String line;
            while ((line=br.readLine())!=null){
                hs.add(line);
            }
            br.close();

            //2.6创建一个List集合，将HashSet集合中的所有元素全部添加到List集合中
            List<String> list=new ArrayList<>(hs);
            //2.7对List集合元素进行排序。按照从小到大的顺序
            list.sort((s1,s2)->Integer.parseInt(s1)-Integer.parseInt(s2));
            //2.8创建一个BufferedWriter对象，关联到当前项目下的number2.txt文件
            BufferedWriter bw=new BufferedWriter(new FileWriter("Phase1_Test\\number2.txt"));
            //2.9通过输出流对象将List集合中的所有元素全部写出
            for (String s : list) {
                bw.write(s);
                bw.newLine();
                bw.flush();
            }
            bw.close();
        }
    }
}
