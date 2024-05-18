package com.itheima;

import com.itheima.dao.UserDao;
import com.itheima.factory.UserDaoFactory;

public class AppForInstanceUser {
    public static void main(String[] args) {
        //创建实例工厂对象
        UserDaoFactory userDaoFactory = new UserDaoFactory();
        //通过实例工厂对象创建对象
        UserDao userDao = userDaoFactory.getUserDao();
        userDao.save();
    }
}
