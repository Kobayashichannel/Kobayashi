package com.hspedu.innerclass;

public class InnerClassExercise01 {
    public static void main(String[] args) {

        //当做实参直接传递,简洁高效
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("这是一幅名画...");
            }
        });
        //传统方式
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("这是一幅名画~~...");
            }
        });
    }

    //静态方法
    public static void f1(IL il) {
        il.show();
    }
}
//接口
interface IL {
    void show();
}
//类->实现IL => 编程领域(硬编程)
class Picture implements IL {
    @Override
    public void show() {
        System.out.println("这是一幅名画XX...");
    }
}
