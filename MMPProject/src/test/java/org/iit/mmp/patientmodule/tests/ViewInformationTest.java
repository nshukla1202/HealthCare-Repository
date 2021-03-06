package org.iit.mmp.patientmodule.tests;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.iit.mmp.base.TestBase;
import org.iit.mmp.helper.Helperclass;
import org.iit.mmp.patientmodule.pages.LoginPage;
import org.iit.mmp.patientmodule.pages.ViewInformationPage;
import org.iit.mmp.utility.Utility;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ViewInformationTest extends TestBase {	


	
	Utility util;
	Helperclass helperclass;

	@Test(description="US_005 View Information",groups={"US_001","regression","sanity","patientmodule"})
	public void validateviewInforamtion() throws InterruptedException, IOException {

		Helperclass helperclass=new Helperclass(driver);
		helperclass.launchApplicationURL("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
		
		helperclass.verifyvalidateLogin();
		util.captureScreenshot("verifyvalidateLogin");
		helperclass.moduleNavigation("Information");
		//NavigatetoAndClickInformationTab();
		util.captureScreenshot("NavigatetoAndClickInformationTab");
		validateText();
		util.captureScreenshot("validateText");
	}
	
	
	public static void validateText() throws InterruptedException 
	{
		SoftAssert sa=new SoftAssert();
		String actualText= driver.findElement(By.xpath("//div[@class='panel-title']")).getText();
		String expectedText="Manage My Patient (MMP) is a medical practice management solution that boosts productivity by automating the day-to-day tasks that can slow an office manager down. Central delivers much more than medical billing software. Sure, it has the tools to help generate cleaner claims and reduce denials, but our easy-to-use practice management software also streamlines your workflow to deliver seamless handoffs across departments.\r\n" + 
				"Manage My Patient (MMP) becomes your practice’s command center, delivering robust, real-time analytics through customizable reports and dashboards to ensure you know how your business is performing on the metrics that matter most.";

		sa.assertEquals(actualText, expectedText);
		

	}
	
   public void closeBrowser() {
	   
	   driver.close();
   }



}















