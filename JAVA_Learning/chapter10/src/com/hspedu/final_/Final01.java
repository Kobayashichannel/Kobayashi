package com.hspedu.final_;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Final01 {
    public static void main(String[] args) {
        E e = new E();
       // e.TAX_RATE = 0.09;
    }
}

//如果我们要求A类不能被其他继承
//可以使用final修饰 A类
class A { }

//class B extends A { }

class C {
    //如果我们要求 hi不能被子类重写
    //可以使用final修饰 hi方法
    public final void hi() { }
}
class D extends C {
//    @Override
//    public int hashCode() {
//        return super.hashCode();
//          System.out.println("重写了C类的方法")
//    }
}

//当不希望类的某个属性的值被修改,可以使用final修饰
class E {
    public final double TAX_RATE = 0.08;
}
//当不希望某个局部变量被修改,可以使用final修饰
class F {
    public void cry() {
        //这时, NUM 也被称为 局部常量
        final double NUM = 0.01;
        //NUM = 0.9;
        System.out.println("NUM=" + NUM);
    }
}