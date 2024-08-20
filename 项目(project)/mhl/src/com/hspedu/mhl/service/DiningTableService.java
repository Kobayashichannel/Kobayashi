package com.hspedu.mhl.service;

import com.hspedu.mhl.dao.DiningTableDAO;
import com.hspedu.mhl.daomain.DiningTable;

import java.sql.SQLException;
import java.util.List;

public class DiningTableService {
    //定义一个DiningTableDAO对象
    private DiningTableDAO diningTableDAO = new DiningTableDAO();

    //返回所有餐桌的信息
    public List<DiningTable> list() {

        List<DiningTable> diningTables =
                diningTableDAO.queryMulti("select id, state from diningTable", DiningTable.class);
        return diningTables;
    }

    //根据id, 查询对应的餐桌DiningTable 对象
    //如果返回null, 表示id编号对应的餐桌不存在
    public DiningTable getDiningTableById(int id) {

        //老韩小技巧: 把sql语句放在查询分析器去测试一下.
        DiningTable diningTable = diningTableDAO.querySingle("select * from diningTable where id =?", DiningTable.class, id);
        return diningTable;
    }

    //如果餐桌可以预定, 调用方法,对其状态进行更新(包括预定人的名字和电话)
    public boolean orderDiningTable(int id, String orderName, String orderTel) throws SQLException {

        int update =
                diningTableDAO.update("UPDATE diningTable SET state='已经预定', orderName=?, orderTel=? WHERE id=?", orderName, orderTel, id);

        return update > 0;
    }

    //需要提供一个更新 餐桌状态的方法
    public boolean updateDiningTableState(int id, String state) throws SQLException {

        int update = diningTableDAO.update("update diningTable set state=? where id=?", state, id);
        return update > 0;
    }

    //提供方法,将指定的餐桌设置为空闲状态
    public boolean updateDiningTableToFree(int id, String state) throws SQLException {

        int update = diningTableDAO.update("update diningTable set state=?,orderName='',orderTel='' where id=?", state, id);
        return update > 0;
    }

}
