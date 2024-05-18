package com.itheima.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component  //加载spring
@Aspect  //告诉spring下面的代码是用来做AOP的
public class MyAdvice {
    // @Pointcut定义好切入点
    @Pointcut("execution(void com.itheima.dao.BookDao.update())")
    private void pt() {}
    // @Before把切入点和通知绑定好
    @Before("pt()")
    public void method() {
        System.out.println(System.currentTimeMillis());
    }
}
