package cn.itcast01;

import com.itheima03.MyService;

import java.util.ServiceLoader;

public class Test02 {
    public static void main(String[] args) {
        ServiceLoader<MyService> myServices = ServiceLoader.load(MyService.class);
        for (MyService myService : myServices) {
            myService.service();
        }
    }

}
