package StudentArrayList;

import java.util.Comparator; 
public class Student implements Comparable<Student> {
	
	// LSH : 성적과 전화번호의 comparator 추가
	public static final Comparator<Student> WITH_NAME = new WithName();
	public static final Comparator<Student> WITH_DEPT = new WithDept();
	public static final Comparator<Student> WITH_GRADE = new WithGrade();
	public static final Comparator<Student> WITH_MPHONE = new WithMphone();
	// public static final Comparator<Student> WITH_GRADE = new WithGrade();

	// LSH : grade, mphone 변수를 추가
	private int ID;
	private String name;
	private String dept; 
	private int grade;
	private String mphone;

	// LSH : 생성자에 인수 추가
	// public Student(int IDIn, String nameIn, String deptIn, int gradeIn) { // 생성자
	public Student(int IDIn, String nameIn, String deptIn, int gradeIn, String mphoneIn) { // 생성자
		ID = IDIn; 
		name = nameIn; 
		dept = deptIn; 
		grade = gradeIn;
		mphone = mphoneIn;
	}
	
	// LSH : getGrade(), getMphone() 메소드 추가
	public int 		getID() 	{return ID;}
	public String 	getName() 	{return name;}
	public String 	getDept() 	{return dept;}
	public int 		getGrade() 	{return grade;}
	public String	getMphone() {return mphone;}
	
	// LSH : setGrade(int newGrade), setMphone(String newMphone) 메소드 추가
	public void 	setID(int newId) 			{ID = newId;}
	public void		setName(String newName) 	{name = newName;}
	public void 	setDept(String newDept) 	{dept = newDept;}
	public void 	setGrade(int newGrade) 		{grade = newGrade;}
	public void 	setMphone(String newMphone) {mphone = newMphone;}

	// LSH : 성적, 전화번호로 비교하는 compare() 연산자 추가
	public static class WithGrade implements Comparator<Student> { // 성적으로 비교하는 compare() 
		public int compare(Student s1, Student s2) {
			return s1.grade-s2.grade;
		}
	}
	
	public static class WithName implements Comparator<Student> { // 이름으로 비교하는 compare()
		public int compare(Student s1, Student s2) {
			return s1.name.compareTo(s2.name);
		}
	}

	public static class WithDept implements Comparator<Student> { // 학과이름으로 비교하는 compare() 
		public int compare(Student s1, Student s2) {
			return s1.dept.compareTo(s2.dept);
		}
	}

	public static class WithMphone implements Comparator<Student> { // 휴대전화번호로 비교하는 compare() 
		public int compare(Student s1, Student s2) {
			return s1.mphone.compareTo(s2.mphone);
		}
	}
	

	public int compareTo(Student s1) { // 학번으로 비교하는 CompareTo()
		return this.ID - s1.ID;
	}
}

