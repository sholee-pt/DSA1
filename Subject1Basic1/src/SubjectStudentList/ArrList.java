package SubjectStudentList;
import java.util.NoSuchElementException;
import java.util.Comparator;
import java.util.Arrays;

public class ArrList <E> {
	private  E a[];     // 리스트의 항목들을 저장할 배열
    private  int size;  // 리스트의 항목 수
   
    public  ArrList() { // 생성자
        a = (E[]) new Object[1];  // 최초로 1개의 원소를 가진 배열 생성
        size = 0;                 // 항목 수를 0으로 초기화
    }
    public E delete(int k) {  // k번째 항목 삭제
		if (isEmpty()) throw new NoSuchElementException(); // underflow 경우에 프로그램 정지
		E item = a[k];
		for (int i = k; i <size; i++)  a[i] = a[i+1];  // 한 칸씩 앞으로 이동
		size--;
		if (size > 0 && size == a.length/4) // 배열에 항목들이 1/4만 차지한다면
			resize(a.length/2); 			// 배열을 1/2 크기로 축소
		return item;
    }
    
    public void insert(E newItem, int k) { // 새 항목을 k-1번쨰 항목 다음에 삽입
    	if (size == a.length)   		   // 배열에 빈 공간이 없으면
    		resize(2*a.length);			   // 배열 크기 2배로 확장
    	for (int i = size-1; i >= k; i--)  a[i+1] = a[i];  // 한 칸씩 뒤로 이동
    	a[k] = newItem;
    	size++;
    }
        
    public void insertLast(E newItem) {	// 가장 뒤에 새 항목 삽입              
        if (size == a.length)   	// 배열에 빈 공간이 없으면
        	resize(2*a.length);  	// 배열 크기 2배로 확장
         a[size++] = newItem;    	// 새 항목 삽입
    }

    public boolean isEmpty() {return size == 0;} // 리스트가 empty이면 true 리턴
    
	private void resize(int newSize) {		// 배열 크기 조절
		Object[] t = new Object[newSize];   // newSize 크기의 새로운 배열 t 생성
		for (int i = 0; i < size; i++)
			t[i] = a[i];                    // 배열 s를 배열 t로 복사 
		a = (E[]) t;                        // 배열 t를 배열 s로 
	}
    
    public E peek(int k) {  // k번째 항목을 리턴, 단순히 읽기만 한다.
  		if (isEmpty()) throw new NoSuchElementException(); // underflow 경우에 프로그램 정지
  		return a[k];
      }
    
    public int peekSize() {return size;}
    
    public void sort(int key) {		
		Student[] t = new Student[size];   	// newSize 크기의 새로운 배열 t 생성
		for (int i = 0; i < size; i++)
			t[i] = (Student) a[i];
		
		switch (key) {
			case 1:
				// 학번으로 정렬
				Arrays.sort(t); 
				break;
			case 2:
				// 학생이름으로 비교할 Comparator WITH_NAME
				Arrays.sort(t, Student.WITH_NAME);
				break;
			case 3:
				// 학과이름으로 비교할 Comparator WITH_DEPT 
				Arrays.sort(t, Student.WITH_DEPT);
				break;
		}
		a = (E[]) t;                        // 배열 t를 배열 a로
	}
    
    public int SeqSearch(int key, String target) {		

    	Student st = new Student(0, null, null);
		switch (key) {
			case 1:
				// 학번으로 탐색
				int num = Integer.valueOf(target);
				for (int i = 0; i < size; i++) {
					st = (Student) a[i];
					if (st.getID() == num) return i;
				}
				break;
			case 2:
				// 학생이름으로 탐색
				for (int i = 0; i < size; i++) {
					st = (Student) a[i];
					// if (st.getName() == target) return i;
					if (target.compareTo(st.getName()) == 0) return i;
				}
				break;
			case 3:
				// 학과이름으로 탐색 
				for (int i = 0; i < size; i++) {
					st = (Student) a[i];
					// if (st.getDept() == target) return i;
					if (target.compareTo(st.getDept()) == 0) return i;
				}
				break;
		}
		return -1;   // 찾고자 하는 데이터가 없음
	}
    
    public void print() { // 배열의 항목들을 출력
		if (isEmpty()) 
			System.out.print("배열이 비어있음.");      
		else
			for(int i = 0; i < a.length; i++)	System.out.print(a[i]+"\t ");
		System.out.println();
	}
    
    public void printInstance(int index) { // 배열의 하나의 항목을 출력
		if (index == -1)
			System.out.print("\n탐색하고자 하는 데이터가 없음.\n");
		else if (isEmpty()) 
			System.out.print("\n배열이 비어있음.\n");      
		else {
			Student t = new Student(0, null, null);
			t = (Student) a[index];
			System.out.print("ID : " + t.getID() + "\t   ");
			System.out.print("이름 : " + t.getName() + "\t");
			System.out.print("학과 : " + t.getDept() + "\n");
		}
	}
    
    public void printClass(String key) { // Class 배열의 항목들을 출력
		if (isEmpty()) 
			System.out.print("배열이 비어있음.");      
		else
			System.out.println(); 
			System.out.println(" "+key+"(으)로 정렬"); 
			System.out.println("----------------------");
			for(int i = 0; i < a.length; i++)
				if (a[i] != null) {
				System.out.print(((Student) a[i]).getID()+"  ");
				System.out.print(((Student) a[i]).getName()+"  ");
				System.out.print(((Student) a[i]).getDept()+"\n");
				}
			System.out.println();
	}
}
