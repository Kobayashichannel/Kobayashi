package com.hspedu.poly.detail_;

public class PolyDetail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);// true
        System.out.println(bb instanceof AA);// true

        //aa 编译类型 AA, 运行类型是BB
        AA aa = new BB();
        System.out.println(aa instanceof AA);
        System.out.println(aa instanceof BB);

        Object obj = new Object();
        System.out.println(obj instanceof AA); //false
        String str = "hello";
        //System.out.println(str instanceof AA); //字符串和AA没有关系
        System.out.println(str instanceof Object); //true
    }
}

class AA {} //父类
class BB extends AA {} //子类
