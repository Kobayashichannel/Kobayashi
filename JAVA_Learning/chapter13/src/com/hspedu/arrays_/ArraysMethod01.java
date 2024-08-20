package com.hspedu.arrays_;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class ArraysMethod01 {
    public static void main(String[] args) {

        Integer[] integers = {1, 20, 90};
        //遍历数组
//        for (int i = 0; i < integers.length; i++) {
//            System.out.println(integers[i]);
//        }
        //直接使用Arrays.toString方法,显示数组
//        System.out.println(Arrays.toString(integers));

        //演示 sort方法的使用

        Integer arr[] = {1, -1, 7, 0, 89};
        //进行排序
        //老韩解读
        //1.可以直接使用冒泡排序,也可以直接使用Arrays提供的sort方法排序
        //2.因为数组是引用类型,所以通过sort排序后,会直接影响到 实参 arr
        //3.sort重载的,也可以通过sort排序后,会直接影响到, 实参 arr
        //4.调用 定制排序时,传入两个参数(1)排序的数组 arr
        //(2) 实现了Comparator接口的匿名内部类,要求实现 compare方法
        //5.先演示效果,再解释
        //6.这里体现了接口编程的方式,看看源码,就明白
        //Arrays.sort(arr); // 默认排序方法
        //定制排序

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i1 - i2;
            }
        });
        System.out.println("===排序后====");
        System.out.println(Arrays.toString(arr));
    }
}
