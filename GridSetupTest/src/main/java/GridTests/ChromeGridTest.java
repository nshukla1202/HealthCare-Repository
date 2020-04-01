package GridTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

       public class ChromeGridTest {

	   public static void main(String[] args) throws MalformedURLException {
		
		
		//1.define Desired Capabilities.
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		//cap.setCapability(ChromeOptions.CAPABILITY,options);
		//RemoteWebDriver driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub/"), cap);
		
		//2.Chrome options Defintion
		
		ChromeOptions options=new ChromeOptions();
		
		options.merge(cap);
		String hubUrl= "http://192.168.154.1:4444/wd/hub";
		////http://192.168.154.1:4444/grid/register/
		
		//3.Instead of writing webdriver driver=new webdriver we will write below--
		
		WebDriver driver=new RemoteWebDriver(new URL(hubUrl),options);
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
				
		//System.out.println(driver.getTitle());
		
		
		//In console:Exception in thread "main" org.openqa.selenium.SessionNotCreatedException: session not created:
		//This version of ChromeDriver only supports Chrome version 79
		
		
		
		
		
	}
	
	
}
