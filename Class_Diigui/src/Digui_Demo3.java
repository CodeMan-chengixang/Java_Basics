import java.io.File;

/*递归案例：遍历目录
* 需求：给定一个路径，请通过递归完成遍历该目录下的所有内容
* 并把所有文件的绝对路径输出在控制台上*/
public class Digui_Demo3 {
    public static void main(String[] args) {
        File f=new File("C:\\KuGou");
        getAllPath(f);

    }
    public static void getAllPath(File f){
        File[] files = f.listFiles();
        String path = null;
        if (files!=null){
            for (File file:files){
                if (file.isDirectory()){
                    getAllPath(file);
                }else {
                     path = file.getAbsolutePath();
                    System.out.println(path);

                }
            }
        }
    }
}
