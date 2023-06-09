package com.hspedu.reflection.homework;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Homework01 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        /**
         * 定义private类,有私有name属性,并且属性为HelloKitty
         * 提供getName的公有方法
         * 创建privateTest的类,利用CLass类得到私有的name属性,修改私有的name属性,并调用getName()的方法打印name属性值
         *
         */
        //1. 得到 PrivateTest类对应的Class类
        Class<PrivateTest> privateTestClass = PrivateTest.class;
        //2. 创建实例对象
        PrivateTest privateTestObj = privateTestClass.newInstance();
        //3. 得到name属性对象
        Field name = privateTestClass.getDeclaredField("name"); //name属性是private
        //4. 爆破name
        name.setAccessible(true);
        name.set(privateTestObj, "天龙八部");
        //5. 得到getName方法对象
        Method getName = privateTestClass.getMethod("getName");
        //6. 因为getName() 是public,所以直接调用
        Object invoke = getName.invoke(privateTestObj);
        System.out.println("name属性值=" + invoke);//天龙八部

    }
}

class PrivateTest {
    private String name = "HelloKitty";
    //默认无参构造器
    public String getName() {
        return name;
    }
}
