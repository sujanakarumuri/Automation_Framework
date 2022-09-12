package ddt;

import org.testng.annotations.Test;

public class OrganizationTest {
	
	@Test(groups="SmokeSuite", priority=1)
	public void orgCreated()
	{
		System.out.println("Orgnaisation Created");
	}
	
	@Test(priority=2)
	public void orgModified()
	{
		System.out.println("Organisation Modified");
	}
	
	@Test(groups="SmokeSuite", priority=3)
	public void orgDeleted()
	{
		System.out.println("Organisation deleted");
	}
	@Test
	public void runTimeOrguments()
	{
		System.out.println("Parameters");
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	
	}

}
