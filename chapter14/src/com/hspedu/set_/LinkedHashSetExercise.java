package com.hspedu.set_;

import java.util.LinkedHashSet;
import java.util.Objects;

@SuppressWarnings({"all"})
public class LinkedHashSetExercise {
    public static void main(String[] args) {

        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("奥拓", 1000));
        linkedHashSet.add(new Car("奥迪", 300000));
        linkedHashSet.add(new Car("法拉利",1000000));
        linkedHashSet.add(new Car("保时捷", 7000000));
        linkedHashSet.add(new Car("奥迪", 300000));
        linkedHashSet.add(new Car("奥迪", 300000));

        System.out.println("LinkedHashSet=" + linkedHashSet);

    }
}
/**
 * Car类 (属性:name,price), 如果 name 和 price 一样,
 * 则认为是相同元素,就不能添加.
 */

class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    //重写equals 方法和 hashCode
    //当 name 和 price 相同时, 就返回相同的 hashCode 值, equals返回t

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}

