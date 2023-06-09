package com.use;

import com.xiaoming.Dog;

public class Test {
    public static void main(String[] args) {

        Dog dog = new Dog();
        System.out.println(dog);//com.xiaoming.Dog@677327b6

        com.xiaoqiang.Dog dog1 = new com.xiaoqiang.Dog();
        System.out.println(dog1);//com.xiaoqiang.Dog@14ae5a5

        System.out.println(Math.abs(-1));
    }
}
