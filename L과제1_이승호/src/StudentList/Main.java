package StudentList;

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// Create Student ArrList
		ArrList<Student>  al = new ArrList<Student>();
		
		// Read CSV File data
		Scanner sc = new Scanner(System.in);
		String fname = "C:\\임시\\s과제2_이승호_student.csv";
		ReadCSVaList rcsv = new ReadCSVaList();
		try {
			rcsv.ReadCSVaList(al, fname);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Array List 접근 방법
		System.out.println("ArrList Size " + al.peekSize());
		
		/*
		Student al = new Student(0, null, null, 0, null);
		st = al.peek(0);
		System.out.println("name = " + st.getName());
		System.out.println("name = " + al.peek(2).getName());
		*/
		
		// PrintClass
		al.printClass();
		
		// Create Student SList
		SList<Student> sl = new SList<Student>();
		
		ReadCSVsList rcsv1 = new ReadCSVsList();
		try {
			rcsv1.ReadCSVsList(sl, fname);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sl.print();
		
	}	
}
