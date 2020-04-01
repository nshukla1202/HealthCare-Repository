package findpatientrecordsearchpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import findpatientrecordPage.PatientRecordPage;
import findpatientrecordtest.PatientRecordTest;
import mrspage.MRSTestPage;
 
public class SearchPatientRecordPage {
	
	public static WebDriver driver=null;
	
	static By SearchPatientRecord=By.id("patient-search");
	static By SelectPatient=By.id("patient-search-results-table");
	
	public SearchPatientRecordPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public static void loginTest() {
		loginTest();
		clickonFindPatientRecord();
		
		EnterTextinSearchBox();
	}
	
	public static void clickonFindPatientRecord() {
		//driver.findElement(FindPatient_record).click();
		
	}
	public static void EnterTextinSearchBox() {
		
		driver.findElement(SearchPatientRecord);
		
		
		
		
	}
	
	public void SelectPatient() {
		
		driver.findElement(SelectPatient);
	}
	
	
	
	
	
	

}
