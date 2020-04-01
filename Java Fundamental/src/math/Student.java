package math;

public class Student {

	static int count;
	//static methods and variables are aceesed using class name also object.it is applicable for today only then just ignore it.
	//non static methods and variables are accesed using object
	//
	int rollno=6;
	String name;
	public static void main(String[] args) {
		
		Student s1=new Student();
	    s1.rollno=5;
	    s1.count=1;
		System.out.println(s1.rollno);
		
		Student s2=new Student();
		s2.rollno=10;
		System.out.println(s2.rollno);
		System.out.println(s2.count);
		//when we get the object we get the copy ofit.output is 5,10
		
		
	}
	
}
