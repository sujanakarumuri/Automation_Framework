package ddt;

import org.testng.annotations.Test;

public class ContactTest {
	
	@Test(groups="RegressionSuite")
	public void createContact()
	{
		System.out.println("Contact created");
	}

	@Test
	public void createModified()
	{
		System.out.println("Contact modified");
	}
	
	@Test(groups="SmokeSuite")
	public void createDeleted()
	{
		System.out.println("Contact deleted");
	}


}
