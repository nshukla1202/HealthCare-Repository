package org.iit.adminmodule.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.iit.adminmodule.pages.AdminHomePage;
import org.iit.adminmodule.pages.AdminLoginPage;
import org.iit.adminmodule.pages.AdminPortalPage;
import org.iit.mmp.base.TestBase;
import org.iit.mmp.helper.Helperclass;
import org.iit.mmp.utility.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdminTest extends TestBase {

	//private static final String service = null;
	//private static final String appointment = null;


	Utility util;
	Helperclass helperclass;
	private By NavigateToPatientsTab;

	@Test(description="US_006 Pay Fees",groups={"US_001","regression","sanity","Adminmodulemodule"})
	public void validate() throws InterruptedException, IOException
	{
		Utility util=new Utility(driver);
		Helperclass helperclass=new Helperclass(driver);
		helperclass.launchApplicationURL("http://96.84.175.78/MMP-Release2-Admin-Build.2.1.000/login.php");
		util.captureScreenshot("US_001_LaunchApplication");
		//helperclass.verifyvalidateLogin();
		
		//Utility util=new Utility(driver);
		util.LoginUser("Thomas_444", "Edison_444");
		util.captureScreenshot("US_002_verifyValidLogin");
		helperclass.moduleNavigation("Patients");
		NavigatetoAndClickPatients();
		searchforPatient();
		//util.moduleNavigation("Claim Center");
		clickOnCreateVisit();
		util.captureScreenshot("US003_clickOnCreateVisit");
		HashMap<String,String> hMap=selectDoctor("Dr.Charlie");
		util.captureScreenshot("US004_selectDoctor");
		Thread.sleep(3000);
		//SoftAssert sa=new SoftAssert();
		//sa.assertTrue(validateAppointmentDetailsinHomePage(hMap),"");
		//404 Error.I need to write the below method.
		//Thread.sleep(3000);
		helperclass.moduleNavigation("Patients");
		searchforPatient();
		clickonCreateFeebutton();
		Thread.sleep(3000);
		HashMap<String,String> hMap1=FeeDetails();
		util.captureScreenshot("FeeDetails");
	   SoftAssert sa=new SoftAssert();
		String actual = readSuccessMessage();
		String expected ="Fee Successfully Entered.";
		util.captureScreenshot("Fee Successfully Entered");
		Assert.assertEquals(actual, expected);
	}

	public String readSuccessMessage()
	{
		Alert alrt  = driver.switchTo().alert();
		String msg = alrt.getText();
		System.out.println(msg);

		alrt.accept();
		System.out.println(alrt.getText());

		return msg;



	}


	public void NavigatetoAndClickPatients() throws InterruptedException
	{
		//Utility util = new Utility(driver);
		Helperclass helperclass=new Helperclass(driver);
		helperclass.moduleNavigation("Patients");
		AdminPortalPage patientpage=new AdminPortalPage(driver);
		patientpage.NavigatetoAndClickPatients();

	}

	public void searchforPatient() throws InterruptedException {

		AdminPortalPage patientpage=new AdminPortalPage(driver);
		//patientpage.searchforPatient("TestQ");
		patientpage.searchforPatient("UserTest");
		


	}

	public void clickOnCreateVisit() throws InterruptedException {


		AdminHomePage adminhomepage=new AdminHomePage(driver);
		adminhomepage.clickOnCreateVisit();
	}

	public HashMap<String, String> selectDoctor(String doctorName)throws InterruptedException
	{
		AdminHomePage adminhomepage=new AdminHomePage(driver);
		return adminhomepage.selectDoctor("Dr.Charlie");




	}

	public void clickonCreateFeebutton() throws InterruptedException
	{

		AdminHomePage adminhomepage=new AdminHomePage(driver);
		adminhomepage.clickonCreateFeebutton("Create Fee");

	}

	public HashMap<String,String>FeeDetails() throws InterruptedException
	{
		AdminHomePage adminhomepage=new AdminHomePage(driver);
		return adminhomepage.FeeDetails();


	}




}





