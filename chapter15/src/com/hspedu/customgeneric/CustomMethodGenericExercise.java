package com.hspedu.customgeneric;

public class CustomMethodGenericExercise {
    public static void main(String[] args) {
        Apple<String, Integer, Double> apple = new Apple<>();
        apple.fly(10); //10 会被自动装箱 Integer10, 输出Integer
        apple.fly(new Dog());//Dog
    }
}

class Apple<T,R,M> { //自定义类泛型
    public<E> void fly(E e){ //泛型方法
        System.out.println(e.getClass().getName());
    }
    //public void eat(U u) {} //错误,因为U没有声明
    public void run(M m) {} //OK
}
class Dog {}
