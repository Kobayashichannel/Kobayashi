import java.util.Scanner;

public class ArrayTest {
    //使用模板
    public static void main(String[] args) {
        System.out.println("hello world");
        int n = 1 + 3 + 4 * 5;
        Scanner myScanner = new Scanner(System.in);

        //开始快捷键自动分配 变量名
        Scanner scanner = new Scanner(System.in);

        MyTools mt = new MyTools();
        int[] arr = {10, -1, 8, 0, 34};
        mt.bubble(arr);
        //输出排序后的arr,引用传递
        System.out.println("===排序后的arr===");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }

        //老韩一个解惑
        //在idea 当我们 run 一个 文件时,会先编译成.class -> 在运行

    }
}
//查看类的继承关系 ctrl + h
class Person {
    String name;
    int age;
    //构造器-快捷键 alt + insert
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

//创建一个类MyTools,编写一个方法,可以完成对int数组冒泡排序的功能
//要求从小到大
class MyTools {
    //方法
    public void bubble(int[] arr) {
        //冒泡排序
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {//外层循环次数 arr,length - 1
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {//交换
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
