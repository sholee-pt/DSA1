package DataStream;

import java.io.IOException;

public class SystemInOut {
	
	public static void SystemInOut () {
		
	}
	
	// 여러 개의 문자를 엔터를 누를 떄까지 입력 받기
	public static void SystemIn () {
		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");
		int i;
		try {
			while ((i = System.in.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
