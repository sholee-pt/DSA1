package DataStream;

import java.io.IOException;
import java.util.Scanner;

public class ScannerTest {

	public static void ScannerTest () {
		
	}
	
	// Scanner Class - Input Test
	public static void ScannerIn () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름: ");
		String name = sc.nextLine();
		System.out.println("직업: ");
		String job = sc.nextLine();
		System.out.println("사번: ");
		int id = sc.nextInt();
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(id);
	}
}
