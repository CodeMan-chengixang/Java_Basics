import java.util.ArrayList;
import java.util.Scanner;

public class myStudengtManager {
    //主界面
    public static void main(String[] args) {
//        创建学生集合对象
        ArrayList<Student> students = new ArrayList<>();
//        主界面循环
        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择：");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

/*            if (line == "5") {
                System.out.println("谢谢使用！");
                break;
            }*
            //方法一：直接使用system.exit（0）替换break；终止虚拟机
            //方法二：使用循环编号，给编号lo:
                                        while(true){}
                                终止此循环: break lo;
 */

            switch (line) {
                case "1":
//                    System.out.println("添加学生");
                    addStudent(students);
                    break;
                case "2":
//                    System.out.println("删除学生");
                    deleteStudent(students);
                    break;
                case "3":
//                    System.out.println("修改学生");
                    updateStudent(students);
                    break;
                case "4":
//                    System.out.println("查看所有学生");
                    showAllStudent(students);
                    break;
                case "5":
                    System.out.println("谢谢使用！");
                    System.exit(0);
            }

        }
    }


    //提供添加学生方法（未解决添加重复的问题）
        /*public static void addStudent(ArrayList<Student> students) {
//        创建学生对象
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生学号：");
        String sid = sc.nextLine();
        s.setSid(sid);
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        s.setName(name);
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        s.setAge(age);
        System.out.println("请输入学生居住地：");
        String adress = sc.nextLine();
        s.setAdress(adress);
//        往集合中加入学生对象
        students.add(s);
        System.out.println("添加学生成功");
    }*/
    //提供添加学生方法（调用isExisted方法，解决添加的学生重复的情况）
    public static void addStudent(ArrayList<Student> students) {
//        创建学生对象
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生学号：");
            String sid = sc.nextLine();
            if (isExisted(sid, students)) {
                System.out.println("您输入的学号已经被使用，请重新输入");
            } else {
                s.setSid(sid);
                break;
            }
        }
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        s.setName(name);
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        s.setAge(age);
        System.out.println("请输入学生居住地：");
        String adress = sc.nextLine();
        s.setAdress(adress);
//        往集合中加入学生对象
        students.add(s);
        System.out.println("添加学生成功");
    }


    //提供删除学生方法（未解决学生不存在的问题）
        /*public static void deleteStudent(ArrayList<Student> students) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入要删除的学生学号：");
            String id = sc.nextLine();
            for (int i = 0; i < students.size(); i++) {
                Student s = students.get(i);
                if (s.getSid().equals(id)) {
                    students.remove(s);
                    System.out.println("学号为" + id + "的学生删除成功");
                }
            }
        }*/
    //提供删除学生的方法（不调用isExisted方法解决删除的学生不存在的情况）
        /*public static void deleteStudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生学号：");
        String id = sc.nextLine();
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getSid().equals(id)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("该学号的学生信息不存在，请重新输入");
        } else {
            students.remove(index);
            System.out.println("学号为" + id + "的学生删除成功");
        }
    }*/
    //提供删除学生方法（调用isExisted方法，解决删除的学生不存在的情况）
    public static void deleteStudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生学号：");
        String id = sc.nextLine();
        if (isExisted(id, students)) {
            for (int i = 0; i < students.size(); i++) {
                Student s = students.get(i);
                if (s.getSid().equals(id)) {
                    students.remove(s);
                    System.out.println("学号为" + id + "的学生删除成功");
                }
            }
        } else {
            System.out.println("该学号的学生信息不存在，请重新输入");
        }
    }


    //提供修改学生方法（未解决学生不存在的问题）
        /*public static void updateStudent(ArrayList<Student> students) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入要修改学生的学号：");
            String id = sc.nextLine();
            for (int i = 0; i < students.size(); i++) {
                Student s = students.get(i);
                if (s.getSid().equals(id)) {
                    System.out.println("已找到学号为" + id + "的学生");
                    System.out.println("请输入修改后的学生姓名：");
                    String name = sc.nextLine();
                    s.setName(name);
                    System.out.println("请输入修改后的学生年龄：");
                    String age = sc.nextLine();
                    s.setAge(age);
                    System.out.println("请输入修改后的学生居住地：");
                    String adress = sc.nextLine();
                    s.setAdress(adress);
                    System.out.println("学号为" + id + "的学生已经修改成功");
                }
            }
        }*/
    //提供修改学生方法（调用isExisted方法，解决修改的学生不存在的情况）
    public static void updateStudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改学生的学号：");
        String id = sc.nextLine();
        if (isExisted(id, students)) {
            for (int i = 0; i < students.size(); i++) {
                Student s = students.get(i);
                if (s.getSid().equals(id)) {
                    System.out.println("已找到学号为" + id + "的学生");
                    System.out.println("请输入修改后的学生姓名：");
                    String name = sc.nextLine();
                    s.setName(name);
                    System.out.println("请输入修改后的学生年龄：");
                    String age = sc.nextLine();
                    s.setAge(age);
                    System.out.println("请输入修改后的学生居住地：");
                    String adress = sc.nextLine();
                    s.setAdress(adress);
                    System.out.println("学号为" + id + "的学生已经修改成功");
                }
            }
        } else {
            System.out.println("该学号的学生信息不存在，请重新输入");
            return;
        }

    }


    //提供查看所有学生方法
    public static void showAllStudent(ArrayList<Student> students) {
        if (students.size() == 0) {
            System.out.println("无学生信息，请先添加信息再查询");
            return;
        }
        System.out.println("学号\t姓名\t年龄\t居住地");
        int i;
        for (i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t" + s.getAdress());
        }
        System.out.println("一共找到" + i + "个学生的信息");
    }


    //    提供判断输入的学生是否存在的方法
    public static boolean isExisted(String id, ArrayList<Student> students) {
        boolean flag = false;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getSid().equals(id)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

}





