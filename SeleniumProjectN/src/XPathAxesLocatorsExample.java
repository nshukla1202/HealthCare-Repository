import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPathAxesLocatorsExample {
	
	public static void main(String[] args) {
		
		System.setProperty("WeDriver.geckodriver", "geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.deal4loans.com/home-loans.php");
		
	//test case: 1 I am writing the code to apply home loan for Axis Bank Home loan and i have to click on apply button which is next to AxisBank Home loan.
		
	  WebElement e=driver.findElement(By.xpath("//a[contains(text(),'Axis Bank Home Loan')]/parent::span/parent::td[1]/following-sibling::td[5]"));
	  e.click();
		
  	     //System.out.println(e);//Suppose if i will print e it will give me the complete x-path
		//**
		//a[contains(text(),'Axis Bank Home Loan')]/parent::span/parent::td[1]//Its not complete xpath because,This xpath only selecting Axis Bank Home loan web element but its not for clickin on Apply button
	 
//Test Case:2 I am writing the code for applying home loan for HDFCLtd and i have to click on Apply button.
  	     
 WebElement e1  = driver.findElement(By.xpath("//a[text()='HDFC Ltd']/parent::span/parent::td/following-sibling::td[5]"));
  	     
  e1.click();//Parent parent become ancestor so see xpath below---
  	  
  	 //Above x-path i can write like this where we using Ancestor-- //a[text()='HDFC Ltd']/ancestor::td/following-sibling::td[5] 
  	  //I will write like this 
  	 
  	  WebElement e2=driver.findElement(By.xpath("//a[text()='HDFC Ltd']/ancestor::td/following-sibling::td/child::a"));
  	  e1.click();
  	  System.out.println("test case pass");
  	  
      // I will write from right hand to left hand-see below-
     //We are using preceding-sibling(which preceeds) and decendant(child or subchild)
     // WebElement e2=driver.findElement(By.xpath("//a/parent::td/preceding-sibling::td[5]/child::span/child::a[text()='HDFC Ltd']"));
  	  // **
    //we can write the above x-path like this as well.See below-
    //a/parent::td/preceding-sibling::td[5]/descendant::a[text()='HDFC Ltd']//child child is descendant
  	  
  // below xpath is for element on the page where i am writing xpath from right to left
   ////a/parent::td/preceding-sibling::td/child::span/child::a[text()='LIC Housing Finance']
  	  
   // some more x-path from right hand to left--//a/parent::td/preceding-sibling::td/child::span/a[text()='Axis Bank Home Loan'] 	  
  	  
    //left to right same xpath--------------
  	  
  	//a[text()='Axis Bank Home Loan']/parent::span/child::a
  	//a[text()='Axis Bank Home Loan']/parent::span/descendant::a
	}
}

