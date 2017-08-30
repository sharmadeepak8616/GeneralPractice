package ADVANCE_module1;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.testng.annotations.Test;

public class SendEmail_CommonsEmail_API {
	
	@Test
	public void sendEmail()
	{
		
		try {
			Email email = new SimpleEmail();
			email.setHostName("smtp.gmail.com");
			email.setSmtpPort(465);
			email.setAuthenticator(new DefaultAuthenticator("sharma.deepak8616@gmail.com", "chakshu4@Gmail"));
			email.setSSLOnConnect(true);
			email.setFrom("sharma.deepak8616@gmail.com");
			email.setSubject("TestMail");
			email.setMsg("This is a test mail ... :-)");
			email.addTo("sharma.deepak8616@gmail.com");
			email.send();
		} catch (Exception e) {
			System.out.println("Exception while sending email");
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	
	
	

}
