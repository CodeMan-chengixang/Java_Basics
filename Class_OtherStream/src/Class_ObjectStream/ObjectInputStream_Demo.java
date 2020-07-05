package Class_ObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream_Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream
                (new FileInputStream("class_OtherStream\\oos.txt"));
        Object o1 = ois.readObject();
        Student s1 = (Student) o1;
        System.out.println(s1.getName()+","+s1.getAge());
        Object o2 = ois.readObject();
        Student s2 = (Student) o2;
        System.out.println(s2.getName()+","+s2.getAge());

        ois.close();
    }
}

