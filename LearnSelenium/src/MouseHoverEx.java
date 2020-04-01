import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverEx {
	
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","C:\\Neha\\Selenium\\SeleniumJavaProject\\LearnSelenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("file://C:/Neha/HTML-PAGE%20FOR%20PRACTICE/ActionsEx.html");
	//Here 3 mouse hover action we are going to perform.
	//Placing a mouse on main menu
	//Placing a mouse on sub menu
	//Click on sub menu
	
	//When you write x path in mouseHover Text fuction will not work in it.
	
	//(//div[@class='menuHead'])[1] this xpath gives 1 mathcing node only also below x path
	////div[@id='menu1'] also gives only 1 matching node.
	
	//Mouse Action Example
	//Placing a mouse on main menu
	Actions action=new Actions(driver);
	//MouseHover
	//action.moveToElement(driver.findElement(By.xpath("(//div[@class='menuHead'])[1]")));
	action.moveToElement(driver.findElement(By.xpath("//div[@id='menu1']")));
	
	//placing mouseHover on sub menu
	action.moveToElement(driver.findElement(By.xpath("//div[@id='menu1choices']")));
	
	//clcik on sub menu
	action.moveToElement(driver.findElement(By.xpath("//div[@id='menu1choices']/a[1]")));
	
	action.click();
	//If we will not write action.perform() this actions will not work.
	action.perform();
	String url=driver.getCurrentUrl();
	
	System.out.println(url);
	
	
	
	

}
}
