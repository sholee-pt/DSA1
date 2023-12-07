package StudentArrayList;

import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create Student ArrList
		ArrList<Student>  sl = new ArrList<Student>();
		
		// Read CSV File data
		String fname = "C:\\임시\\s과제2_이승호_student.csv";
		ReadCSV rcsv = new ReadCSV();
		try {
			rcsv.ReadCSV(sl, fname);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Array List 접근 방법
		System.out.println("ArrList Size " + sl.peekSize());
		
		/*
		Student st = new Student(0, null, null, 0, null);
		st = sl.peek(0);
		System.out.println("name = " + st.getName());
		System.out.println("name = " + sl.peek(2).getName());
		*/
		
		// PrintClass
		sl.printClass();
		
	}	
}
