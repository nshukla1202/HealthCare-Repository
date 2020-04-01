package testngEx;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependancyOrder {
	//As we know that we do application testing and fuctional testing.
	//when we verify the functionality of the application
	//when we do end to end scenario of the system is called system testing.
	//search depends on login,book depends on search,can we do search without login...
	//Execution order login  log out search-no
	//logout as test case depends on serch,search depends on login
	@Test
	public void login()
	{
	
  //if search is failed the logout is skipped so when dependecy method is failed
}
	//if the dependsOnMethod is failed the method which is depency on  will be skipped.it is called Hard dependecy.
	//If the dependency method @Test(dependsOnMethods= {"search"},alwaysRun=true) it is called soft dependancy.
	@Test(dependsOnMethods= {"login"})
	public void search()
	{
		Assert.assertEquals("a", "b");
	}
	@Test(dependsOnMethods= {"search"},alwaysRun=true)
	public void logout()
	{
		
	}
}

	
