import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxWebDriverLaunch {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.gecko.driver","geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.indeed.com");
		
		
	}
	
}
