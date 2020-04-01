
public class Array2D {

	public static void main(String[] args) {
		
		int data[][]=new int[6][3];
		System.out.println(data[0][0]);
		//suppose i want to print 18 values like this shall i print like this-----
		System.out.println(data[0][1]);
		System.out.println(data[0][2]);
		//we can not do like this using print statement we can print all 18 values.
		//For that we have to use Loop.Using Loop we can print all that 18 values.
		
		data[3][1]=25;
		//range of index 0...5
		System.out.println(data[6][3]); //here in output u will get out of bound Exception.
		//Compilation error only check for syntax(grammer) errors.
		//Execution it will go check on memory.
	}
	
}
