package findpatientrecordsearchtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import mrspage.MRSTestPage;

public class SearchPatientRecordTest {
	
	private static WebDriver driver=null;

	public static void main(String[] args) throws InterruptedException {
		
		loginTest();
		clickonFindPatientRecord();
		EnterTextinSearchBox();
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
		
		//driver.close();	
		
		System.out.println("All the test completed on this page");
		

	}
       public static void EnterTextinSearchBox() throws InterruptedException {
    	  // driver.findElement(By.xpath("//*[@id=\"patient-search-results-table\"]/tbody")).click();
    	   driver.findElement(By.id("patient-search")).sendKeys("james Adams");
    	  // Actions action1=new Actions(driver);
    	  // action1.moveToElement((WebElement) By.className("DataTables_sort_wrapper"));
    	   
    	   //Select a sub Menu
    	   
       }
       public void SelectPatient() throws InterruptedException {
    	   
    	   Actions action1=new Actions(driver);
    	  // action1.moveToElement((WebElement) By.className("DataTables_sort_wrapper"));
    	  // action1.moveToElement((WebElement) By.xpath("//*[@id=patient-search-results-table\"]/tbody/tr[1]/td[2]"));
    	  // action1.moveToElement(By.xpath("By.xpath("//*[@id=patient-search-results-table"]/tbody/tr[1]/td[2]"));
    	 //*[@id="patient-search-results-table"]/tbody/tr[1]/td[2]
    			      
    	     WebElement e=driver.findElement(By.className("DataTables_sort_wrapper"));
    	     action1.moveToElement(driver.findElement(By.xpath("//*[@id=patient-search-results-table\\\"]/tbody/tr[1]/td[2]")));
 		   // Select sel=new Select(e);
 		     //sel.selectByVisibleText("James Adam");
 		     
 		     //List<WebElement> SelectPatient=e.findElements(By.xpath("*[@id=\"patient-search-results-table\"]/tbody/tr[1]/td[2]"));
    	   Thread.sleep(5000);
    	   //Actions action=new Actions(driver);
 		   // public static void SelectPatient() {
 		     Thread.sleep(5000);
 		   //Placing a mouse on main menu
 			//Actions action=new Actions(driver);
 			//MouseHover
 			//action.moveToElement(driver.findElement(By.xpath("//form[@id='patient-search-form']")));
 			//WebElement e=(WebElement) action.moveToElement(driver.findElement(By.xpath("//*[@id=\"patient-search-results-table\"]/tbody/tr/td[2]")));
 			//WebElement e=(WebElement) action.moveToElement(driver.findElement(By.id("//*[@id='patient-search-results-table']/tbody/tr[1]/td[1]/span")));
 			//e.click();
 			//*[@id="patient-search-results-table"]/tbody/tr/td[2]
 			//action1.click();
 			//action1.perform();
 		   
 			//*[@id="patient-search-results-table"]/tbody/tr[1]/td[1]/span
       
       }
}

       
		
		
		
		

