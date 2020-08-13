package com.chengxiang.edu.info.manager.controller;

import com.chengxiang.edu.info.manager.domain.Student;
import com.chengxiang.edu.info.manager.service.StudentService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StudentController {
    private Scanner sc = new Scanner(System.in);
    private  StudentService studentService = new StudentService();

    public void start() {
        studentLoop:
        while (true) {
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    //System.out.println("添加学生");
                    addStudent();
                    break;
                case "2":
                    //System.out.println("删除学生");
                    delStudent();
                    break;
                case "3":
                    //System.out.println("修改学生");
                    updateStudent();
                    break;
                case "4":
                    //System.out.println("查看学生");
                    findAllStudent();
                    break;
                case "5":
                    System.out.println("感谢使用学生管理系统，再见！");
                    break studentLoop;
                default:
                    System.out.println("对不起，没有这个选项，请重新输入!");

            }
        }


    }

    public void updateStudent() {
        String sid = inputStudentId();
        Student stu = inputStudentInfo(sid);
        if (studentService.updateStudent(sid,stu)){
            System.out.println("修改成功！");
        }else {
            System.out.println("修改失败！");
        }
    }

    public void delStudent() {
        String sid = inputStudentId();
        if (studentService.delStudent(sid)){
            System.out.println("删除成功！");
        }else {
            System.out.println("删除失败，请重试");
        }

    }

    public String inputStudentId() {
        while (true){
            System.out.println("请输入学生学号：");
            String sid = sc.next();
            if (studentService.isExists(sid)){
                return sid;
            }else {
                System.out.println("您输入的学号不存在，请重新输入");
            }
        }
    }

    public void findAllStudent() {
        Student[] students = studentService.findAllStudent();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        if (students == null) {
            System.out.println("暂无数据，请先添加后重试！");
            return;
        }

        System.out.println("学号\t\t姓名\t年龄\t生日");
        for (int i = 0; i < students.length; i++) {
            if (students[i]!=null){
                System.out.println(students[i].getId() + "\t" +
                                    students[i].getName() + "\t" +
                                    students[i].getAge() + "\t\t" +
                                    sdf.format(students[i].getBirthday()));
            }

        }

    }

    public void addStudent() {
        String sid;
        while (true) {
            System.out.println("请输入学生学号：");
            sid = sc.next();
            Boolean exists = studentService.isExists(sid);
            if (exists) {
                System.out.println("该学号已被占用，请重新输入!");
            } else {
                break;
            }
        }
        Student stu = inputStudentInfo(sid);
        Boolean result = studentService.addStudent(stu);
        if (result) {
            System.out.println("添加成功！");
        } else {
            System.out.println("添加失败！");
        }


    }

    public Student inputStudentInfo(String sid) {
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        String ageStr = sc.next();
        int age = Integer.parseInt(ageStr);
        System.out.println("请输入学生生日：");
        String birthdayStr = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = null;
        try {
            birthday = sdf.parse(birthdayStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Student(sid, name, age, birthday);
    }
}
