package module2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {

	@Test
	public void test1()
	{
		Assert.assertEquals(2, 2);
	}
	
	
	@Test
	public void test2()
	{
		Assert.assertEquals(2, 4, "test 2 - This message will display only if test fails");
	}	
	
	@Test
	public void test3()
	{
		Assert.assertTrue(true, "test 3 - This message will appear if its not true or if fails");
	}
	
	
	@Test
	public void test4()
	{
		Assert.assertTrue(false, "test 4 - This message will display only if test fails");
	}
}
