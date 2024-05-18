package com.itheima;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class Mybatisplus03DmlApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testSave(){
        User user = new User();
//        user.setId(667L);
        user.setName("黑马程序员");
        user.setPassword("itheima");
        user.setAge(12);
        user.setTel("4006184000");
        userDao.insert(user);
    }

    @Test
    void testDelete(){
//        List<Long> list = new ArrayList<>();
//        list.add(1757117182069764098L);
//        list.add(1757117886784176129L);
//        list.add(1757118372270698498L);
//        userDao.deleteBatchIds(list);

//        List<Long> list = new ArrayList<>();
//        list.add(1L);
//        list.add(3L);
//        list.add(4L);
//        userDao.selectBatchIds(list);

        userDao.deleteById(2L);
//        System.out.println(userDao.selectList(null));

    }

    @Test
    void testUpdate(){
//        User user = new User();
//        user.setId(3L);
//        user.setName("Tom888");
////        user.setPassword("tom888");
//        user.setVersion(1);
//        userDao.updateById(user);

//        //1.先通过修改数据id将当前数据查出来
//        User user = userDao.selectById(3L);
//        //2..将要修改的属性逐一设置进去
//        user.setName("Jack888");
//        userDao.updateById(user);

        //1.先通过修改数据id将当前数据查出来
        User user = userDao.selectById(3L); //version=3

        User user2 = userDao.selectById(3L); //version=3

        user2.setName("Jack aaa");
        userDao.updateById(user2); //version=4

        user.setName("Jack bbb");
        userDao.updateById(user); //version=3?条件还成立吗
    }

    @Test
    void testGetById() {
        User user = userDao.selectById(2L);
        System.out.println(user);
    }


    @Test
    void testGetAll() {
        List<User> userList = userDao.selectList(null);
        System.out.println(userList);
    }

    @Test
    void testGetByPage(){
        //IPage对象封装了分页操作相关的数据
        IPage page  = new Page(2,3);
        userDao.selectPage(page,null);
        System.out.println("当前页码值："+page.getCurrent());
        System.out.println("每页显示数："+page.getSize());
        System.out.println("一共多少页："+page.getPages());
        System.out.println("一共多少条数据："+page.getTotal());
        System.out.println("数据："+page.getRecords());
    }

}
