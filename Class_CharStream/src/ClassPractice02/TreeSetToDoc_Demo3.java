package ClassPractice02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/* 案例需求
- 键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩)。
要求按照成绩总分从高到低写入文本文件
- 格式：姓名,语文成绩,数学成绩,英语成绩  举例：林青霞,98,99,100*/
public class TreeSetToDoc_Demo3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                double sum1 = o1.getChineseScore() + o1.getMathScore() + o1.getEnglishScore();
                double sum2 = o2.getChineseScore() + o2.getMathScore() + o2.getEnglishScore();
                int a = (int) (sum2 - sum1);
                int i = a == 0 ? o1.getName().compareTo(o2.getName()) : a;
                return i;
            }
        });

        for (int i = 1; i <= 5; i++) {
            Student s = new Student();
            System.out.println("请输入第" + i + "个学生姓名");
            String name = sc.nextLine();
            s.setName(name);
            System.out.println("请输入第" + i + "个学生语文成绩");
            double chineseScore = sc.nextDouble();
            sc.nextLine();
            s.setChineseScore(chineseScore);
            System.out.println("请输入第" + i + "个学生数学成绩");
            double mathScore = sc.nextDouble();
            sc.nextLine();
            s.setMathScore(mathScore);
            System.out.println("请输入第" + i + "个学生英语成绩");
            double englishScore = sc.nextDouble();
            sc.nextLine();
            s.setEnglishScore(englishScore);
            ts.add(s);
        }

        BufferedWriter bw = new BufferedWriter
                (new FileWriter("Class_CharStream\\students2.doc"));
        for (Student s : ts) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.getName()).append
                    (",").append(s.getChineseScore()).append
                    (",").append(s.getMathScore()).append
                    (",").append(s.getEnglishScore());
            String s1 = sb.toString();
            bw.write(s1);
            bw.newLine();
            bw.flush();
        }
        bw.close();

    }
}
