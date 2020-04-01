package testNgEx;

import org.testng.annotations.Test;

public class GroupingEx {
	//We need to plan the testcases like grouping of test cases will be very helpful.
	@Test(groups= {"regression","ui","system","US_001"})
	public void a1()
	{
		
	}
	@Test(groups= {"Sanity","ui","US_001"})
	public void a2()
	{
		
	}
	@Test(groups= {"Sanity","system","US_001"})
	public void a3()

	{
		
	}

}
