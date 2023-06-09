package com.hspedu.static_;

public class StaticExercise03 {
}
class Person {
    private int id;
    private static int total = 0;
    public static void setTotalPerson(int total){

        Person.total = total;
    }
    public Person() {
        total++;
        id = total;
    }
    //编写一个方法,输出total的值
    public static void m() {
        System.out.println("total的值=" + total);
    }
}
class TestPerson {
    public static void main(String[] args) {
        Person.setTotalPerson(3);
        new Person();
        Person.m();
    }
}
