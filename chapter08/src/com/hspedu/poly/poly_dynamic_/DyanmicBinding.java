package com.hspedu.poly.poly_dynamic_;

public class DyanmicBinding {
    public static void main(String[] args) {
        //a 的编译类型 A, 运行类型 B
        A a = new B(); //向上转型
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }
}

class A { //父类
    public int i = 10;
    //动态绑定机制

    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }
}

class B extends A { //子类
    public int i = 20;

//    public int sum() {
//        return i + 20;
//    }

    public int getI() { //子类getI()
        return i;
    }

//    public int sum1() {
//        return i + 10;
//    }
}


