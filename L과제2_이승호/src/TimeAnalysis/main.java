package TimeAnalysis;

import java.util.Scanner;

public class main {
	
	private static long startTime;
	
	public static void startTimer() {
		startTime = System.nanoTime();
	}
	
	public static long stopTimer() {
		long endTime = System.nanoTime();
		return endTime - startTime;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("< 측정시작 >");
		startTimer();
		
		// 시간을 측정하고자 하는 코드 호출
		new Algorithm();
		
		long elapsedTime = stopTimer();
		System.out.println("< 측정종료 및 경과시간 >");
		System.out.println(elapsedTime + "나노초");
		System.out.println((elapsedTime / 1_000_000) + "밀리초");
		System.out.println((elapsedTime / 1_000_000_000) + "초");
		
		System.out.print("Insert file path to save data: ");
		String location = sc.nextLine();
		new CSVWriter();
		sc.close();
	}
}
