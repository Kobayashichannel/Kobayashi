package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.dao.impl.BookDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForLifeCycle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
//        ctx.registerShutdownHook();
//        ctx.close();
    }
}
