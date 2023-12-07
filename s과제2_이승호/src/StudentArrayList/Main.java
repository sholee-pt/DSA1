package StudentArrayList;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create Student ArrList
		ArrList<Student>  sl = new ArrList<Student>();
		
		// Read CSV File data
		String fname = "C:\\임시\\s과제3_이승호_student.csv";
		ReadCSV rcsv = new ReadCSV();
		try {
			rcsv.ReadCSV(sl, fname);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// PrintClass 추가
		sl.printClass();
		
		// LSH : 순차 탐색 시작
		System.out.println("\n-------- 순차 탐색 시작 --------");
		
		// LSH : ID로 탐색
		String id = String.valueOf(7);
		System.out.println("\nID로 순차탐색 : " + id);
		int rindex = sl.SeqSearch(1, id);
		sl.printInstance(rindex);
		
		// LSH : Name으로 탐색
		String name = "김갑일";
		System.out.println("\nName으로 순차탐색 : " + name);
		rindex = sl.SeqSearch(2, name);
		sl.printInstance(rindex);
		
		// LSH : Dept로 탐색
		String dept = "경제학과";
		System.out.println("\nDept로 순차탐색 : " + dept);
		rindex = sl.SeqSearch(3, dept);
		sl.printInstance(rindex);
		
		// LSH : Grade로 탐색
		String grade = String.valueOf(1);
		System.out.println("\nGrade로 순차탐색 : " + grade);
		rindex = sl.SeqSearch(4, grade);
		sl.printInstance(rindex);
		
		// LSH : Mphone으로 탐색
		String mphone = "010-1234-5678";
		System.out.println("\nMphone으로 순차탐색 : " + mphone);
		rindex = sl.SeqSearch(5, mphone);
		sl.printInstance(rindex);
		
		// LSH : 순차 탐색 종료
		System.out.println("\n-------- 순차 탐색 종료 --------");
	}	
}
