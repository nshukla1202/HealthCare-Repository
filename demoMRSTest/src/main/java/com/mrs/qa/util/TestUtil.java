package com.mrs.qa.util;

import com.mrs.qa.base.TestBase;

public class TestUtil extends TestBase {
	
	//inside this i will create 2 static variable.and both are public can be used anywhere.
	//only i need to change the timeout and implicit wait value here or.
	//if we want we can define this under config.property.
	public static long Page_Load_TIMEOUT=20;
	public static long IMPLICIT_WAIT=10;
	
	
	//public void switchToFrame() {
		
		//driver.switchTo().frame("mainpanel");
		
	}
	//}
	

