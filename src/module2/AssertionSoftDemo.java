package module2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionSoftDemo{

	@Test
	public void testSoft1()
	{
		SoftAssert assertion = new SoftAssert();
		System.out.println("Test Soft Started");
		assertion.assertEquals(2, 4);
		System.out.println("Test Soft completed");
		assertion.assertAll();

	}

	
	@Test
	public void testHardAssertion()
	{
		System.out.println("Test Hard Started");
		Assert.assertEquals(2, 4);
		System.out.println("Test Hard completed");

	}
	
	
	
	
}
