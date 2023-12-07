package StudentExample;

public class Student {
	private String name;
	private int id;
	
	public Student(String newName, int newID) { // 생성자
		name = newName;
		id = newID;
	}
	
	public String getName() { 
		return name; 
	}
	
	public int getID() {
		return id;
	}
}
