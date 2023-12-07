package StudentExample;
// import Student;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "홍길동";
		int    id   = 1004;
		
		// Student s = new Student("홍길동", 1004);
		Student s = new Student(name, id);
		
		System.out.println(s.getName());
		System.out.println(s.getID());
		// System.out.printf("%s, %d\n",s.getName(), s.getID());
		// System.out.println("한 줄 인쇄 완료");
	}
}