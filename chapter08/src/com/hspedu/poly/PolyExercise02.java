package com.hspedu.poly;

public class PolyExercise02 {
    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.count);
        s.disPlay();
        Base b = s;
        System.out.println(b == s);
        System.out.println(b.count);
        b.disPlay();
    }
}

class Base { //父类
    int count = 10;
    public void disPlay() {
        System.out.println(this.count);
    }
}
class Sub extends Base {
    int count = 20;
    public void disPlay() {
        System.out.println(this.count);
    }
}

