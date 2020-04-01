import java.util.HashSet;
import java.util.Set;

public class SetEx {
	
	public static void main(String[] args) {
		
		
		
		Set<String> set=new HashSet<String>();
		
		set.add("abc");
		set.add("def");
		set.add("abc");
		
		System.out.println("The number of elements:::"+set.size());
		
		
	}

}
