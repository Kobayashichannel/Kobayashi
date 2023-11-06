package com.itheima.utils;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class DownloadUtils {
	public static String base64EncodeFileName(String fileName) {
		Base64.Encoder encoder = Base64.getEncoder();
		try {
			return "=?UTF-8?B?" + new String(encoder.encode(fileName.getBytes("UTF-8"))) + "?=";
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
