package org.iit.mmp.patientmodule.pages;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.iit.mmp.helper.Helperclass;
import org.iit.mmp.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ScheduleAppointmentPage {

	WebDriver driver;
	Utility util;
	
	//By selectdr=By.xpath("//ul/li/h4[contains(text(),'\"+Providers+\"')]/ancestor::td//button[@id='opener']");
	By selectdr=By.xpath("//h4[contains(text(),'\"+doctorName+\"')]/ancestor::td//button[@id='opener']");
	By createnewAppointmentbutton =By.xpath("//input[@value='Create new appointment']");
	By datePicker=By.id("datepicker");
	By Selecttime =By.id("time");
	By clickContinuebutton=By.id("ChangeHeatName");
	By symptoms=By.id("sym");
    By submitbutton=By.xpath("//input[@type='submit']");
   // By validateappointmentdate=By.xpath("//table[@class='table']/tbody/tr[1]/td[1]");
    //By validateappointmentschedule=By.xpath("//a[contains(text(),'Provider:Charlie')]");
     
   
	public ScheduleAppointmentPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnCreatenewAppointmentButton() throws InterruptedException 
	{
		
		WebElement e=driver.findElement(createnewAppointmentbutton);
		Thread.sleep(3000);
		e.click();
		
	}
	
	
	public HashMap<String,String> selectDoctor(String doctorName) throws InterruptedException
	{
			
	HashMap<String,String> hMap=new HashMap<String,String>();
	//System.out.println(//h4[contains(text(),'"+doctorName+"')]/ancestor::td//button[@id='opener']);
	Thread.sleep(3000);		
	driver.findElement(By.xpath("//h4[contains(text(),'"+doctorName+"')]/ancestor::td//button[@id='opener']")).click();
	Thread.sleep(3000);
	//driver.switchTo().frame("myframe");
	Utility util=new Utility(driver);
	
	Helperclass helperclass=new Helperclass(driver);
	driver=helperclass.switchToAFrameAvailable("myframe",20);
	
	String dateOfAppointment=util.getCalFutureDate(20);
	////ul/li/h4[contains(text(),'"+ProviderName+"')]/ancestor::td//button[@id='opener']
	
	WebElement e=driver.findElement(datePicker);
	e.sendKeys(dateOfAppointment);
	//driver.findElement(datePicker).sendKeys(util.getCalFutureDate(20));
	String time= "10Am";
	new Select(driver.findElement(Selecttime)).selectByVisibleText(time);
	Thread.sleep(3000);
	
	driver.findElement(clickContinuebutton).click();
	String symptoms="Booking an Appointment "+doctorName +"ondate:"+util.getCalFutureDate(20)+"for symptom fever";
	System.out.println("symptoms");
	Thread.sleep(3000);
	driver.findElement(By.id("sym")).clear();
	driver.findElement(By.id("sym")).sendKeys(symptoms);
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
	
	 
	public boolean validateAppointmentDetailsinHomePage(HashMap<String,String>hMap) throws InterruptedException
	{
	boolean result=false;
	//Utility util=new Utility(driver);
	Helperclass helperclass=new Helperclass(driver);
	Thread.sleep(3000);
	helperclass.moduleNavigation("HOME");
	System.out.println("Inside validateAppointmentDetailsinHomePage hashmap Values " + Collections.singletonList(hMap));
	
	System.out.println(hMap.get("dateOfAppointment"));
	
	System.out.println(driver.findElement(By.xpath("//table[@class='table']//tr[1]/td[1]")).getText());
	
	if((hMap.get("dateOfAppointment").equals(driver.findElement(By.xpath("//table[@class='table']//tr[1]/td[1]")).getText()))
			&&
			(hMap.get("time").equals(driver.findElement(By.xpath("//table[@class='table']//tr[1]/td[2]")).getText()))
			&&
			(hMap.get("symptoms").equals(driver.findElement(By.xpath("//table[@class='table']//tr[1]/td[3]")).getText()))
			&&
			(hMap.get("ProviderName").contains(driver.findElement(By.xpath("//table[@class='table']//tr[1]/td[4]")).getText()))) 
		{     
		result=true;
		
		        }
		return result;
	
	}


	public boolean validateAppointmentDetailsinSchedulePage(HashMap<String,String>hMap) throws InterruptedException
	{
	boolean result=false;
	//Utility util=new Utility(driver);
	Helperclass helperclass=new Helperclass(driver);
	Thread.sleep(3000);
	helperclass.moduleNavigation("Schedule Appointment");
//	WebElement e=driver.findElement(By.xpath("(//h3[@class='panel-title'])[2]"));
//	System.out.println(e.getText().trim());
	WebElement e1=driver.findElement(By.xpath("//a[contains(text(),'Time :')]"));
	WebElement e2=driver.findElement(By.xpath("//a[contains(text(),'Provider:')]"));
	WebElement e3=driver.findElement(By.xpath("//a[contains(text(),'Symptoms:')]"));
	String appTime[]=e1.getText().split(":");
	String ProviderName[]=e2.getText().split(":");
	//String Symptoms[]=e3.getText().split(":");
	String symptoms[] = e3.getText().split(":",2);
	
	System.out.println("Printing hashmap Values " + Collections.singletonList(hMap));
	
	if(hMap.get("dateOfAppointment").equals(driver.findElement(By.xpath("(//h3[@class='panel-title'])[2]")).getText().trim()) 
			&& hMap.get("time").equals(appTime[1].trim())
		    && hMap.get("symptoms").equals(symptoms[1].trim())
            && hMap.get("doctorName").equals(ProviderName[1].trim()))
            
    {
      
	       result=true;     
		        
    }
		       
		return result;
	
	
}
	
	
	
    }

	
	


