

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandllingListbox {
public static void main(String[] args) {
	System.setProperty("WebDriver.geckodriver", "geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.facebook.com");
	
	// Point to Notes:In Selenium API,Selenium has provided API has a class name Select to handle this ListBox.A class contains methods.
	//How do we invoke a class using object.

	
	WebElement monthSelect=driver.findElement(By.id("month"));
	Select sel=new Select(monthSelect);
	// In a package org.openqa.selenium.support.ui.Select Select is class.But we are getting an error.We have constructor default and parameterized.//The error is not allowing the user to create an object without passing the argument.
	//So the developer who wrote this it has only parameterized constructor.
	// Check error you have to pass an argument in line no 19.So we will do the argument which we create in line no 18 will passing that argument while creating an object.
	//Now using this object you can invoke the methods.
	//VisibleText is a method which is visible to the user.Like in facebook page jan feb mar.
	sel.selectByVisibleText("Month");
	sel.selectByIndex(2);
	sel.selectByValue("5");
	//Here we are getting error NOSUCHElementException.Our objective is verify that particular item is available or not.
	
	//Datatype arrname=new Datatype(size);
	//Test case1: to verify particular item is part of the list box. If the sel.getOptions();
	//If value is there the test case is passed if value is not there you will get an exceptions.If pass the wrong value we will get NoSuchElement Exception.
	//We need to call one more method.
   List<WebElement> list =sel.getOptions();//sel.getOptions();you will get the list of Option and it will return List of WebElement.When we are talking about multiple web options we will use getOptions.We have multiple list of options.
   //List datastructure and is something dynamically increasing we do not need to mention the size of the list.In arrays the size is fixed.There is no size required in case of List.
	//In case of array we mention datatype.
   
  //How to count the display of item in the list.
   int count=list.size();
   System.out.println("Number of item in list:::" + count);
   boolean result=true;
   for(int i=0;i<count;i++)
   {
	   //In Array we are able to get the number of elements by calling array.length.Here we are calling array.size().
	  System.out.println(list.get(i).getText());
	  String optionText=list.get(i).getText();//In case of List we try to call a method to refer to the each and every value stored at a paticular index.Means list.get(index);
	  //For a webElement if you want retrieve a text what is the method we use
	 if(optionText.equals("32"))
	 {
		 result=false;
		 System.out.println("TC fails");
		 break;
	 }
	 if(result)	 
	{
		 
			 System.out.println("TC Pass");
		 
		 }
	 }
		 
}
   
   
	
	
	
	
	
}

