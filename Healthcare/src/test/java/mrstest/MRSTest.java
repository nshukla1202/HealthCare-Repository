package mrstest;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import mrspage.MRSTestPage;

public class MRSTest {
	
	private static WebDriver driver=null;
	
	public static void main(String[] args) {
		loginTest();
	}
	
	public static void loginTest()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Learn Selenium\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		 
		MRSTestPage mrstestPage=new MRSTestPage(driver);//we have this constructor from page.
	
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		
		
		mrstestPage.EnterTextinusername("Admin");
		mrstestPage.EnterTextpassword("Admin123");
		mrstestPage.clickonIsolationward();
		
		mrstestPage.ClickonLogIn();
			
		
//		Actions action=new Actions(driver);
//		System.out.println("Inside find patient record function");
//		driver.navigate().refresh();
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		action.moveToElement(driver.findElement(By.xpath("//div[@id='apps']/child::a[@class='button app big']/i[@class='icon-search']")));
//		action.click();
//		action.perform();
		//driver.close();
		
//		WebElement SelectPatient=driver.findElement(By.id("patient-search"));
//		Select sel=new Select(SelectPatient);
//		sel.selectByIndex(0);
//		sel.selectByVisibleText("James Adams");
//		
//		List<WebElement> list=sel.getOptions();
		
		System.out.println("All the test completed on this page");
		
		////span[@class='recent-lozenge']
		
	}
	

		
	}
	
	


