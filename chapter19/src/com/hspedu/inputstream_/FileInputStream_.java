package com.hspedu.inputstream_;

import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;

import java.io.IOException;

/**
 * 演示FileInputStream的使用(字节输入流 文件--> 程序)
 * 单个字节的读取,效率比较低
 * -> 使用 read(byte[] b)
 */
public class FileInputStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void readFile01() {
        java.lang.String filePath = "e:\\hello.txt";
        int readData = 0;
        FileInputStream fileInputStream = null;
        try {
            //创建 FileInputStream 对象,用于读取 文件
            fileInputStream = new FileInputStream(filePath);
            //从该输入流读取一个字节的数据. 如果没有输入可用,此方法将阻止
            //如何返回-1, 表示读取完毕
            while ((readData = fileInputStream.read()) != -1) {
                System.out.print((char) readData); //转成char显示
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件流,释放资源.
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 使用 read(byte[] b) 读取文件,提高效率
     */
    @Test
    public void readFile02() {
        java.lang.String filePath = "e:\\hello.txt";

        //字节数组
        byte[] buf = new byte[8]; //一次读取8个字节
        int readLen = 0;
        FileInputStream fileInputStream = null;
        try {
            //创建 FileInputStream 对象,用于读取 文件
            fileInputStream = new FileInputStream(filePath);
            //从该输入流读取最多b.length字节的数据到字节数组. 此方法将阻塞, 直到某些输入可
            //如何返回-1, 表示读取完毕
            //如果读取正常,返回实际读取的字节数
            while ((readLen = fileInputStream.read(buf)) != -1) {
                System.out.print(new java.lang.String(buf, 0, readLen)); //显示
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件流,释放资源.
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
