package Inheritance;

import java.io.File;
import java.io.IOException;

public class A {
	public void a1()
	{
		Student s1=new Student();
		
	s1.getValue();
	System.out.println("in A");
	File f=new File("myFile.txt");
	try {
		f.createNewFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
		
	}
	
	f.delete();
	
		
	}
	}


