package acessSpecifierEx;

public class AcessEx {
	//just create some method.Here we are not creating main method.Because main method is staic method just to aviod confusion i am writing this.
	
	public void a1()
	{
		
	Specifier s1=new Specifier();	
		System.out.println(s1.i);	
		
		System.out.println(s1.j);
		//System.out.println(s1.k);
		System.out.println(s1.l);
		
//s1.k showing error.Apart from private all the other modifer are accesible from another class within same package.
	}

}
