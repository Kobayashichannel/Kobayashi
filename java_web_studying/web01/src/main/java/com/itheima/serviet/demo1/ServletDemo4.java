package com.itheima.serviet.demo1;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ServletConfig对象的API的演示
 */
public class ServletDemo4 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获取初始化参数的API:
		// 获得SerletConfig对象:
		ServletConfig config = this.getServletConfig();
		String username = config.getInitParameter("username");
		String password = config.getInitParameter("password");
		System.out.println(username + "   " + password);
		// 2.获得所有初始化参数的名称:
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
