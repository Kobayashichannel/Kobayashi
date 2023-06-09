package com.hspedu.homework.Homework5;

public class Homework10 {
    public static void main(String[] args) {
        // 测试
        Docter docter1 = new Docter("jack", 30, "牙可医生", '男', 200000);
        Docter docter2 = new Docter("jack", 31, "牙可医生", '男', 200000);

        System.out.println(docter1.equals(docter2)); //T
    }
}
