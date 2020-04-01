
public class Array1D {

	public static void main(String[] args) {
		//suppose i know the value
		int a[]= {1,2,3,4,5,6};//wemain
		//why we use Arrays is selenium?Ans is  below---
		//if you want to read data from the excel,if you want data in testcases we have to use data from the excel 
		//Excel represent in the form of Array.
		//if you want to fetch the data from the excel..if you want to represant one index it is one dimension Array.
		//if you want to represent 2 index
		
		 //it is 2 dimension Array.
		
		int  marks[]=new int[6];
		System.out.println(marks[0]);
		System.out.println(marks[5]);
		marks[3]=30;
		System.out.println(marks[3]);
		
		
		float stockPrices[]= new float[10];
		System.out.println(stockPrices[0]);
		
		boolean resultArr[]=new boolean[10];
		System.out.println(resultArr[0]);
		
		char ch[]=new char[10];
		System.out.println("Default value of char" + ch[0]);
		//+ symbol is cancatination it is string and char it is cancatination.
		//operation overloading string +integer concatination. 
		//+ symbol varies when argument we pass it is called operator overloading it exist in different behaviours.
		
		System.out.println(2+1);
		
	}
	
}
