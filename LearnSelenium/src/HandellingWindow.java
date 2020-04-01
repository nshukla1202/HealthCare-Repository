import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandellingWindow {
	
	public static void main(String[] args) {
	
		System.setProperty("WebDriver.chrome.driver", "C:\\Neha\\Selenium\\SeleniumJavaProject\\LearnSelenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rediff.com");
		 driver.switchTo().frame("moneyiframe");
		driver.findElement(By.id("query")).sendKeys("TCS");
		 driver.findElement(By.className("getqbtn")).click();
		 //i go back to top window.
		 driver.switchTo().defaultContent();
		 //FOCUS WILL BE ON THE PARENT WINDOW.You have to write the ligic to change focus from top window to child window.
		//frame indexing starts from 0.itis from top to botttom.
		 
		 
		//In order to find out the window name selenium webdriver has provided 2 method.
		 
		//1.getwindowHandel();
		 //2.public set <string>getwindowHandel();
		 //why can't we use list?<string> here because the list accepts the duplicate value but set does not.set only store unique objects only.
		 //list and set both are datastructure.
		 
		 
		 String parent=driver.getWindowHandle();
		 System.out.println("Parent name::"+parent);
		 //driver.quit();
		 //Console i got this:Parent name::CDwindow-CFA36615A8B5DC1221A25AC4932A5593
		Set<String> wset=driver.getWindowHandles();
		
		System.out.println("Size of the set::"+wset.size());
		
		//Now we want the name of the second window.we cannot use get method we will you enhancer far loop.
		for(String s :wset) //for each string s stored in wset first get it
		{
			System.out.println("wset values"+s);
			//In console we got this :--Parent name::CDwindow-5A71BD296425AD327830DB2A4FA700DB
			//Size of the set::2
			//wset valuesCDwindow-5A71BD296425AD327830DB2A4FA700DB
			//wset valuesCDwindow-2CF7E536E180D92D23781A2FBC098E5D
			//In below line if s not equals to parent go inside window(s) and get the price of the stock.
			if(!(s.equals(parent)))
			{
				driver.switchTo().window(s);
				String price=driver.findElement(By.id("ltpid")).getText();
				System.out.println("The Stock price"+price);
				break;
			}
		}
		
		driver.switchTo().window(parent);
	
		
		/*IN CONSOLE
		 * Size of the set::2
		wset valuesCDwindow-359604CA3409CEBD291244C9C814541B
		wset valuesCDwindow-9F5599686AC9A33076F3FE55F0FA97F4
		The Stock price2,193.45
*/
	}

}
