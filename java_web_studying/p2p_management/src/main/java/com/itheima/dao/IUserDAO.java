package com.itheima.dao;

import java.sql.SQLException;

import com.itheima.domain.User;

public interface IUserDAO {

	User findUserByUsernameAndPassword(String username, String password) throws SQLException;

}
