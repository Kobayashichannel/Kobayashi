package com.itheima.service.impl;

import com.itheima.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@Service
public class SendMailServiceImpl2 implements SendMailService {

    @Autowired
    private JavaMailSender javaMailSender;

    //发送人
    private String from = "944379197@qq.com";
    //接收人
    private String to = "qq944379197@163.com";
    //标题
    private String subject = "测试邮件";
    //正文
    private String context = "<img src='https://cn.bing.com/images/search?view=detailV2&ccid=qA2h1%2bGz&id=B1F9A7F95C36D4D1DD9ED44D311F1361B5FAEE1D&thid=OIP.qA2h1-Gz3vhxFKyMAtjLfgHaEi&mediaurl=https%3a%2f%2fc-ssl.duitang.com%2fuploads%2fblog%2f202301%2f20%2f20230120181600_c90bb.jpg&exph=980&expw=1600&q=%e6%b3%a2%e5%a5%87&simid=608042789993065052&FORM=IRPRST&ck=2E3B5BCE079835B1F4CADD7795562499&selectedIndex=20&itb=0'/><a href='https://www.itcast.cn'>点开有惊喜</a>";

    @Override
    public void sendMail() {

        try {
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message,true);
            helper.setFrom(from+"(小甜甜)");
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(context,true);

            //添加附件
            File f1 = new File("F:\\idea_java_project\\maven\\itcast-mybatis-plus\\springboot\\springboot_23_mail\\target\\springboot_23_mail-0.0.1-SNAPSHOT.jar");
            File f2 = new File("F:\\idea_java_project\\maven\\itcast-mybatis-plus\\springboot\\springboot_23_mail\\src\\main\\resources\\miyu.png");

            helper.addAttachment(f1.getName(),f1);
            helper.addAttachment("垃圾兔.png",f2);

            javaMailSender.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

















