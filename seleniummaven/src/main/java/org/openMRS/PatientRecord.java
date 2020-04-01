package org.openMRS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PatientRecord {
	
	WebDriver driver;
	
public PatientRecord(WebDriver driver)
{
	this.driver=driver;
	
}
public boolean SearchPatientRecord() throws InterruptedException
{
//public void FindPatientRecord() throws InterruptedException

	driver.findElement(By.xpath("//a[@class='button app big']")).click();
	driver.findElement(By.xpath("//input[@id='patient-search']")).sendKeys("james King");
	Thread.sleep(5000);
	List<WebElement>list=driver.findElements(By.xpath("DataTables_sort_icon"));
	driver.findElement(By.xpath("//tbody/tr/td[2]")).click();
	boolean result=driver.getTitle().contains("Home");
	return result;
	
}
	

}

