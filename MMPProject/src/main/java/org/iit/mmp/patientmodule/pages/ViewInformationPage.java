package org.iit.mmp.patientmodule.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ViewInformationPage {

	WebDriver driver;


	By  Navigate_InformationTab= By.xpath("//a[@href='information.php']");
	By ValidateText=By.xpath("//div[@class='panel-title']");



	public ViewInformationPage(WebDriver driver) 
	{

		this.driver=driver;
	}


	@Test
	public void NavigatetoAndClickInformationTab() throws InterruptedException
	{


		driver.findElement(Navigate_InformationTab).click();


	}


	@Test
	public void validateText() throws InterruptedException 
	{

		String actualText=driver.findElement(ValidateText).getText();



	}






}
