package findpatientrecordtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

///import findpatientrecordPage.PatientRecordPage;
import mrspage.MRSTestPage;


public class PatientRecordTest  {
	
	
	private static WebDriver driver=null;

	public static void main(String[] args) throws InterruptedException {
		
		loginTest();
		clickonFindPatientRecord();
		
	}
	public static void loginTest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Learn Selenium\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		 
		MRSTestPage mrstestPage=new MRSTestPage(driver);//we have this constructor from page.
		
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		
		mrstestPage.EnterTextinusername("Admin");
		mrstestPage.EnterTextpassword("Admin123");
		mrstestPage.clickonIsolationward();
		
		mrstestPage.ClickonLogIn();	
		
	}
	public static void clickonFindPatientRecord() {
		
		Actions action=new Actions(driver);
		System.out.println("Inside find patient record function");
		driver.navigate().refresh();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		action.moveToElement(driver.findElement(By.xpath("//div[@id='apps']/child::a[@class='button app big']/i[@class='icon-search']")));
		action.click();
		action.perform();
		driver.close();	
		
		System.out.println("All the test completed on this page");
		
	}

	
	
	
	
}
