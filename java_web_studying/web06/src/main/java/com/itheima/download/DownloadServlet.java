package com.itheima.download;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Base64;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 文件下载的Servlet
 */
public class DownloadServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1.接收参数：
		String filename = new String(request.getParameter("filename").getBytes("ISO-8859-1"), "UTF-8");
		// 2.下载：设置两个头和一个流
		// 设置Content-Type
		String type = getServletContext().getMimeType(filename);
		response.setContentType(type);
		// 定义一个代表该文件的路径：
		String path = getServletContext().getRealPath("/download");
		File file = new File(path + "/" + filename);
		// 判断浏览器的类型:
		String agent = request.getHeader("User-Agent");
		if (agent.contains("Firefox")) {
			// 使用的是Firefox
			Base64.Encoder encoder = Base64.getEncoder();
			filename = "=?utf-8?B?" + encoder.encodeToString(filename.getBytes("utf-8")) + "?=";
		} else {
			// IE或者其他的浏览器
			filename = URLEncoder.encode(filename, "UTF-8");
		}

		// 设置Content-Disposition
		response.setHeader("Content-Disposition", "attachment;filename=" + filename);
		// 设置一个代表了文件的输入流
		InputStream is = new FileInputStream(file);
		OutputStream os = response.getOutputStream();
		// 两个流对接：
		int len = 0;
		byte[] b = new byte[1024];
		while ((len = is.read(b)) != -1) {
			os.write(b, 0, len);
		}
		is.close();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
