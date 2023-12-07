package BinaryTree;

public class main {
	public static void main(String[] args) {

		Node n1 = new Node(10,null,null); 	Node n2 = new Node(20,null,null);
		Node n3 = new Node(30,null,null);	Node n4 = new Node(40,null,null);	
		Node n5 = new Node(50,null,null);	Node n6 = new Node(60,null,null);
		Node n7 = new Node(70,null,null);	Node n8 = new Node(80,null,null);
		Node n9 = new Node(90,null,null);	Node n10 = new Node(100,null,null);

		n1.setLeft(n2); n1.setRight(n3);  // LSH: n1의 왼쪽 자식-> n2, n1의 오른쪽 자식-> n3
		n2.setLeft(n4);	n2.setRight(n5);  // LSH: n2의 왼쪽 자식-> n4, n2의 오른쪽 자식-> n5
		n3.setLeft(n6);  				  // LSH: n3의 왼쪽 자식-> n6
		n4.setLeft(n7); 				  // LSH: n4의 왼쪽 자식-> n7
		n5.setLeft(n8); n5.setRight(n9);  // LSH: n5의 왼쪽 자식-> n8, n5의 오른쪽 자식-> n9
		n6.setRight(n10);				  // LSH: n6의 오른쪽 자식-> n10
		
		BinaryTree t1 = new BinaryTree();  // 이진 트리 객체 t 생성 
		t1.setRoot(n1); 				   // t의 루트 노드를 n1으로
		
		System.out.printf("전위 순회:  ");
		t1.preorder(t1.getRoot());
		System.out.printf("\n중위 순회:  ");
		t1.inorder(t1.getRoot());
		System.out.printf("\n후위 순회:  ");
		t1.postorder(t1.getRoot());
		System.out.printf("\n레벨 순회:  ");
		t1.levelorder(t1.getRoot());
		System.out.println();
		
		System.out.printf("\n트리의 노드 개수 = " + t1.size(t1.getRoot()));
		System.out.printf("\n트리의 높이 = " + t1.height(t1.getRoot()));
		System.out.println();
		
		BinaryTree t2 = new BinaryTree();
		Node ctree = t2.copy(t1.getRoot()); // LSH: copy() 메소드를 사용하여 t1을 복사한 t2 생성
		t2.setRoot(ctree);
		
		boolean pf = BinaryTree.isEqual(t1.getRoot(), t2.getRoot()); // LSH: 두 트리가 동일한지에 대해 true 혹은 false를 boolean으로 반환
		// LSH: 동일성 여부에 따라 해당하는 메세지 출력
		if (pf = true) {
			System.out.println("\nt1 트리와 t2 트리는 동일합니다.");
		}
		else {
			System.out.println("\nt1 트리와 t2 트리는 동일하지 않습니다.");
		}
	}
}

