package com.hspedu.override_;

public class OverrideExercise {
    public static void main(String[] args) {
        //在 main 中,分别创建 Person 和 Student 对象，调用 say 方法输出自我介绍
        Person jack = new Person("jack", 10);
        System.out.println(jack.say());

        Student smith = new Student("smith",20,123456,99.8);
        System.out.println(smith.say());
    }
}
