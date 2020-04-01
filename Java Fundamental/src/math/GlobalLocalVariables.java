package math;

public class GlobalLocalVariables {
	//global means always at the class level
	
	int i=10; //This is global variables.
	//global variables are all blue color.
	public void m1()
	//local means always at the method level.
	{
		Student s1=new Student();
				System.out.println(s1.rollno);
		int i=20;///This is local variables
		System.out.println("Local variable"+i);
	}
	public void m2()
	{
		System.out.println("Global variables"+i);
	}
	
	public void m3(int i)
	{
		System.out.println(i);
	}
	public static void main(String[] args) {
		GlobalLocalVariables g1=new GlobalLocalVariables();
		g1.m1();
		g1.m2();
	}
}
