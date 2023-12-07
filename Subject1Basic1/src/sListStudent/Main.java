package sListStudent;

import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create Student ArrList
		ArrList<Student>  alist = new ArrList<Student>();
		
		// Read CSV File data
		String fname = "C:\\임시\\student.csv";
		ReadCSVaList rcsv = new ReadCSVaList();
		try {
			rcsv.ReadCSVaList(alist, fname);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Array List 접근 방법
		Student st = new Student(0, null, null);
		st = alist.peek(0);
		// System.out.println("ArrList Size " + alist.peekSize());
		// System.out.println("name =" + st.getName());
		// System.out.println("name =" + alist.peek(2).getName());
		
		alist.printClass();
		
		// Create Student sList
		SList<Student>  sl = new SList<Student>();
		ReadCSVsList rcsv1 = new ReadCSVsList();
		try {
			rcsv1.ReadCSVsList(sl, fname);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		sl.printClass();
	}	
}
