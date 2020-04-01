import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LaunchBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.geckodriver","geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.indeed.com");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.id("text-input-what"));
		e.sendKeys("Selenium job");
		//driver.findElement(By.id("text-input-where")).clear();
		//e1.sendKeys(Keys.CLEAR);
		//e1.clear();
		//e1.sendKeys("Banglore");
		/*Thread.sleep(5000);
		Actions action=new Actions(driver);
		action.sendKeys(e,Keys.CLEAR);
		action.perform();*/
		//This wedriver method is useful to remove the default text in text box.
	 WebElement toClear = driver.findElement(By.id("text-input-where"));
		toClear.sendKeys(Keys.CONTROL + "a");
		toClear.sendKeys(Keys.DELETE);
		toClear.sendKeys(Keys.CONTROL + "a");
		toClear.sendKeys(Keys.DELETE);
		toClear.sendKeys("Boston MA");
		//<div><span>Boston, MA<strong></strong></span></div>
		
	driver.findElement(By.xpath("//span[@class='icl-Autocomplete-text']")).click();

}
}
