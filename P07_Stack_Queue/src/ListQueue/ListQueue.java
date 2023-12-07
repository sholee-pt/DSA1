package ListQueue;
import java.util.NoSuchElementException;

public class ListQueue <E> {
	private Node <E> front, rear;    // 큐을 위한 포인터
	private int size; 
    public ListQueue() {        // 큐 생성자
    	front = rear = null;    
    	size = 0;
    }
    public int     size()    { return size;}        // 큐에 있는 항목의 수를 리턴
    public boolean isEmpty() { return (size == 0);} // 큐가 empty이면 true를 리턴
    
    public void add(E newItem) {   // 큐 삽입 연산
    	Node newNode = new Node(newItem, null);   // 새 노드 생성
    	if (isEmpty()) front = newNode;     // 큐가 empty이면 front도 newNode를 가리킴
    	else rear.setNext(newNode);			// 그렇지 안으면 rear의 next를 newNode를 가리킴
    	rear = newNode;						// 마지막으로 rear가 newNode를 가리키게 한다.
    	size++;
    }
	
    public E remove() {  //큐 삭제 연산
		if (isEmpty()) throw new NoSuchElementException(); // underflow 경우에 프로그램 정지
		E frontItem = front.getItem();
		front = front.getNext();
		if (isEmpty()) rear = null;
		size--;
		return frontItem;
	}  

	public void print(){  // 큐의 항목들을 출력
		for (Node p = front; p != null; p = p.getNext()) 
			System.out.print(p.getItem()+"\t ");
		System.out.println();
	}
}
