package com.hspedu.jdbc.myjdbc.jdbc;

public interface JdbcInterface {

    //连接
    public Object getConnection() ;
    //crud
    public void crud();
    //关闭连接
    public void close();
}
