import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		
	HashSet hset=new HashSet();
	
	hset.add("test");
	hset.add("123");
	hset.add("null");
	hset.add("55.2");
	
	System.out.println("Size of the list " + hset.size() );
	System.out.println("Printing the Lsit of values using for-each");
	for(Object o:hset)
	{
		System.out.println("Element is"+o);
	}
	
		
		
		
		
	}
		
	
	
		
}		
	


