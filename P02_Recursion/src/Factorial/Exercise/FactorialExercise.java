package Factorial.Exercise;
public class FactorialExercise { 
	public static int factorial(int n) {
		if (n <= 1)
			return 1;
		else
			return n*factorial(n-1);
	}
	
	public static void main(String[] args) {
		int result;
		int n = 7;
		result = factorial (n);
		System.out.println(n + "! = " + result);
	}
}
