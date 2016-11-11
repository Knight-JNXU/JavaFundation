package base;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

/**
 * Created by Knight_JXNU on 2016/11/11.
 * java 发送 email，由于网易邮箱有一些限制，所以这里使用新浪邮箱
 */
public class SendEmail {
    //邮件发送协议
    private final static String PROTOCOL = "smtp";
    //from(发送方)的smtp邮件服务器(这个东西可以在sina邮箱设置的客户端pop/imap/smtp中查看)
    private final static String HOST = "smtp.sina.cn";
//    private final static String HOST = "smtp.163.com";
    //smtp邮件服务器默认端口
    private final static String PORT = "25";
    //是否要求身份认证
    private final static String IS_AUTH = "true";
    //是否启用调试模式（启用调试模式可打印客户端与服务器交互过程时一问一答的响应消息）
    private final static String IS_ENABLED_DEBUG_MOD = "true";
    //发件人
//    private static final String from = "m18702510536_3@163.com";
    private static final String from = "18702510536@sina.cn";
    //收件人
//    private static final String to = "18702510536@sina.cn";
    private static final String to = "m18702510536_3@163.com";
    //初始化连接邮件服务器的会话信息
    private static Properties properties = null;

    static {
        properties = new Properties();
        properties.setProperty("mail.transport.protocol", PROTOCOL);
        properties.setProperty("mail.smtp.host", HOST);
        properties.setProperty("mail.smtp.port", PORT);
        properties.setProperty("mail.smtp.auth", IS_AUTH);
        properties.setProperty("mail.debug", IS_ENABLED_DEBUG_MOD);
    }

    public static void main(String[] args){
//        sentTextEmail();

//        sendHtmlEmail();

        sendHtmlWithInnerImageEmail();
    }

    /**
     * 发送简单的文本文件
     */
    private static void sentTextEmail(){
        try {
            //创建session实例对象
            Session session = Session.getDefaultInstance(properties);
            //创建MimeMessage实例对象
            MimeMessage message = new MimeMessage(session);
            //设置发件人
            message.setFrom(new InternetAddress(from));
            //设置邮件主题
            message.setSubject("使用javamail发送简单文本邮件");
            //设置收件人
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            //设置发送时间
            message.setSentDate(new Date());
            //设置纯文本内容为邮件正文
            message.setText("使用pop3协议发送文本邮件测试");
            //保存并生成最终的邮件内容
            message.saveChanges();
            //获得transport实例对象
            Transport transport = session.getTransport();
            //打开连接
            //如果是网易邮箱，对应的是登录名、授权码
            transport.connect("18702510536", "lw231029");
            //将message对象传递给transport对象，将邮件发送出去
            transport.sendMessage(message, message.getAllRecipients());
            //关闭连接
            transport.close();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    private static class MyAuthenticator extends Authenticator{
        private String username = "18702510536";
//        private String password = "lw231029";
        private String password = "231029";

        @Override
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(username, password);
        }
    }

    /**
     * 发送简单的html邮件
     */
    private static void sendHtmlEmail(){
        try {
            //创建Session实例对象
            Session session = Session.getInstance(properties, new MyAuthenticator());
            //创建MimeMessage实例对象
            MimeMessage message = new MimeMessage(session);
            //设置邮件主题
            message.setSubject("html邮件主题");
            //设置发送人
            message.setFrom(new InternetAddress(from));
            //设置发送时间
            message.setSentDate(new Date());
            //设置收件人
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            //设置html内容为邮件正文，指定MIME类型为text/html类型，并指定字符编码为utf-8
            message.setContent("<span style='color:red;'>html邮件测试...</span>", "text/html;charset=utf-8");
            //保存并生成最终的邮件内容
            message.saveChanges();
            //发送邮件
            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    private static void sendHtmlWithInnerImageEmail(){
        try {
            //创建session实例对象
            Session session = Session.getDefaultInstance(properties, new MyAuthenticator());
            //创建邮件内容
            MimeMessage message = new MimeMessage(session);
            //邮件主题，编码格式
            message.setSubject("带内嵌图片的html邮件", "utf-8");
            //发件人
            message.setFrom(new InternetAddress(from));
            //收件人
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            //抄送
            message.setRecipient(Message.RecipientType.CC, new InternetAddress("1990785022@qq.com"));
            //密送(不会再邮件收件人名单中显示出来)
            message.setRecipient(Message.RecipientType.BCC, new InternetAddress("1990785022@qq.com"));
            //发送时间
            message.setSentDate(new Date());
            //创建一个MIME子类型为"related"的MimeMultipart对象
            MimeMultipart mp = new MimeMultipart("related");
            //创建一个表示正文的MimeBodyPart对象，并将它加入到前面创建的MimeMultipart对象中
            MimeBodyPart htmlPart = new MimeBodyPart();
            mp.addBodyPart(htmlPart);
            //创建一个表示图片资源的MimeBodyPart对象，将它加入到前面创建的MimeMultipart对象中
            MimeBodyPart imagePart = new MimeBodyPart();
            mp.addBodyPart(imagePart);
            //将MimeMultipart对象设置为整个邮件的内容
            message.setContent(mp);

            //设置内嵌图片邮件体
            DataSource ds = new FileDataSource(new File(System.getProperty("user.dir")+"/src/main/image/b.jpg"));
            DataHandler dh = new DataHandler(ds);
            imagePart.setDataHandler(dh);
            //设置内容编号，用于其它邮件体引用
            imagePart.setContentID("b.jpg");

            //创建一个MIME子类型为“alternative”的MimeMultipar对象，并作为前面创建的htmlPart对象的邮件内容
            MimeMultipart htmlMultipart = new MimeMultipart("alternative");
            //创建一个表示html正文的MimeBobyPart对象
            MimeBodyPart htmlBodyPart = new MimeBodyPart();
            //其中cid=androidlogo.gif是引用邮件内部的图片，即imagePart.setContextID("androidlogo.gif");方法保存的图片
            htmlBodyPart.setContent("<span style='color:red'>这是带内嵌图片的html邮件！！<img src='cid:b.jpg'/></span>", "text/html;charset=utf-8");
            htmlMultipart.addBodyPart(htmlBodyPart);
            htmlPart.setContent(htmlMultipart);
            //保存并生成最终的邮件内容
            message.saveChanges();
            //发送邮件
            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
