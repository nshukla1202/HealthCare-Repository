import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementsEx {
public static void main(String[] args) {
	System.setProperty("WebDriver.geckodriver","geckodriver.exe" );
	
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://money.rediff.com/gainers");
	//In Below Line trying to fetch the coloums in table i.e. table heading--
	int colIndex=0;
	List<WebElement> hlist=driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
	//you want coloumn index.
	for(int i=0;i<hlist.size();i++)
	{
	 if(hlist.get(i).getText().contains("Current Price"));
	 {
		colIndex=(i+1);
		System.out.println("Column index"+ colIndex);
		break;
	 }
	 ///table[@class='dataTable']/tbody/tr/td[4] // This Xpath will selects the all the matching elements in the list.Like in find elements it selects all the matching element.
	}
	//Test Case: Verify if the company name is available if the company name is available fetch the stock Price...
	List<WebElement>stocklist=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
	
	System.out.println("The number of Stock::"+ stocklist.size());
	//i<Stcoklist.size we get the number of stock available.
	for(int i=0;i<stocklist.size();i++)
	{
		String stockname=stocklist.get(i).getText();//This gives stock name
		if(stockname.contains("Max India")) //Here we know the Max India is on row number 208 so we can get the current Price.
		{
			System.out.println("Row number is"+ (i+1));
			
			String currentPrice=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+(i+1)+"]/td["+colIndex+"]")).getText();
			
			System.out.println("current price " + currentPrice);
			break;
		}
	}
}
}
