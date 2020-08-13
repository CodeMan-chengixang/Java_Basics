package com.chengxiang.edu.info.manager.entry;

import com.chengxiang.edu.info.manager.controller.StudentController;

import java.util.Scanner;

public class infoManagerEntry {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("--------欢迎来到黑马信息管理系统--------");
            System.out.println("请输入您的选择: 1.学生管理  2.老师管理  3.退出");

            String choice = sc.next();
            switch (choice){
                case "1":
                    //System.out.println("学生管理");
                    studentController.start();
                    break;
                case"2":
                    System.out.println("老师管理");
                    break;
                case "3":
                    System.out.println("感谢您使用黑马信息管理系统，欢迎下次再来！");
                    System.exit(0);
                default:
                    System.out.println("对不起，没有这个选项，请重新输入!");
            }
        }





        //System.out.println("--------欢迎来到 <老师> 管理系统--------");
        //System.out.println("请输入您的选择: 1.添加老师  2.删除老师  3.修改老师  4.查看老师  5.退出");

    }
}
