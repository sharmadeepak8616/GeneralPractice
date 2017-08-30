package BaseClass;

import java.util.ArrayList;
import java.util.Iterator;

public class Math {

	public int add (int a , int b)
	{
		int res=a+b;
		return res;
	}
	
	
	public void itertest()
	{
		ArrayList values = new ArrayList();
		ArrayList fields = new ArrayList();
		
		values.add("Deepak");
		values.add("Sharma");
		values.add("hellobrother@gmail.com");
		
		fields.add("Name");
		fields.add("again");
		fields.add("email");
		
		System.out.println(values);
		System.out.println(fields);
		
		Iterator iterValues = values.iterator();
		Iterator iterFields = fields.iterator();
		
		while(iterValues.hasNext() && iterFields.hasNext())
		{
			
		}
		
		
	}
	
}
