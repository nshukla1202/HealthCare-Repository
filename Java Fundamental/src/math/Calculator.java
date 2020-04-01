package math;

public class Calculator {
	/*Method name
	Arguments/Parameters
	Access Specifier-public
	class name-calculatoor
	package name- math 
	*/
	
		public int add(int a,int b)
		{
			int c=a+b; //we should not hard code the value we should pass the parameterization.
			//i will get the c as out put we r getting integer as output.
			System.out.println("Result for adding two number is"+c);
			return c;
		}
		public int multiply(int a,int b)
		{
			int c=a*b;
			return c;
			
		}
		public static int divide(int a,int b)
		{
			int c=a/b;
			return c;
		//how do we invoke static method you have invoke classname.static method name.	
		}
		public static void Display()
		{
			divide(3,5);
		}
	}



