import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("abc");
		list.add("def");
		list.add("abc");
		System.out.println("The number of elements:::" + list.size());
		
		System.out.println(list.get(0));
		
		
	}
}
