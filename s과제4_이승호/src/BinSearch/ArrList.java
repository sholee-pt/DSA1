package BinSearch;

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
    
    // HGD : ~~~
    // SeqSearch()
    /*
    //--- 요솟수가 n인 배열 a에서 key와 값이 같은 요소를 선형 검색 ---//
    static int seqSearch(int[] a, int n, int key) {
        for (int i = 0; i < n; i++)
            if (a[i] == key)
                return i;                // 검색 성공(인덱스를 반환)
        return -1;                       // 검색 실패(-1을 반환)
    }
    */
    public int SeqSearch(int keytype, String target) {
    	
    	Student st = new Student(0, null, null, 0, null);
    	switch (keytype) {
    	case 1:  // ID로 검색
    		for (int i = 0; i < size; i++) {
    			int id = Integer.valueOf(target);
    			st = (Student) a[i];
    			if (st.getID() == id)	return i; // 검색 성공(인덱스를 반환)
    		}
    		break;
    		
    	case 2:  // Name으로 검색
    		for (int i = 0; i < size; i++) {
    			st = (Student) a[i];
    			// if (st.getName() == target)	return i; String 타입은 if문 적용 불가
    			if (target.compareTo(st.getName()) == 0)	return i; // 검색 성공(인덱스를 반환)
    		}
    		break;
    		
    	case 3:
    		break;
    		
    	case 4:
    		break;
    		
    	case 5:
    		
    	}
    	
    	return -1;
    }
    
    // HGD : ~~~~~~
    // sort()
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
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
		}
		a = (E[]) t; //원본을 저장함               // 배열 t를 배열 a로
	}
    
    /*
    // BinSearch()
    //--- 요솟수가 n개인 배열 a에서 key와 같은 요소를 이진 검색 ---//
    static int binSearch(int[] a, int n, int key) {
        int pl = 0;            // 검색 범위의 첫 인덱스
        int pr = n - 1;        // 검색 범위의 끝 인덱스

        do {
            int pc = (pl + pr) / 2;     // 중앙 요소 인덱스
            if (a[pc] == key)
                return pc;              // 검색 성공!
            else if (a[pc] < key)
                pl = pc + 1;            // 검색 범위를 뒤쪽 절반으로 좁힘
            else
                pr = pc - 1;            // 검색 범위를 앞쪽 절반으로 좁힘
        } while (pl <= pr);

        return -1;                      // 검색 실패
    }
    */
    
    // HGD : ~~~
    public int BinSearch(int key, String target) {		
        int pl = 0;            	// 검색 범위의 첫 인덱스
        int pr = size - 1;      // 검색 범위의 끝 인덱스
        
    	Student st = new Student(0, null, null,0,null);
		switch (key) {
			case 1: // int type 이진탐색 코드
				// 학번으로 탐색
				int targetID = Integer.valueOf(target);			
		        do {
		            int pc = (pl + pr) / 2;     // 중앙 요소 인덱스
		            st = (Student) a[pc];
		            if (st.getID() == targetID)
		                return pc;              // 검색 성공!
		            else if (st.getID() < targetID)
		                pl = pc + 1;            // 검색 범위를 뒤쪽 절반으로 좁힘
		            else
		                pr = pc - 1;            // 검색 범위를 앞쪽 절반으로 좁힘
		        } while (pl <= pr);				
				break;
			case 2:
				// 학생이름으로 탐색
				do {
					int pc = (pl + pr) / 2;     // 중앙 요소 인덱스
			        st = (Student) a[pc];
			        if (target.compareTo(st.getName()) == 0)
			            return pc;              // 검색 성공!
			        else if (target.compareTo(st.getName()) > 0)
			            pl = pc + 1;            // 검색 범위를 뒤쪽 절반으로 좁힘
			        else
			                pr = pc - 1;            // 검색 범위를 앞쪽 절반으로 좁힘
			    } while (pl <= pr);
				break;
			case 3:
				// 학과이름으로 탐색 
				
				break;
			case 4: // int type 이진탐색 코드
				// 학년으로 탐색
							
				break;
			case 5:
				// 휴대전화번호로 탐색 

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
    
    // HGD: ~~~    
    public void printInstance(int index) { // 배열의 하나의 항목을 출력
		if (index == -1)
			System.out.print("\n탐색하고자 하는 데이터가 없음.\n");
		else if (isEmpty()) 
			System.out.print("\n배열이 비어있음.\n");      
		else {
			Student t = new Student(0, null, null, 0, null);
			t = (Student) a[index];
			System.out.print("ID : " + t.getID() + "  ");
			System.out.print("이름 : " + t.getName() + "  ");
			// 나머지 항목을 출력하는 코드를 완성하세요~
			System.out.print("연락처 : " + t.getMphone() + "\n");
		}
	}
    
    // HGD: ~~~
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
				// 나머지 항목을 출력하는 코드를 완성하세요~
				System.out.print(((Student) a[i]).getMphone()+"\n");
				}
			System.out.println();
	}
}
