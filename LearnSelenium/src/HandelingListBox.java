import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandelingListBox {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.geckodriver","geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		WebElement monthSelect=driver.findElement(By.id("month"));
		
		Select sel=new Select(monthSelect);
		sel.selectByVisibleText("Feb");
		sel.selectByIndex(1);
		sel.selectByValue("2");
		
		
	//object is to verify paticular option is available or not?
		//Datatype arrname=new Datatype[size];
		//I will get the list of webElements.
	  //List is the datastructure.List is dynamically increasing.No size required in case of List.
		List<WebElement> list=sel.getOptions();
		
		//In case of array we mention the datatypes.
		//Display the number of items in the list...
		
		int count=list.size();
		System.out.println("Number of items in the list:::"+ count);
		//lets see all the options in the list
		boolean result=true;
		for(int i=0;i<count;i++)
		{
			System.out.println(list.get(i).getText());
			String optiontext=list.get(i).getText();
			if(optiontext.equals(14))
			{
				System.out.println("TC Fails");
				break;
			}
		}
	   if(result)
	   {
		   System.out.println("TC pass");
	   }
		
		
		
		
		
	}
}
