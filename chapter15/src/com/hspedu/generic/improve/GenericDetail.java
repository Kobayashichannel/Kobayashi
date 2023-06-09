package com.hspedu.generic.improve;

import java.util.ArrayList;
import java.util.List;

public class GenericDetail {
    public static void main(String[] args) {
        //1.给泛型指向数据类型是,要求引用类型,不能是基本数据类型
        List<Integer> list = new ArrayList<Integer>(); //OK
        //List<int> list2 = new ArrayList<int>(); //错误

        //2. 说明
        //因为 E 指定了 A 类型, 构造器传入了 new A()
        //在给泛型指定具体类型后,可以传入该类型或者子类类型
        Pig<A> apig = new Pig<A>(new A());
        apig.f();
        Pig<A> aPig2 = new Pig<>(new B());
        apig.f();

        //3. 泛型的使用类型
        ArrayList<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        //在实际开发中,我们往往简写
        //编译器会进行类型推断,老师推荐使用下面写法
        ArrayList<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();

        ArrayList<Pig> pigs = new ArrayList<>();

        //4. 如果是这样写 泛型默认是 Object
        ArrayList arrayList = new ArrayList(); //等价于 ArrayList<Object> arrayList = new ArrayList<Object>
        arrayList.add("xx");
        /*
              public boolean add(Object e) {
                ensureCapacityInternal(size + 1);  // Increments modCount!!
                elementData[size++] = e;
                return true;
            }
         */
        Tiger tiger = new Tiger("");
        /*

            class Tiger<Object> {  //类
                Object e;

                public Tiger(Object e) {
                    this.e = e;
                }
}
         */
    }
}

class Tiger<E> {  //类
    E e;

    public Tiger(E e) {
        this.e = e;
    }
}

class A {
}

class B extends A{
}
class Pig<E> {
    E e;

    public Pig(E e) {
        this.e = e;
    }

    public void f() {
        System.out.println(e.getClass());
    }
}

