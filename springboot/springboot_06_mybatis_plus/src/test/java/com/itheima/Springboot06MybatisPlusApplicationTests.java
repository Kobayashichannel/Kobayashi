package com.itheima;

import com.itheima.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot06MybatisPlusApplicationTests {

    @Autowired
    private BookDao bookDao;

    //查询单个数据库ID
    @Test
    void contextLoads() {
        System.out.println(bookDao.selectById(1));
    }

    //查询全部数据库ID
    @Test
    void testGetAll() {
        System.out.println(bookDao.selectList(null));
    }

}
