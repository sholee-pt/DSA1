package BinSearch;

import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create Student ArrList
		ArrList<Student>  sl = new ArrList<Student>();
		
		// Read CSV File data
		String fname = "C:\\임시\\s과제4_student.csv";
		ReadCSV rcsv = new ReadCSV();
		try {
			rcsv.ReadCSV(sl, fname);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 3. 순차 탐색
		System.out.println("\n--------- 순차 탐색 시작 --------");
		
		// 3.1 ID로 탐색
		String id = String.valueOf(8);
		System.out.println("\nID로 순차탐색 : " + id);
		int rindex = sl.SeqSearch(1, id);
		sl.printInstance(rindex);
		
		// 3.2 Name으로 탐색
		String name = "김갑산";
		System.out.println("\nName으로 순차탐색 : " + name);
		rindex = sl.SeqSearch(2, name);
		sl.printInstance(rindex);
		
		System.out.println("\n--------- 순차 탐색 종료 --------\n");
		
		// 4. 이진 탐색

		System.out.println("\n--------- 이진 탐색 시작 --------");
		// 4.1 ID로 탐색
		sl.sort(1); // 학번으로 정렬
		sl.printClass("ID");

		id = String.valueOf(6);
		rindex = sl.BinSearch(1, id); // id를 가진 자료를 탐색
		System.out.println("\nID로 이진탐색 : " + id);
		if (rindex == -1) System.out.println("\n탐색하는 자료가 없습니다.\n");
		else sl.printInstance(rindex);

		// 4.2 이름으로 탐색
		sl.sort(2); // 이름으로 정렬
		sl.printClass("이름");

		name = "김갑오";
		rindex = sl.BinSearch(2, name); // id를 가진 자료를 탐색
		System.out.println("\n이름으로 이진탐색 : " + name);
		sl.printInstance(rindex);
		
		// 4.3 ~~~
		
		System.out.println("\n--------- 이진 탐색 종료 --------");
	}	
}
