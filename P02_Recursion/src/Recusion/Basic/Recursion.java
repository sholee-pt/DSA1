package Recusion.Basic;
public class Recursion {
	public void recurse(){
		System.out.println("*");; 
		recurse();
	}
	
	public static void main(String[] args) {
		Recursion r = new Recursion(); 
		r.recurse();
	}
}