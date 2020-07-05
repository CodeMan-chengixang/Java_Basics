package Pranctice_Set01;

import java.util.HashSet;

/*【代码题】
定义人类，包含姓名和年龄属性。
创建4个人存储到HashSet中，姓名和年龄相同的人看做同一人不存储*/
//Person类中要重写hashCode（）以及equals（）方法
public class Practice_Set_Demo2 {
    public static void main(String[] args) {
        HashSet<Person> hs=new HashSet<>();

        Person p1=new Person("刘德华",33);
        Person p2=new Person("黎明",23);
        Person p3=new Person("郭富城",43);
        Person p4=new Person("张学友",44);
        Person p5=new Person("刘德华",33);

        hs.add(p1);
        hs.add(p2);
        hs.add(p3);
        hs.add(p4);
        hs.add(p5);

        for (Person p:hs){
            System.out.println(p);
        }
    }
}
