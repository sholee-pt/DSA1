package StudentComp;

import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Student[] a = {
		  new Student(14069, "박**","수학", 3), 		new Student(12051,"황**", "경영", 4), 
		  new Student(15002, "백**", "디자인", 2), 	new Student(12481,"박**", "수학", 4), 
		  new Student(15505, "장**", "영문", 2), 		new Student(16962,"정**", "수학", 1), 
		  new Student(15376, "최**", "컴퓨터", 2), 	new Student(16420,"진**", "경제", 2),
		  new Student (11293, "김**", "컴퓨터", 4), 	new Student (10184,"강**", "경영", 3), 
		  new Student(16104, "김**", "컴퓨터", 1), 	new Student(10390,"한**", "경영", 4), 
		  new Student (14758, "이**", "컴퓨터", 2)
		};
		Arrays.sort(a); // 학번으로 정렬
		print(a, "ID"); 
		// 학과이름으로 비교할 Comparator WITH_DEPT 
		Arrays.sort(a, Student.WITH_DEPT); 
		print(a,"학과"); 
		// 학생이름으로 비교할 Comparator WITH_NAME
		Arrays.sort(a, Student.WITH_NAME); 
		print(a,"이름"); 
		// 학년으로 비교할 Comparator WITH_GRADE 
		Arrays.sort(a, Student.WITH_GRADE);
		print(a, "학년");
	}
	
	public static void print(Student[] a, String key) {
		System.out.println(); 
		System.out.println(" "+key+"(으)로 정렬"); 
		System.out.println("----------------------"); 
		for(Student temp: a) {
			System.out.printf(temp.getID() + " "+temp.getName() + " " + temp.getDept() +
					" It" + temp.getGrade()+"\n");
		}
	}
}

