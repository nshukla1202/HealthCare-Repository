package math;

public class ConstructorEx {

	int i;
	ConstructorEx()//Default Constructor
	{
		System.out.println("this::"+ this);
		this.i=5;//here it is c1.i=5;
		System.out.println("In default constructor");
	}

	ConstructorEx(int i)//Parameterized constructor
	{
	i=i;
		
		System.out.println("this::"+ this);
		this.i=5;//here it is c1.i=5;
		System.out.println("In default constructor");
	}
	
	
	
	public static void main(String[] args) {
		ConstructorEx c3=new ConstructorEx(3);
		//Here in above line  when we r passing an argument in line no 23 it is invoking parameterized constructor
		//in line no 13.
		//A local variable is not only within the method and also even if argument also conatins the value it is local variables.
		
		ConstructorEx c1=new ConstructorEx();
		System.out.println("c1 is "+c1);
		System.out.println(c1.i);
		ConstructorEx c2=new ConstructorEx();
		System.out.println("c2 is "+c2);
		System.out.println(c2.i);
		//To present current object in execution you need to put this.
		
		/*this::math.ConstructorEx@5f8ed237
		In default constructor
		c1 ismath.ConstructorEx@5f8ed237
		this::math.ConstructorEx@2f410acf
		In default constructor
		c2 ismath.ConstructorEx@2f410acf
		these are hastag 
		*/
		
	}
	}

