import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandellingFrameRediffEx {
	
	public static void main(String[] args) {
		
     System.setProperty("WebDriver.chrome.driver", "C:\\Neha\\Selenium\\SeleniumJavaProject\\LearnSelenium\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://money.rediff.com/nse");
		
		driver.switchTo().frame("google_ads_iframe_");
		
		driver.findElement(By.cssSelector("iframe#google_ads_iframe_/21677187305/Money_Home_728x90_ATF_AllGeos_0")).click();
		
		driver.switchTo().defaultContent();
		
		
	}

	//public static void main(String[] args) {
		
		
		
		
	}


