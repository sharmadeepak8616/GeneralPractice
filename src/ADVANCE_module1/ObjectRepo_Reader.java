package ADVANCE_module1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ObjectRepo_Reader {

	Properties prop ;
	
	public ObjectRepo_Reader()
	{
		try {
			File objRepo = new File("./Object_Repo/Obj_Repo.property");
			
			FileInputStream fis = new FileInputStream(objRepo);
			
			prop = new Properties();
			
			prop.load(fis);

		} catch (Exception e) {
			System.out.println("Exception from ObjectRepo_Reader");
			System.out.println(e.getMessage());
		}

	}
	
	
	public String getApplicationUrl()
	{
		return prop.getProperty("URL");
	}
		
	public String getUsernameXpath()
	{
		return prop.getProperty("wordpress.username.xpath");
	}
	
	public String getPasswordXpath()
	{
		return prop.getProperty("wordpress.password.xpath");
	}
	
	public String getLoginButtonXpath()
	{
		return prop.getProperty("wordpress.loginbutton.xpath");
	}
	
		
		
	
	
	
	
}
