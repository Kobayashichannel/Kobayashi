package com.hspedu.override_;

public class Dog extends Animal {
    //老韩解读
    //1. 因为Dog是 Animal的子类
    //2. Dog的 cry方法和 Animal的 cry定义的形式一样(名称、返回类型、参数)
    //3. 这时我们就说 Dog的cry方法,重写了Animal的cry方法
    public void cry() {
        System.out.println("小狗汪汪叫..");
    }

    public String m1(){
        return null;
    }
    //这里Object 不是 String的子类,因此编译错误
//    public String m2() {
//        return null;
//    }

//    public BBB m3(){
//        return null;
//    }

    //细节: 子类方法不能缩小父类方法的访问权限 【演示】
    //public > protected > 默认 > private
    public void eat(){

    }
}

class AAA {

}

class BBB extends AAA {

}


