package Class_ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStream_Demo {
    public static void main(String[] args) throws IOException {
        Student s1 = new Student("刘德华", 30);
        Student s2=new Student("张学友",20);
        ObjectOutputStream oos = new ObjectOutputStream
                (new FileOutputStream("class_OtherStream\\oos.txt"));
        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.close();
    }
}
