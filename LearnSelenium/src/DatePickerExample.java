import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerExample {
	public static void main(String[] args) {
		
		/*String str="Hello how are you??";
		//delimeter space
		
		String strArr[]=str.split(" ");
		System.out.println(strArr[0]);
		System.out.println(strArr[3]);*/
				
		
		//which datae you want to journey so see below:
		String doj="15/April/2020";
		
		//So here i will use split fuction it vl be break the string in to multiple string using a deleimeter slash.forward slash we vl use to divide it in to multiple strings.
		
		String dateArr[]=doj.split("/");
		
		String date=dateArr[0]; //15
		
		String month=dateArr[1];//april
		String year=dateArr[2];//2020
        System.setProperty("WebDriver.chrome.driver","C:\\Neha\\Selenium\\SeleniumJavaProject\\LearnSelenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		
		
		String displayedMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!(displayedMonth.equals(month)))
		{
		driver.findElement(By.className("nextMonth")).click();
		displayedMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
			
		}
		//we will take table class=calender we will us ethis logic to fetch the rows and coloumn.
		//we can apply this logic on any calender.
		WebElement cal=driver.findElement(By.className("calendar"));
		List<WebElement> trlist=cal.findElements(By.tagName("tr"));
		
		System.out.println("Size of the rows"+trlist.size());
		
		for(int i=0;i<trlist.size();i++)
		{
			List<WebElement> tdList=trlist.get(i).findElements(By.tagName("td"));
			
			for(int j=0;j<tdList.size();j++)
			{
				if(tdList.get(j).getText().equals(date))
				{
					tdList.get(j).click();
					
					tdList.get(j).click();
					
					break;
					
				}
				
					
				
			}
		}
		
		
		
	}

}
