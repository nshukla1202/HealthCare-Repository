package GridTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridEx {
	
	@Test
	public void executeTest() throws MalformedURLException {
		
		
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setBrowserName("chrome");
		 caps.setVersion("40");
		 caps.setPlatform(Platform.WINDOWS);
		 RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),caps);

		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
		driver.close();
		
		
		
		
		
	}

}
