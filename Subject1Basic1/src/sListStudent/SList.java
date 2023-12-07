package sListStudent;
import java.util.NoSuchElementException;

// Slide 8
public class SList <E> {
	
	protected Node head;  // 연결 리스트의 첫 노드 가리킴
	private   int  size;
	public SList(){       // 연결 리스트 생성자
		head = null;
		size = 0;
	}
	
	public Node<E> getHead() { return head; }
	
	// Slide 12
	public void insertAfter(E newItem, Node<E> p){ // 노드 p 바로 다음에 새 노드 삽입
		p.setNext(new Node<E>(newItem, p.getNext()));
		size++;
	}

	// Slide 11
	public void insertFront(E newItem){ // 연결리스트 맨 앞에 새 노드 삽입
		head = new Node<E>(newItem, head);
		size++;
	}
	 
	 public boolean isEmpty() { return size == 0; }
	
	// Slide 16
	public void deleteAfter(Node<E> p){ // p가 가리키는 노드의 다음 노드를 삭제
		if (p == null) throw new NoSuchElementException();
		Node<E> t = p.getNext();
		p.setNext(t.getNext());
		t.setNext(null);
		size--;
	}

	// Slide 14
	public void deleteFront(){       // 리스트의 첫 노드 삭제
		if (isEmpty()) throw new NoSuchElementException();
		head = head.getNext();
		size--;
	}
	
	// Slide 6
	public Node<Student> search(String target) {   // target을 탐색  
		 Node<Student> p = head;
		 for (int  k = 0; k < size ;k++){
			 Student st = p.getItem();
			 if (target == st.getName()) return p;
			 p = p.getNext(); 
		 }
		 return null; // 탐색을 실패한 경우 null을 리턴
	 } 

	 public void setHead(Node<E> n) { head= n;}
	 
	 public int size() { return size; }

	public void print(){  // 연결 리스트 노드들의 항목들을 차례로 출력
		Student st = new Student(0, null, null);
		for (Node<Student> p = head; p != null; p = p.getNext()) {
			st = p.getItem();
			System.out.print(st.getID()+"\t  ");
			System.out.print(st.getName()+"\t");
			System.out.print(st.getDept()+"\n");			
		}
	}
	
	public static Node reverseList(Node currentNode){  //연습문제 2-19 역방향 리스트
		 Node previousNode=null;  
		 Node nextNode;  
		 while(currentNode!=null){  
			 nextNode=currentNode.getNext();  
			 currentNode.setNext(previousNode);  // 링크 역으로
			 previousNode=currentNode;  
			 currentNode=nextNode;  
		 }  
		 return previousNode;  
	}
	
	public void createCycle(){  // 환형리스트 만들기
		 Node<E> p = head;
		 Node<E> q = null;
		 while(p != null){
			 q = p;
			 p = p.getNext();
		 }
		 q.setNext(head);
	 }
	
	// 연습문제 2-23 싸이클 검사
	 public boolean cycleDetector() {  
		 Node<E> fastPtr = head;  
		 Node<E> slowPtr = head;  
		 while (fastPtr != null && fastPtr.getNext() != null) {  
			 fastPtr = fastPtr.getNext().getNext();  
			 slowPtr = slowPtr.getNext();  
			 if (slowPtr == fastPtr)  
				 return true;  	  
		 }  
		 return false;  
	}
	 
	// 연습문제 2-22 중간 노드 찾기
	public Node findMiddleNode(Node head){  
		 Node slowPointer, fastPointer;   
		 slowPointer = fastPointer = head;    
		 while(fastPointer != null) {   
			 fastPointer = fastPointer.getNext();   
			 if(fastPointer != null && fastPointer.getNext() != null) {   
				 slowPointer = slowPointer.getNext();   
				 fastPointer = fastPointer.getNext();   
			 }   
		 }   
		 return slowPointer;
	}
	
	
	 /*
	 public Node<E> mergeTwoLists(Node<E> p1, Node<E> p2){ //연습문제 2-17 두개의 정렬된 리스트 합병
		 Node<E> head = new Node<E>(0, null);
		 Node<E> p = head;
		 while(p1!=null && p2!=null){
			 int c =  p1.getItem().compareTo(p2.getItem());
			 if (c < 0) {
				 p.setNext(p1);
				 p1=p1.getNext();
			 }
			 else{
				 p.setNext(p2);
				 p2=p2.getNext();
			 }
			 p = p.getNext();
		 }
		 if(p1 != null) p.setNext(p1);
		 if(p2 != null) p.setNext(p2);
		 return head.getNext();
	 }
	 */
	 
	 // 연습문제 2-21 공통된 숫자의 합
	 /*
	 public int commonSum(SList l2){ 
		 int sum = 0;
		 Node<E> p1 = head;
		 Node p2 = l2.getHead();
		 while(p1 !=null && p2 != null){
			 int c =  p1.getItem().compareTo(p2.getItem());
			 if (c == 0) {
				 sum += (int) p1.getItem();
				 p1=p1.getNext();
				 p2=p2.getNext();
			 }
			 else if (c  < 0) 	p1=p1.getNext();
			 else 				p2=p2.getNext();  
		 }
		 return sum;
	 }
	 */

	//연습문제 2-20 k와 같거나 작은 리스트와 k보다 큰 리스트로 분리
	 /*
	 public void splitList(Node<E> p, Node<E> k, SList<E> l1, SList<E> l2){ 
		 Node<E> head1 = new Node<E>(null, null);
		 Node<E> head2 = new Node<E>(null, null);
		 Node<E> p1 = head1;
		 Node<E> p2 = head2;
		 while(p != null){
			 int c =  (p.getItem()).getID().compareTo((k.getItem()).getID());
			 if (c <= 0) {
				 p1.setNext(p);
				 p1=p1.getNext();
			 }
			 else{
				 p2.setNext(p);
				 p2=p2.getNext();
			 }
			 p = p.getNext();
		 }
		 p1.setNext(null);
		 p2.setNext(null);
		 l1.setHead(head1.getNext());
		 l2.setHead(head2.getNext());
	 }
	 */
}
