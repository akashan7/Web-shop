package com.shop.others;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop.data.tables.Users;

public class SendEmail {
	
	public static void sendCode(String text, HttpServletRequest request) {
		Users user = RepositoriesAccess.usersRepository.findByLogin(SecurityContextHolder.getContext().getAuthentication().getName());

		if ((RepositoriesAccess.usersRepository.findByeMail(user.geteMail()) == null)) {
			//model.addAttribute("msg", "Wrong e-mail");
			//return "loginAndRegistration/reset/forgotPassword";
		} else if (RepositoriesAccess.usersRepository.findByLogin(user.getLogin()) == null) {
			//model.addAttribute("msg", "Wrong login");
			//return "loginAndRegistration/reset/forgotPassword";
		}

		final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
		Properties props = System.getProperties();
		props.setProperty("mail.smtp.host", "smtp.gmail.com");
		props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
		props.setProperty("mail.smtp.socketFactory.fallback", "false");
		props.setProperty("mail.smtp.port", "465");
		props.setProperty("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.auth", "true");
		props.put("mail.debug", "true");
		props.put("mail.store.protocol", "pop3");
		props.put("mail.transport.protocol", "smtp");
		final String username = "examplewebshop@gmail.com";
		final String password = "ZAQ!2wsx";
		try {
			Session session = Session.getDefaultInstance(props, new Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, password);
				}
			});

			String code = Long.toHexString(Double.doubleToLongBits(Math.random()));
			Cookie cookie = new Cookie("code", code);
			// cookie.setPath("/WebShop");
			// cookie.setHttpOnly(true);
			cookie.setMaxAge(300);

			Message msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress("examplewebshop@gmail.com"));
			// msg.setRecipients(Message.RecipientType.TO,
			// InternetAddress.parse(user.geteMail(), false));
			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("szymeksss@wp.pl", false));
			msg.setSubject("Shop order");
			msg.setText(text);
			msg.setSentDate(new Date());
			Transport.send(msg);
			
			//response.addCookie(cookie);
			//this.user = user;
		} catch (MessagingException e) {
			System.out.println("Error : " + e);
		}		

//		System.out.println("USER");
//		System.out.println(this.user.getLogin());
//		System.out.println(this.user.getPassword());
//		System.out.println(this.user.geteMail());
	}
	
	
	public static void whatAmIDoing(String text) {

		final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
		Properties props = System.getProperties();
		props.setProperty("mail.smtp.host", "smtp.gmail.com");
		props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
		props.setProperty("mail.smtp.socketFactory.fallback", "false");
		props.setProperty("mail.smtp.port", "465");
		props.setProperty("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.auth", "true");
		props.put("mail.debug", "true");
		props.put("mail.store.protocol", "pop3");
		props.put("mail.transport.protocol", "smtp");
		final String username = "examplewebshop@gmail.com";
		final String password = "ZAQ!2wsx";
		try {
			Session session = Session.getDefaultInstance(props, new Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, password);
				}
			});

			String code = Long.toHexString(Double.doubleToLongBits(Math.random()));
			Cookie cookie = new Cookie("code", code);
			// cookie.setPath("/WebShop");
			// cookie.setHttpOnly(true);
			cookie.setMaxAge(300);

			Message msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress("examplewebshop@gmail.com"));
			// msg.setRecipients(Message.RecipientType.TO,
			// InternetAddress.parse(user.geteMail(), false));
			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("szymeksss@wp.pl", false));
			msg.setSubject("Shop order");
			msg.setText(text);
			msg.setSentDate(new Date());
			Transport.send(msg);
			
			//response.addCookie(cookie);
			//this.user = user;
		} catch (MessagingException e) {
			System.out.println("Error : " + e);
		}		

//		System.out.println("USER");
//		System.out.println(this.user.getLogin());
//		System.out.println(this.user.getPassword());
//		System.out.println(this.user.geteMail());
	}

}