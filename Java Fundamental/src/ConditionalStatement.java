
public class ConditionalStatement {

	public static void main(String[] args) 
	{
		
		int month=10;
		if(month==1)
		{
			System.out.println("jan");
		}
		else if(month==2)
		{
			System.out.println("fab");
		}
		else if(month==10)
		{
			System.out.println("oct");
		}
		switch(month)
		{
		case 1:
		System.out.println("jan");
		break;
		case 2:
		System.out.println("fab");
		break;
		case 10:
		System.out.println("oct");
		break;
		default:
			System.out.println("Enter the value between 1-12");
		
		
		}
		
	}
	
}
