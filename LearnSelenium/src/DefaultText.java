import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DefaultText {
	public static void main(String[] args) {
		
		
System.setProperty("Webdriver.geckodriver","geckodriver.exe");

FirefoxDriver driver=new FirefoxDriver();

driver.get("https://www.indeed.com/");

WebElement e=driver.findElement(By.id("text-input-where"));

//can we get attribute id value.

String idvalue=e.getAttribute("id");
System.out.println(" id value" + idvalue);


//Getting the tag name value

String tagName=e.getTagName();
System.out.println("TagName::"+tagName);

//default text stored in textbox will be retrieved.

String value=e.getAttribute("value");
System.out.println("value::"+ value);


  
  
  


	}

}
