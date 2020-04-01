import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathAxesLocator {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("WebDriver.geckodriver", "geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.deal4loans.com/home-loans.php");
		//Here i put thread.sleep(5000);
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.xpath("//a[text()='HDFC Ltd']"));
		
		WebElement e1=driver.findElement(By.xpath("//span[contains(@class,'th-new2-text')]"));
		WebElement e2=driver.findElement(By.xpath("//a[text()='HDFC Ltd']/parent::span/parent::td/following-sibling::td[2]"));
		WebElement e3=driver.findElement(By.xpath("//a[text()='HDFC Ltd']/parent::span/parent::td/following-sibling::td[3]"));
		WebElement e4=driver.findElement(By.xpath("//a[text()='HDFC Ltd']/parent::span/parent::td/following-sibling::td[4]"));
		WebElement e5=driver.findElement(By.xpath("//a[text()='HDFC Ltd']/parent::span/parent::td/following-sibling::td[5]/a"));
		e5.click();
		//Below WebDriver method is used to navigate back to home page.
		driver.navigate().back();
		WebElement e6=driver.findElementByXPath("//a[text()='Axis Bank Home Loan']/parent::span");
		WebElement e7=driver.findElement(By.xpath("//a[text()='Axis Bank Home Loan']/parent::span/parent::td/following-sibling::td[2]"));
		WebElement e8=driver.findElement(By.xpath("//a[text()='Axis Bank Home Loan']/parent::span/parent::td/following-sibling::td[5]"));
		e8.click();
		
	}

}
