package com.itheima.serviet.demo1;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet����������
 * 
 * @author asus
 *
 */
public class ServletDemo1 implements Servlet {

	@Override
	/**
	 * Servlet����ʵ������ʱ��init�����ͻ�ִ�У�����ִֻ��һ�Ρ�(Servlet�ǵ�����)
	 */
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("ServletDemo1��ʼ��......");
	}

	@Override
	/**
	 * service����:�κ�һ�����󶼻�ִ��service����������ִ�ж�Ρ�
	 */
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("ServletDemo1ִ����......");
	}

	@Override
	/**
	 * Servlet�ӷ��������Ƴ����߷������رյ�ʱ������Servlet��ִ��һ�Ρ�
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("ServletDemo1��������......");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
