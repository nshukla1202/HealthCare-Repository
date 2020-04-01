import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElements {
	
	public static void main(String[] args) throws InterruptedException {
		
		//It was throwing selenium timeot exception so i am trying with chrome driver below..
		//System.setProperty("WebDriver.geckodriver", "geckodriver.exe");
		//Thread.sleep(5000);
		//FirefoxDriver driver=new FirefoxDriver();
		
		System.setProperty("Webdriver.chrome.driver","C:\\Neha\\Selenium\\SeleniumJavaProject\\LearnSelenium\\chromedriver.exe");
		
	 	ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers");
		
		//supose you want to see all the rows and all the coloumn in the table.do you remeber x path axes locator we will use the same concept.
		
		List<WebElement> stockList=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		System.out.println("The Number of stocks::"+ stockList.size());
		
		for(int i=0;i<stockList.size();i++)
		{
			String stockName=stockList.get(i).getText();
			
			if(stockName.equals("TIL Ltd"))
			{
				System.out.println("Row number is "+ (i+1));
				break;
			}
		}
		
		
	}

}
