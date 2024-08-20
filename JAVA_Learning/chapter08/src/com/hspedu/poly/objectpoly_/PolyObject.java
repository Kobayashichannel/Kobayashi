package com.hspedu.poly.objectpoly_;

public class PolyObject {
    public static void main(String[] args) {
        //体验对象多态的特点

        //animal 编译类型就是 Animal , 运行类型就是 Dog
        Animal animal = new Dog();
        //因为运行时 , 执行到改行时, animal运行类型就是Dog,所以cry就是Dog的cry
        animal.cry(); //执行小狗汪汪叫

        //animal 编译类型 Animal,运行类型就是 Cat
        animal = new Cat();
        animal.cry(); //小猫喵喵叫
    }
}
