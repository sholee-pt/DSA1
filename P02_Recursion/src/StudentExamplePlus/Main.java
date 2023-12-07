package StudentExamplePlus;

// import Comp;
// import Student;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String name = "홍길동";
		int    id   = 1004;
		
		// Student s = new Student("홍길동", 1004);
		Student s = new Student(name, id);
		
		System.out.println(s.getName());
		System.out.println(s.getID());
		// System.out.printf("%s, %d\n",s.getName(), s.getID());
		// System.out.println("한 줄 인쇄 완료");
		 */
		/*
		String name1 = "홍길동";
		String name2 = "홍판서";
		
		if (name1 > name2) { System.out.println(name1);}
		else { System.out.println(name1); }
		*/
		int rval;
		
		Comp c = new Comp();
		rval = c.CompInt(5, 3);
		System.out.println("return value = " + rval);
		
		rval = c.CompStr("홍길동", "홍판서");
		rval = c.CompStr("홍길동", "홍길동");
		rval = c.CompStr("홍판서", "홍길동");
		System.out.println("return value = " + rval);
	}
}