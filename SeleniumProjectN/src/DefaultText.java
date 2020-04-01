import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//Test case: When you open this web page there is some text available in the text box by default.we have to verify.
public class DefaultText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.geckodriver","geckodriver.exe");
     
		 WebDriver driver=new FirefoxDriver();   
		 driver.get("https://www.indeed.com/");
	  WebElement e =driver.findElement(By.id("text-input-where"));//there is 1 matching node for id.
		 
	    //can we get attribute id value	
	  
	  //getting the attribute id value
	   String idvalue=e.getAttribute("id");
	   System.out.println("id value" +idvalue);
	   //getting the tagname value
	   String tagName=e.getTagName();
	   System.out.println("tag Name:: "+tagName);
	   //default text stored in textbox will be retrieved
	   String value=e.getAttribute("value");
	   System.out.println("value::: " +value);
	   //How do we get the default value  stored in text box using get Atrribute of value.
	   //what is use of fatching the value?
	   //you enter text using e.sendkeys("abcdefgh") it allows only 7 character how do you verfiy that it allows only 7 character.
	   //e.getAttribute("value")
}
}
