package ddt;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	//@Test(groups="RegressionSuite")
	public void createContactTest()
	{
		System.out.println("Contact created");
	}

	@Test
	public void createModifiedTest()
	{
		System.out.println("Contact modified");
		System.out.println("Done by engg2");
	}
	@Test
	//@Test(groups="SmokeSuite")
	public void createDeleted()
	{
		System.out.println("Contact deleted");
		System.out.println("This is done by engg2");
	}

	@Test
	public void createNewContactTest()
	{
		System.out.println("New contact is created");
		System.out.println("Done by engg1");
	}
	

}
