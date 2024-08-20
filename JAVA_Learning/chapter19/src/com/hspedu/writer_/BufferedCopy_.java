package com.hspedu.writer_;

import java.io.*;

public class BufferedCopy_ {

    public static void main(String[] args) {


        //老韩说明
        //1. BufferedReader 和 BufferedWriter 是按照字符操作
        //2. 不要去操作 二进制文件[声音, 视频, doc, pdf 等等], 可能造成文件损坏

        String srcFilePath = "e:\\a.txt";
        String destFilePath = "e:\\a2.txt";
//        String srcFilePath = "e:\\bocchi2.jpg";
//        String destFilePath = "e:\\bocchi3.jpg";
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;
        try {
            br = new BufferedReader(new FileReader(srcFilePath));
            bw = new BufferedWriter(new FileWriter(destFilePath));

            //说明: readLine 就读取一行内容,但是没有换行
            while ((line = br.readLine()) != null) {
                //每读取一行,就写入
                bw.write(line);
                //插入一个换行
                bw.newLine();
            }
            System.out.println("拷贝完毕...");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            try {
                if (br != null) {
                    br.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
