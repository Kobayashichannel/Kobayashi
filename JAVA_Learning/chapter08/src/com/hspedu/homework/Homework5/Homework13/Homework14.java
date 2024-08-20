package com.hspedu.homework.Homework5.Homework13;

public class Homework14 {
    public static void main(String[] args) {

    }
}


class A {
    public A() {
        System.out.println("我是A类");
    }
}

class B extends A {
    public B() {
        System.out.println("我是B类的无参构造器");
    }

    public B(String name) {
        System.out.println(name + "我是B类的有参构造器");
    }
}

class C extends B {
    public C() {
        String d = ("hello");
        System.out.println("我是C类的无参构造器");
    }

    public C(String name) {
        super("hahaha");
        System.out.println("我是C类的有参构造器");
    }
}

