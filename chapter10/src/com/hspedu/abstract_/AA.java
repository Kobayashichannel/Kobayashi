package com.hspedu.abstract_;

public class AA extends Template{

    public void job() { //实现Template的抽象方法job

        long num = 0;
        for (long i = 0; i <= 800000; i++) {
            num += i;
        }

    }

//    public void job2() {
//        //得到开始的时间
//        long start = System.currentTimeMillis();
//        long num = 0;
//        for (long i = 0; i <= 8000000; i++) {
//            num += i;
//        }
//        //得到结束的时间
//        long end = System.currentTimeMillis();
//        System.out.println("AA执行时间 " + (end - start));
//    }
}
