package com.mrs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.mrs.qa.base.TestBase;

public class OpenmrsHomePage<FindPatientRecord> extends TestBase{
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
@FindBy(id="Inpatient Ward")

//String name="Inpatient Ward";

	//@FindBy(linkText="Inpatient Ward")
	WebElement InpatientWard;
@FindBy(xpath="//input[@id='loginButton']")
WebElement Loginbtn;

	
	@FindBy(xpath="//a[contains(text(),'Find Patient Record']")
	WebElement FindPatientRecordbtn;
	
//Initializing the Page object.Now i will create the constructor of openmrsHomePage so that i can initialize the page objects.
	
	public OpenmrsHomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
//Whenever go the next page you should always verify the title of the page.
	public String verifyOpenmrsHomePageTitle() {
		
		return driver.getTitle();//this return will return the string i will change from void to string.
		
	}
	
	public OpenmrsHomePage login(String un,String pwd)
	{
	 username.sendKeys(un);
	 password.sendKeys(pwd);
	 InpatientWard.click();
	 Loginbtn.click();
	 
	 
	 return new OpenmrsHomePage();
	 
	}
	
	public void ClickOnFindPatientRecordbtn() {
		
		FindPatientRecordbtn.click();
		
		
	}
	
	
	
	//public  OpenmrsHomePage clickOnFindPatientRecord() {
		
		//FindPatientRecordbtn.click();
		
		//return  OpenMRSElectronicMedicalRecord();
		
	//}

	private OpenmrsHomePage OpenMRSElectronicMedicalRecord() {
		///// TODO Auto-generated method stub
		return OpenMRSElectronicMedicalRecord();
	}

	
	}
	


