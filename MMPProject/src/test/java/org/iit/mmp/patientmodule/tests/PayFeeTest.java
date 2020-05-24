package org.iit.mmp.patientmodule.tests;

import java.io.IOException;

import org.iit.mmp.base.TestBase;
import org.iit.mmp.helper.Helperclass;
import org.iit.mmp.patientmodule.pages.LoginPage;
import org.iit.mmp.patientmodule.pages.PayFeesPage;
import org.iit.mmp.utility.Utility;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PayFeeTest extends TestBase {
	
	
	Utility util;
	Helperclass helperclass;
	
	
	@Test(description="US_006 Pay Fees",groups={"US_001","regression","sanity","Adminmodulemodule"})
	public void validatePayFee() throws InterruptedException, IOException
	{
      Utility util=new Utility(driver);
		Helperclass helperclass=new Helperclass(driver);
		
		helperclass.launchApplicationURL("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
	    helperclass.verifyvalidateLogin();
	    util.captureScreenshot("US_006");
		helperclass.moduleNavigation("Fee");
		Thread.sleep(3000);
		PayFee(); 
		
	}
	
	public void  PayFee() 
	{
	PayFeesPage payfee=new PayFeesPage(driver);
	payfee.PayNow();
	
	}
	
}
