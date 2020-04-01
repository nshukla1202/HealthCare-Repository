package mrspage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MRSTestPage {
	
	private static WebDriver driver=null;
	
	By username_login=By.id("username");
	By Password_login=By.id("password");
	By Click_Isolationward=By.id("Isolation Ward");
	By Click_LogIn=By.id("loginButton");
	
   // By FindPatient_record=By.cssSelector(".button app big");
    
	
	
	
	public MRSTestPage(WebDriver driver) {
		
		this.driver=driver;
	}
	public static void loginTest() {
		loginTest();
	}
	
	public void EnterTextinusername(String text) {
		
		driver.findElement(username_login).sendKeys(text);
	}
	
	public void EnterTextpassword(String text) {
		
		driver.findElement(Password_login).sendKeys(text);
	}
	

	public void clickonIsolationward() {
		
		driver.findElement(Click_Isolationward).click();
		
	}
	
	public void ClickonLogIn() {
		driver.findElement(Click_LogIn).submit();
		
	}
	
	
	
//	public void EnterTextInTextBox() {
//		
//		WebElement SelectPatient=driver.findElement(EnterTextInTextBox);
//		
//		Select sel=new Select(SelectPatient);
//		sel.selectByVisibleText("James Adams");
		
	}

	
   

	
	
	


