package org.iit.adminmodule.pages;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.iit.mmp.helper.Helperclass;
import org.iit.mmp.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdminHomePage {

	WebDriver driver;

    By createVisit=By.xpath("//div[@id='container_body']/p[1]");
    By datePicker=By.id("datepicker");
    By Selecttime =By.id("time");
	By clickContinuebutton=By.id("ChangeHeatName");
	//By symptoms=By.id("sym");
	By symptoms=By.name("sym");
	By submitbutton=By.xpath("//input[@type='submit']");
	By createFee=By.xpath("//div[@id='container_body']/p[3]");
	By Selectiondropdown=By.xpath("//select[@id='app_date']");
	By selectservice=By.xpath("//select[@id='service']");
	By submitFee=By.xpath("//input[@type='submit']");



	public AdminHomePage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void clickOnCreateVisit() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(createVisit).click();
		
	}
	
	public HashMap<String,String> selectDoctor(String doctorName) throws InterruptedException
	{
		HashMap<String,String> hMap=new HashMap<String,String>();
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//h4[contains(text(),'"+doctorName+"')]/ancestor::td//button[@id='opener']")).click();
		Thread.sleep(3000);
		Utility util=new Utility(driver);
		Helperclass helperclass=new Helperclass(driver);
		driver=helperclass.switchToAFrameAvailable("myframe",20);
		String dateOfAppointment=util.getCalFutureDate(20);
		WebElement e=driver.findElement(datePicker);
		e.sendKeys(dateOfAppointment);
		String time= "10Am";
		new Select(driver.findElement(Selecttime)).selectByVisibleText(time);
		Thread.sleep(3000);
		
		driver.findElement(clickContinuebutton).click();
		String symptoms="Booking an Appointment "+doctorName +"ondate:"+util.getCalFutureDate(20)+"for symptom fever";
		System.out.println("symptoms");
		Thread.sleep(3000);
		driver.findElement(By.name("sym")).clear();
		driver.findElement(By.name("sym")).sendKeys(symptoms);
		//driver.findElement(By.id(symptoms)).click();
	
		 driver.findElement(submitbutton).sendKeys(symptoms);
		 
		 hMap.put("dateOfAppointment", dateOfAppointment);
		 hMap.put("time", time);
		 hMap.put("symptoms", symptoms);
		 hMap.put("ProviderName", doctorName);
		 
		 //System.out.println(Arrays.asList(hMap)); 
		 System.out.println("Printing hashmap Values " + Collections.singletonList(hMap));
		return hMap;
		
		
	}
	
//	public boolean validateAppointmentDetailsinHomePage(HashMap<String,String>hMap) throws InterruptedException
//	{
//	boolean result=false;
//	Utility util=new Utility(driver);
//	Thread.sleep(3000);
//	util.moduleNavigation("HOME");
//	System.out.println("Inside validateAppointmentDetailsinHomePage hashmap Values " + Collections.singletonList(hMap));
//	
//	System.out.println(hMap.get("dateOfAppointment"));
//	
//	System.out.println(driver.findElement(By.xpath("//table[@class='table']//tr[1]/td[1]")).getText());
//	
//	if((hMap.get("dateOfAppointment").equals(driver.findElement(By.xpath("//table[@class='table']//tr[1]/td[1]")).getText()))
//			&&
//			(hMap.get("time").equals(driver.findElement(By.xpath("//table[@class='table']//tr[1]/td[2]")).getText()))
//			&&
//			(hMap.get("symptoms").equals(driver.findElement(By.xpath("//table[@class='table']//tr[1]/td[3]")).getText()))
//			&&
//			(hMap.get("ProviderName").contains(driver.findElement(By.xpath("//table[@class='table']//tr[1]/td[4]")).getText()))) 
//		{     
//		result=true;
//		
//		        }
//		return result;
//	
//	}
	
	


	
	public void clickonCreateFeebutton(String Clickontab) throws InterruptedException
	{
		Thread.sleep(3000);
		List<WebElement> list=driver.findElements(createFee);

		for(WebElement e:list)
		{
			if(e.getText().equals(Clickontab))
				System.out.println(e.getText());
			{
				e.click();
			}
		}


	}

	public HashMap<String,String> FeeDetails()  throws InterruptedException
	{

		HashMap<String,String> hMap= new HashMap<String,String>();
		driver.findElement(Selectiondropdown).click();
		Thread.sleep(3000);
		Utility util=new Utility(driver);
		//String selectAppointments="";
		String selectAppointments=util.getCalFutureDate(20);
		//new Select(driver.findElement(Selectiondropdown)).getAllSelectedOptions();
		new Select(driver.findElement(Selectiondropdown)).selectByVisibleText(util.getCalFutureDate(20));
		
	
		//selectByVisibleText(Appointment);
		WebElement e=driver.findElement(Selectiondropdown);
		e.click();
		Select select=new Select(e);
		select.selectByVisibleText(selectAppointments);

		String service="vaccination";
		WebElement e1=driver.findElement(selectservice);
		e1.click();
		Select select1=new Select(e1);
		Thread.sleep(2000);
		select1.selectByVisibleText("vaccination");

		driver.findElement(submitFee).click();

		hMap.put("Selectiondropdown",selectAppointments);
		hMap.put("selectservice", service);

		return hMap;

	}





}
//








