package testngEx;

import org.testng.annotations.Test;

public class GroupingOfTestcases {
//In most of the companies are using agile methodologies.
//you will be getting build everyday.We will perform sanity Testing.
	
@Test(groups= {"regression","ui","US_001"})
public void a1()
{
	
	
}
@Test(groups= {"sanity","ui","US_001"})
public void a2()
{
	
}
@Test(groups= {"sanity","system","US_001"}) 
public void a3()
{
	
}
	
//Now if i ask you can you execute all ui test cases how may it will execute 2?
//Now if i ask you can you execute all the test caes UI_001 I.E.3 so that should be planned.
	
	
	
	
	
}
