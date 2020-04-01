import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

   public class HandelingDatePickerEx {

	public static void main(String[] args) {	
		//Here we are spliting the string based on delimeter.what is delimeter here space.
		//String str="Hello how are you??";
		//We have divided the String hello Hor are you? it satrts with 0.
		
		//String strArr[]=str.split(" ");
		//System.out.println(strArr[0]);
		//System.out.println(strArr[3]);
		
	String doj="April/15/2020";
	//Now we will use the split function to break this function in to multiple strings using a delimeter slash.
	//Forward slash we will use to divide the string in to multiple string.date array.spilt is function and we are taking 3 diffrent value month, date and year
	
	String dateArr[]=doj.split("/");
	String date=dateArr[1];
	String month=dateArr[0];
	String year=dateArr[2];
	
	System.setProperty("WebDriver.geckdriver", "geckodriver.exe");	
	WebDriver driver=new FirefoxDriver();
	driver.get("by.");
	
   //Lets Start this example is very good for while loop in java.
	driver.findElement(By.id("DepartDate")).click();
	//Now we will write the logic for which date we are traveling DOJ.
	//displayed year as 2019
	String displayedYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	while(!(displayedYear.equals(year)))//Here this year contains 2020
	{
		driver.findElement(By.className("nextMonth")).click();
		displayedYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		System.out.println();
	}
	String displayedMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	while(!(displayedMonth.equals(month)))
	{
		driver.findElement(By.className("nextMonth")).click();
		displayedMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		System.out.println(displayedMonth);
		
	}
	
   WebElement cal=driver.findElement(By.className("calendar"));
   List<WebElement> trList=cal.findElements(By.tagName("tr"));//here calender is webelement and it contains rows and column.
   System.out.println("Size of the rows" +trList.size());
   
   for(int i=0;i<trList.size();i++)
   {
	   List<WebElement> tdList= trList.get(i).findElements(By.tagName("td"));// i am taking first row and in the list we use index and then find no of column.
	   for(int j=0;j<tdList.size();j++)//in the first rows get the no of column and in the colum get the 1,2,3 etc.
	   {
		   if(tdList.get(j).getText().equals(date))
		{
			   tdList.get(j).click();
			   break;
		}
				   }
	   }
   }
   }

   
   