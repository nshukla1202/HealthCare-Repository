package abstarctEx;

import accessspecifier.SpecifierEx;

public class AccessEx extends SpecifierEx {
	
//Can we acess public private protected and default from another class within the same package?
	
	
	public void a1()
	{
		
		System.out.println(i);
		System.out.println(j);
		//System.out.println(k);//You can see private can not be acessible.
		//System.out.println(l);
//Apart from private all other modifier are accessible from another class within the same package.
//Here only Public is accessible.Private protected and default is not accesible.		
		
	}
	
	
	}

