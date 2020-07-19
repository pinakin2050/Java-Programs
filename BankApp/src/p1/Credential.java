package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class Credential extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String email = request.getParameter("email");
			HttpSession session1 = request.getSession(true);
			session1.setAttribute("email", email); //putting email on session
			//response.sendRedirect("/BankApp/changeToNewPassword.jsp");
			
			try
			{
				final String fromEmail = Abc.getEmail();	//sender's email
				final String password = Abc.getPassword();	//sender's password		
				String toEmail = "jigarbharatdesai@gmail.com";	//receiver's email
				
				Properties prop = new Properties();
				prop.put("mail.smtp.host", "smtp.gmail.com");
				prop.put("mail.smtp.port", 587);
				prop.put("mail.smtp.auth", "true");
				prop.put("mail.smtp.starttls.enable", "true");
				
				Session session = Session.getDefaultInstance(prop, new javax.mail.Authenticator()
				{
					protected PasswordAuthentication getPasswordAuthentication()
					{
						return new PasswordAuthentication(fromEmail, password);
					}
				});
				
				MimeMessage mesg = new MimeMessage(session);
				mesg.setFrom(new InternetAddress(fromEmail));
				mesg.addRecipient(Message.RecipientType.TO,new InternetAddress(toEmail));
				mesg.setSubject("DO NOT REPLY TO THIS EMAIL");  
				mesg.setText("http://localhost:9090/BankApp/changeToNewPassword.jsp");  
			    Transport.send(mesg);
			    System.out.println("message sent");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
}
