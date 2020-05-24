package org.iit.mmp.patientmodule.tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.iit.mmp.base.TestBase;
import org.iit.mmp.helper.Helperclass;
import org.iit.mmp.patientmodule.pages.LoginPage;
import org.iit.mmp.patientmodule.pages.ScheduleAppointmentPage;
import org.iit.mmp.patientmodule.tests.Test;
import org.iit.mmp.utility.Utility;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;


public class ScheduleAppointmentTest extends TestBase {

	Utility util;
	Helperclass helperclass;


	@org.testng.annotations.Test(description="US_005 Schedule Appointment",groups={"US_005","regression","sanity","patientmodule"})
	public void validateAppointmentDetails() throws InterruptedException, IOException
	{

        Utility util=new Utility(driver);
		Helperclass helperclass=new Helperclass(driver);
		helperclass.launchApplicationURL("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
		helperclass.verifyvalidateLogin();
		helperclass.moduleNavigation("Schedule Appointment");
		clickOnCreatenewAppointmentButton();
		util.captureScreenshot("clickOnCreatenewAppointmentButton");
		HashMap<String,String> hMap=selectDoctor("Dr.Charlie");
		Thread.sleep(3000);
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(validateAppointmentDetailsinHomePage(hMap),"");
		util.captureScreenshot("validateAppointmentDetailsinHomePage");
		sa.assertTrue(validateAppointmentDetailsinSchedulePage(hMap), "");
		util.captureScreenshot("validateAppointmentDetailsinSchedulePage");
		sa.assertAll();
		
		

	}


	public void clickOnCreatenewAppointmentButton() throws InterruptedException
	{
		Thread.sleep(3000);

		ScheduleAppointmentPage scheduleapp=new ScheduleAppointmentPage(driver);
		scheduleapp.clickOnCreatenewAppointmentButton();

	}


	public HashMap<String, String> selectDoctor(String doctorName)throws InterruptedException
	{

		ScheduleAppointmentPage scheduleapp=new ScheduleAppointmentPage(driver);
		return scheduleapp.selectDoctor("Dr.Charlie");


	}

	public void switchtoFrameAvailable(String frameId, int timeinSecs)
	{
		helperclass.switchToAFrameAvailable("myframe",20);

	}


	public boolean validateAppointmentDetailsinHomePage(HashMap<String,String>hMap) throws InterruptedException
	{
		Thread.sleep(3000);

		ScheduleAppointmentPage scheduleapp=new ScheduleAppointmentPage(driver);

		return scheduleapp.validateAppointmentDetailsinHomePage(hMap);
	}

	public boolean validateAppointmentDetailsinSchedulePage(HashMap<String,String>hMap) throws InterruptedException
	{
		ScheduleAppointmentPage scheduleapp=new ScheduleAppointmentPage(driver);
		return scheduleapp.validateAppointmentDetailsinSchedulePage(hMap);


	}






}
