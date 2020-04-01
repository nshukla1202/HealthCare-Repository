package GridTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTest1 {
	
    WebDriver driver;
    DesiredCapabilities cap;
    @Test
    public void runtest() throws MalformedURLException {         System.setProperty("webdriver.chrome.driver","C:\\Neha\\Selenium\\SeleniumJavaProject\\GridSetupTest\\chromedriver.exe");
         cap = DesiredCapabilities.chrome();
         cap.setBrowserName("chrome");
         cap.setPlatform(Platform.WINDOWS);
         cap.setVersion("123");
        URL url = new URL(" http://192.168.154.1:4444/wd/hub");
        //URL url = new URL("http://192.168.0.107:5556");
        ChromeOptions options = new ChromeOptions();
        driver = new RemoteWebDriver(url, options);
        //driver=new ChromeDriver();
        driver.get("http://google.com/");
        System.out.println("Title is " + driver.getTitle());
        driver.close();
        
        //{ browserName: firefox, platform: WINDOWS, version: 123}
  //  Build info: version: '3.141.59', revision: 'e82be7d358', time: '2018-11-14T08:17:03'
    }
}


