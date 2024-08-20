package com.hspedu.abstract_;

public class BB extends Template{

        public void job() { //实现Template的抽象方法job

            long num = 0;
            for (long i = 0; i <= 80000; i++) {
                num *= i;
            }

        }
    }

