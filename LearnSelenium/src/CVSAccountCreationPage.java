import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class CVSAccountCreationPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.geckodriver", "geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.cvs.com/");
		WebElement e9=driver.findElement(By.xpath("//a[text()='Create an Account']"));
		e9.click();
		
		//driver.get("https://www.cvs.com/account/creation?page=/account/signup.jsp&icid=cvsheader:createaccount&screenname=/");
	
		
		//WebDriverWait wait=new WebDriverWait(driver,30);
		
		////*[@id="fNameRow"]/fieldset/div/label[2]
		Thread.sleep(5000);
		//WebElement e=driver.findElement(By.xpath("//h2[text()='Create account']"));
		WebElement e=driver.findElement(By.xpath("//div[@id='fNameRow']"));
		String actual=e.getText();
		System.out.println("Actual value ::"+ actual);
		String expected="Create account";
		if(actual.equals(expected))
		{
			System.out.println("TC PASS");
		}
		else
		{
			System.out.println("TC FAILS");
		}
	

		Thread.sleep(5000);
		/*WebElement e2=driver.findElement(By.xpath("//input[@name='firstName']"));
		
		e2.sendKeys("Test1");
		
		WebElement e3=driver.findElement(By.xpath("//input[@name='lastName']"));
		e3.sendKeys("Auto");
		
		WebElement e4=driver.findElement(By.xpath("//input[@id='email']"));
		
		e4.sendKeys("Test1Auto@gmail.com");
		
		WebElement e5=driver.findElement(By.xpath("//input[@type='password']"));
		e5.sendKeys("Ns@7818163704");
		
		WebElement e6=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		
		e6.sendKeys("Ns@7818163704");
		//WebDriver method for selecting the options from dropdown boxes?
		WebElement e7=driver.findElement(By.xpath("//select[@id='securityQuestionInit']/child:: option[4]"));
		
		e7.click();*/
		
	}
}
