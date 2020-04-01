package findpatientrecordPage;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import mrspage.MRSTestPage;
public class PatientRecordPage  {
public static void main(String[] args) {
}

	static WebDriver driver=null;
//	By username_login=By.id("username");
//	By Password_login=By.id("password");
//	By Click_Isolationward=By.id("Isolation Ward");
//	By Click_LogIn=By.id("loginButton");
	
	static By FindPatient_record=By.cssSelector(".button app big");

	public PatientRecordPage(WebDriver driver) {
		this.driver=driver;
	}
	public static void loginTest() {
		loginTest();
		clickonFindPatientRecord();
	}
	public static void clickonFindPatientRecord() {
		
		driver.findElement(FindPatient_record).click();
		
		
		
	}

}

