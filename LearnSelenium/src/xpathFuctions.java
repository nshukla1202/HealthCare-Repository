import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathFuctions {
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.geckodriver","geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
			WebElement e=driver.findElement(By.xpath("//h2[text()='Sign Up']"));
		
		String actual=e.getText();
		System.out.println("Actual value:::"+ actual);
		String expected="Sign Up";
		
		if(actual.equals(expected))//This is varification point wheather tc is pass or fail.
		{
			System.out.println("TC Pass");
		}
		else
		
		{
			System.out.println("TC Fails");
			
     //Output of this Program in console		
     //Actual value:::+ actual TC Fails.Actaul not equal to expected.Why it is fail.In this line no 15 i write like below
	// syso(Actual value:::+actual") thats why its failing not it will pass after correction.
			
		}
				
	}

}
