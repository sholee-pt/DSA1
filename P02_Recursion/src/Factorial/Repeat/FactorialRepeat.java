package Factorial.Repeat;
public class FactorialRepeat {
	public static void main(String[] args) {
		int n = 6; 
		int result = 1;
		for (int i = 1; i<=n; i++)
			result = result * i;
			System.out.println(n+"! = "+result); 
	}
}