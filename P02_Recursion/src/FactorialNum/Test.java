package FactorialNum;

public class Test {

	public static void f(int n) {          
		System.out.print(n);  		   
		if ( n > 0 ) f(n-1);		     
		System.out.print(n);		            
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		f(3);
		// System.out.println("Hello world!");
		// System.out.println("안녕하세요 월드씨~~");
	}

}
