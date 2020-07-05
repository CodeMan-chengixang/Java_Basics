package Practice_Demo1;

import java.util.Scanner;

/*## 题目1（训练）
现已知工人（Practice_Demo1.Worker）类，属性包含姓名（name）、工龄（year），
请编写该类，提供构造方法和get、set方法。
在测试类中，请查看键盘录入Scanner类的API，
创建工人类对象，属性值由键盘录入，打印对象的属性值。输出效果如下：
```java
请录入工人姓名：
张三
请录入工人工龄：
5
该工人对象的属性信息如下：
姓名：张三
工龄：5
```*/
public class ClassPractice_DeMo1 {
    public static void main(String[] args) {
        Worker w = new Worker();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入工人姓名：");
        String name = sc.nextLine();
        w.setName(name);
        System.out.println("请输入工人工龄：");
        String year = sc.nextLine();
        w.setYear(year);
        System.out.println("该工人对象的属性值如下：");
        System.out.println("姓名：" + w.getName());
        System.out.println("工龄：" + w.getYear() + "年");
    }
}
