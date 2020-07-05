package TCP_Demo4;

import java.io.*;
import java.net.Socket;

public class serverThread implements Runnable {
    private Socket s;
    private int count=0;

    public serverThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            //解决多个线程，文件名冲突问题
            File f=new File("Class_Net\\copy["+count+"].txt");
            while (f.exists()){
                count++;
                f=new File("Class_Net\\copy["+count+"].txt");
            }
            BufferedWriter bw=new BufferedWriter(new FileWriter(f));
            String line;
            while ((line=br.readLine())!=null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            //给出反馈
            BufferedWriter bwServer=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bwServer.write("文件上传成功");
            bwServer.newLine();
            bwServer.flush();

            s.close();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
