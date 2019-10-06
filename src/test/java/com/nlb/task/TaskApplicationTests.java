package com.nlb.task;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskApplicationTests {

    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    public void test03(){
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setSubject("biaoti");
        mailMessage.setText("neirong ");
        mailMessage.setTo("15624977344@163.com");
        mailMessage.setFrom("867478750@qq.com");
        mailSender.send(mailMessage);
    }


    @Test
    public void test01() throws MessagingException {
        //创建一个复杂的邮件
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        //邮件设置
        helper.setSubject("重新发");//设置标题
        helper.setText("<b style='color:red'>内容标红</b>",true);//文字内容
        helper.setTo("15624977344@163.com");//发送的地址
        helper.setFrom("867478750@qq.com");//发送来源
        //附件
      //  helper.addAttachment("1.png",new File("C:\\Users\\nlb\\Desktop\\图片.png"));
       // helper.addAttachment("2.docx",new File("C:\\Users\\nlb\\Desktop\\按照分段123进行，画表格.docx"));
       // helper.addAttachment("3.pptx",new File("E:\\jj\\《地震勘探原理》2016课件\\4－地震波的速度.pptx"));
        mailSender.send(message);


    }

    @Test
    public void contextLoads() {
    }

}
