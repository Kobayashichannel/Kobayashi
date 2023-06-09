package com.hspedu.interface_;

public class InterfaceExercise02 {
    public static void main(String[] args) {
        new C().pX();
    }
}

interface A {
    int x = 0; //想到等价于 public static final int x = 0;
}

class B {
    int x = 1; //普通属性
}

class C extends B implements A {
    public void pX() {
        //System.out.println(x); //错误,原因不明x
        //可以明确的指定x
        //访问接口的 x 就是用 A.x
        //访问父类的 x 就是用 super.x
        System.out.println(A.x + " " + super.x);
    }
}
