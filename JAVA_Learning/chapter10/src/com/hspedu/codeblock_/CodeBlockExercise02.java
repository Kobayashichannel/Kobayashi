package com.hspedu.codeblock_;

public class CodeBlockExercise02 {
}

class Smaple
{
    Smaple(String s)
    {
        System.out.println(s);
    }
    Smaple()
    {
        System.out.println("Sample默认构造器函数被调用");
    }
}

class Test {
    Smaple sam1 = new Smaple("sam1成员初始化");
    static Smaple sam = new Smaple("静态成员的初始化 ");
    static {
        System.out.println("static块执行");
        if(sam == null) System.out.println("sam in null");
    }
    Test()//构造器
    {
        System.out.println("Test默认构造器" );
    }
    //主方法
    public static void main(String[] args) {
        Test a = new Test();//无参构造器
    }
}