package TravelIslands.Recursion;
public class Travel {
	private Node start; // 시작 섬
	public Travel() { start = null; } // 여행 생성자
	public class Node {
		private char name;		// 섬 이름
		private Node left, right; 	// 섬 사이의 다리 연결
		public Node(char newIsland, Node lt, Node rt) { // 섬 생성자
			name = newIsland; left = lt; right = rt; }
	}
	public Node map(){ 		// 지도 만들기
		Node n1 = new Node('H',null, null); 	Node n2 = new Node('F',null, null); 
		Node n3 = new Node('s', null, null); 	Node n4 = new Node('U',null, null); 
		Node n5 = new Node('E',null, null); 	Node n6 = new Node('z', null, null); 
		Node n7 = new Node('K',null, null); 	Node n8 = new Node('N',null, null); 
		Node n9 = new Node('A',null, null); 	Node n10 = new Node('Y', null, null); 
		Node n11 = new Node('T',null, null); 
		n1.left = n2; 	n1.right =n3; // n1의 왼쪽 섬-> n2, n1의 오른쪽 섬 -> n3 
		n2.left = n4; 	n2.right =n5; // n2의 왼쪽 섬-> n4, n2의 오른쪽 섬 -> n5
		n3.left = n6; 	n3.right =n7; // n3의 왼쪽 섬-> n6, n3의 오른쪽 섬 -> n7 
		n4.left = n8; 	n5.left = n9; // n4의 왼쪽 섬-> n8, n5의 오른쪽 섬 -> n9
		n7.right = n10; n9.right = n11; // n7의 왼쪽 섬-> n10, n9의 오른쪽 섬 -> n11 
		return n1; // 시작 섬 리턴
	}
	public void A_Course (Node n) { // A-코스
		if (n != null) {
			System.out.print(n.name+" -> "); // 섬 n 방문 
			A_Course (n.left); 			// n의 왼쪽으로 진행
			A_Course(n.right); 			// n의 오른쪽으로 진행
		}
	}
	public void B_Course(Node n) { // B 코스
		if (n != null) {
			B_Course(n.left);			// n의 왼쪽으로 진행
			System.out.print(n.name+" -> "); // 섬 n 방문
			A_Course(n.right); 			// n의 오른쪽으로 진행
		}
	}
	public void C_Course(Node n) { // C 코스
		if (n != null) {
			C_Course(n.left); 			// n의 왼쪽으로 진행
			C_Course(n.right); 			// n의 오른쪽으로 진행
			System.out.print(n.name+" -> "); // 섬 n 방문
		}
	}
	public static void main(String[] args) {
		Travel t = new Travel(); 	// 여행 객체 t 생성
		t.start = t.map(); 		// t의 시작 섬을 n1으로
		System.out.print("\nA-코스: "); 	t.A_Course(t.start); 
		System.out.print("\n\nB-코스: "); 	t.B_Course(t.start); 
		System.out.print("\n\nC-코스: "); 	t.C_Course(t.start);
	}
}


