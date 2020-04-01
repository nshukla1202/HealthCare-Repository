package AbstractEx;

import acessSpecifierEx.Specifier;

public class AcessEx extends Specifier {
	//just create some method.Here we are not creating main method.Because main method is staic method just to aviod confusion i am writing this.
	
	public void a1()
	{
		
	//Specifier s1=new Specifier();	
		//System.out.println(s1.i);	
		
		System.out.println(i);
		
		//System.out.println(s1.j);
		System.out.println(j);
		//System.out.println(s1.k);
		//System.out.println(k);
		//System.out.println(s1.l);
		//System.out.println(l);
		
		
//s1.k showing error.Apart from private all the other modifer are accesible from another class within same package.
	}

}
//Apart from public all are not accessible from another class another package.

//Here we just need to extend the class no need to create an object
//when you extends the protected is accecible public