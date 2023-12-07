package SubjectStudentList;

import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create Student ArrList
		ArrList<Student>  sl = new ArrList<Student>();
		
		// Read CSV File data
		String fname = "C:\\임시\\student.csv";
		ReadCSV rcsv = new ReadCSV();
		try {
			rcsv.ReadCSV(sl, fname);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Array List 접근 방법
		Student st = new Student(0, null, null);
		st = sl.peek(0);
		// System.out.println("ArrList Size " + sl.peekSize());
		// System.out.println("name =" + st.getName());
		// System.out.println("name =" + sl.peek(2).getName());

		// Array List 정렬 
		sl.sort(1); // 학번으로 정렬
		// sl.printClass("ID");
		
		sl.sort(2); // 이름으로 정렬
		// sl.printClass("이름");
		
		sl.sort(3); // 학과로 정렬
		sl.printClass("학과");
		
		// 순차 탐색
		// ID로 탐색
		String id = String.valueOf(5);
		int rindex = sl.SeqSearch(1, id);	// id를 가진 자료를 탐색
		sl.printInstance(rindex);
		
		// 이름으로 탐색
		String name = "허백호";
		rindex = sl.SeqSearch(2, name);	// id를 가진 자료를 탐색
		sl.printInstance(rindex);
		
		// 학과명으로 탐색
		String dept = "통계학과";
		rindex = sl.SeqSearch(3, dept);	// id를 가진 자료를 탐색
		sl.printInstance(rindex);
	}	
}
