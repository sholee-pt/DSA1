package BST;

public class main {

	public static void main(String[] args) {
		
		// 탐색 트리 형성
		BST t = new BST(500, "Apple");  

		t.put(600, "Banana");
		t.put(200, "Melon"); 
		t.put(100, "Orange");
		t.put(400, "Tangerine"); 
		t.put(250, "Kiwi");
		t.put(150, "Grape");
		t.put(800, "Strawberry"); 
		t.put(700, "Cherry"); 
		t.put(50,  "Pear");
		t.put(350, "Lemon");
		t.put(10,  "Watermelon");

		t.print(t.root);System.out.println();
		System.out.println("높이 = "+ t.height());
		
		// k정보 항목 탐색
		System.out.println("노드명 = "+ t.get(250) + "\n");
		
		// 최소항목 탐색
		System.out.println("최소노드 = "+ t.min());
		System.out.println("최소노드명 = "+ t.get(t.min()));
		
		// 항목 삭제
		t.delete(350);
		System.out.println("\n\n===== 350항목 삭제 후 트리 1 =====");
		t.print(t.root);System.out.println();
		System.out.println("높이 = "+ t.height());
		
		// 연습문제 5.17
		BST u = new BST(50, "Apple");  

		u.put(30, "Orange");
		u.put(70, "Grape");
		u.put(20, "Melon");	
		u.put(10, "Banana");
		u.put(40, "Tangerine"); 
		u.put(60, "Kiwi");
		u.put(80, "Strawberry"); 
		
		System.out.println("\n\n===== 연습문제 5.17 트리 2 =====");
		u.print(u.root);System.out.println();
		System.out.println("높이 = "+ u.height());
		
		System.out.println("\n\n===== 연습문제 5.17 트리 2 : 45 삽입 =====");
		u.put(45, "Cherry"); 
		u.print(u.root);System.out.println();
		System.out.println("높이 = "+ u.height());
	}
}