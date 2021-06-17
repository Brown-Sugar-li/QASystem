package com.brownsuagr.qasystem.utils;
import com.brownsuagr.qasystem.entity.ToEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

public class htmlEmail  {

    @Autowired
    private JavaMailSender mailSender;

    public void htmlEmail(ToEmail toEmail) throws MessagingException {
        //创建一个MINE消息
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper mineHelper = new MimeMessageHelper(message, true);
        //谁发
        mineHelper.setFrom("1195424838@qq.com");
        //谁要接收
        mineHelper.setTo(toEmail.getTos());
        //邮件主题
        mineHelper.setSubject(toEmail.getSubject());
        //邮件内容   true 表示带有附件或html
        mineHelper.setText(toEmail.getContent(), true);
        try {
            mailSender.send(message);
        } catch (MailException e) {
            e.printStackTrace();
        }
    }

}
