package Class_Byte_OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
字节流写数据加入异常处理
使用try...catch..finally...
finally:在处理异常时提供finally块来执行所有异常操作，比如说IO流中的释放资源
特点：被finally控制的语句一定会执行性，除非JVM推出
格式：try{
          可能出现异常的代码；
      }catch（异常类名 变量名）{
          异常的处理代码；
      }finally{
          执行所有清除操作；
      }
注意：finally块中的变量，try和catch块中的变量不能共通使用，
      所以变量要定义在try...catch..finally...外面；
*/
public class ByteStream_Demo4 {
    public static void main(String[] args) {
        /*FileOutputStream fos= null;
        try {
            fos = new FileOutputStream("Class_ByteStream\\fos4.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            fos.write("hello".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
       *//* try {
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*//*//这样并没有释放资源，需要使用finally...执行*/

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("Class_ByteStream\\fos4.txt");
            fos.write("hello".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos!=null){//为了程序的健壮性，可以在finally中做非空判断
            //只有在fos不为null的情况下，才要对fos释放资源
                try {
                    fos.close();//close（）方法也会报异常，也是用try...catch来处理即可
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
