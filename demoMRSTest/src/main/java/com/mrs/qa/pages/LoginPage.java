package com.mrs.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.mrs.qa.base.TestBase;
import com.mrs.qa.testcases.OpenmrsHomePageTest;

//LoginPage is the child of test basis we will use extends keyword.
public class LoginPage extends TestBase {
	//WebDriver driver;

//Here we have to define the page factory or object repository of Login Page.
//@FindBy annnotation will do driver.findElement directly.	
	//Page Factory or OR
	//@FindBy(xpath id name ) is used to locate the element in page factory also equal to driver.findElement.
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
@FindBy(id="Inpatient Ward")

//String name="Inpatient Ward";

	//@FindBy(linkText="Inpatient Ward")
	WebElement InpatientWard;
	
	//@FindBy(how.How.linkText,using li)

	//@FindBy(xpath="//span[@class='location-error']")
	//WebElement Locationforthissession;
	
	//WebElement e=((WebElement) driver.findElements(By.xpath("//[@id='Inpatient Ward']"));
	
	//String Locationforthissessionxpath="//li[text()='%Name%']";
	//String objProp=Locationforthissessionxpath.replace("%Name%", "Inpatient Ward");
	
	
	//@FindBy(xpath="//li[@id='Inpatient Ward']")
	//WebElement InpatientWard;


	
	@FindBy(xpath="//input[@id='loginButton']")
	WebElement Loginbtn;
	
	//How to initialize elements with the help of page factory.I will create the constructor of this class once again.
	
	//initializing the page objects.
	public LoginPage() {
		
	//Inside this i will define one method.
	//interview question how do you intialize  PageFactory see below PageFactory.initElementes(driver,this)
		PageFactory.initElements(driver, this);//instead of this you can write login Page.
	}
	//Actions
	
	public String validateLoginPageTitle(){	
	
		return driver.getTitle();
	}
	public OpenmrsHomePage login(String un,String pwd)
	{
	 username.sendKeys(un);
	 password.sendKeys(pwd);
	 InpatientWard.click();
	 Loginbtn.click();
	 
	 return new OpenmrsHomePage();
	 
	}

	
	}
	
	
	
	

