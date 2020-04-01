import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Deals4LoanAxesXpathEx {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.driver", "geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.deal4loans.com/home-loans.php");
		//go to row go to coloumn and click on Apply button,when rows are interchanged somehow we have to specific about the xpath which we want to take this why we use Axes x-path Locators.
   //1.Test Case-You have to click on Apply buttton which is next to LIC Housing Finance.
		WebElement e1=driver.findElement(By.xpath("//a[text()='LIC Housing Finance']/parent::span/parent::td/following-sibling::td[5]/child::a"));
		e1.click();
		System.out.println("Test case pass");
		
		driver.navigate().back();
		Thread.sleep(5000);
    //2.Test Case-You have to click on Apply buttton which is next to ICICI Bank Home Loan.
		WebElement e2=driver.findElement(By.xpath("//a[text()='ICICI Bank Home Loan']/parent::span/parent::td/following-sibling::td/child::a"));
		e2.click();
	
	driver.navigate().back();//This method is for go back to prevois page and click on the next webelement.
 //3.Test Case :You have to click on apply button which is next to DHL Home Loan
   WebElement e3=driver.findElement(By.xpath("//a[text()='DHFL Home Loan']/parent::td/following-sibling::td[5]/child::a"));
   e3.click();
}
}