package com.itheima;

/*需求：考核试卷
        五个小朋友排成一队。问第一个多大了，第一个说比第二个大两岁，
        问第二个，第二个说比第三个大两岁，以此类推。
        问第五个小朋友几岁了，第五个小朋友说3岁了。
        问第一个小朋友几岁？ (提示: 使用for循环完成.)
        试卷完成后发送QQ邮箱或者QQ即可,QQ: 2130386801*/
public class HowOld {
    public static void main(String[] args) {
        int age = 3;
        for (int i = 1; i < 5; i++) {
            age += 2;
        }
        System.out.println("第一个小朋友" + age + "岁");
    }
}
