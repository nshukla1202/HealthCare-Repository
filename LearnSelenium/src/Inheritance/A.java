package Inheritance;

import java.io.File;
import java.io.IOException;

import AbstractEx.Student;

public class A {
	
	public void a1() {
	
		Student s1=new Student();
		
		s1.getvalue();
		
//https://www.tutorialspoint.com/java/java_arrays.htm
		System.out.println("In A");
		File f=new File("myfile.txt");
		
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		f.delete();
		
	}


}