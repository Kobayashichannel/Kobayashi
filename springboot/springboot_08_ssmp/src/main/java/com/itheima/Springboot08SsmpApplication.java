package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.util.Arrays;

@SpringBootApplication
public class Springboot08SsmpApplication {

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(args));
//        String[] arg = new String[1];
//        arg[0] = "--server.port=8082";
//        SpringApplication.run(Springboot08SsmpApplication.class, arg);
        //可以在启动boot程序时读取外部临时配置对应的入口,也就是读取外部参数的形参。
        SpringApplication.run(Springboot08SsmpApplication.class);
    }

}
