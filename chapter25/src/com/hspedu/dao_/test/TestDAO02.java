package com.hspedu.dao_.test;

import com.hspedu.dao_.dao.ActorDAO;
import com.hspedu.dao_.dao.GoodsDAO;
import com.hspedu.dao_.domain.Actor;
import com.hspedu.dao_.domain.Goods;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.List;

public class TestDAO02 {
    @Test
    //测试GoodsDAO 对goods表的crud操作

    public void TestGoodsDAO() throws Exception {
        GoodsDAO goodsDAO = new GoodsDAO();
        //1.查询
        List<Goods> goods1 = goodsDAO.queryMulti("select * from goods where id >= ?", Goods.class, 1);
        System.out.println("查询结果");
        for (Goods goods : goods1) {
            System.out.println(goods);
        }
        //查询单行记录
        Goods goods = goodsDAO.querySingle("select * from goods where id=?", Goods.class, 3);
        System.out.println("查询单行记录");
        System.out.println(goods);
        //查询单行单值
        Object o = goodsDAO.queryScalar("select goods_name from  goods where id=?", 2);
        System.out.println("查询单行单值");
        System.out.println(o);
        //4.dml操作 insert,update,delete
        int update = goodsDAO.update("insert into goods values(?,?,?)", 5, "小米", 4000);
        System.out.println(update > 0 ? "执行成功" : "执行未影响到表");

    }
}


