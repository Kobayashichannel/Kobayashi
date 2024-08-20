package com.hspedu.mhl.service;

import com.hspedu.mhl.dao.MenuDAO;
import com.hspedu.mhl.daomain.Menu;

import java.util.List;

/**
 * 完成对menu表的各种操作(通过调用MenuDAO)
 */
public class MenuService {

    //定义MenuDAO 属性
    private MenuDAO menuDAO = new MenuDAO();


    //返回所有的菜品,返回给界面使用
    public List<Menu> list() {
        return menuDAO.queryMulti("select * from menu", Menu.class);
    }

    //需要方法, 根据ID,返回Menu对象
    public Menu getMenuById(int id) {
        return menuDAO.querySingle("select * from menu where id = ?", Menu.class, id);
    }
}

