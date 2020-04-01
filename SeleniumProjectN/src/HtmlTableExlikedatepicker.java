import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HtmlTableExlikedatepicker {

	public static void main(String[] args) {

		//Test Case:Here i have to fetch 50 using same datepicker example logic.
		//Find the table first and then find the number of rows.
		//Get into each and every row and in the row get the all the column and in the column look for 50.if it is available the test case is  done.
		
		
		System.setProperty("Webdriver.geckodriver", "geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///C:/Neha/HTML-PAGE%20FOR%20PRACTICE/htmlTable.html");
		//Here in this below line i am getting the table.
		WebElement table=driver.findElement(By.xpath(".//*[@id='students']"));
		//In the below line i am trying to find the number of rows.
	List<WebElement> trList	=table.findElements(By.tagName("tr"));
	System.out.println("Size of the rows"+trList.size());
	//Trying to get in to each and every row and get all the coloumn.
	
	for(int i=0;i<trList.size();i++)
	{
		List<WebElement> tdList=trList.get(i).findElements(By.tagName("td"));
		System.out.println(trList.get(i));
		for(int j=0;j<tdList.size();j++)
		{
			if(tdList.get(j).getText().equals(50))
			{
				System.out.println(tdList.get(j));
			{
				tdList.get(j).click();


				break;
			}
		}
	}
		
		
	}
	
	
}
}