package com.hspedu.string_;

public class StringExercise03 {
    public static void main(String[] args) {
        String a = "hsp"; //a 指向 常量池的 "hsp"
        String b = new String("hsp"); //b 指向堆中的对象
        System.out.println(a.equals(b)); //T
        System.out.println(a == b); //F
        //b.intern() 方法返回常量池地址
        System.out.println(a == b.intern()); //T
        System.out.println(b == b.intern()); //F
    }
}
