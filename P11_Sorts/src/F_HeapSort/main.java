package F_HeapSort;

public class main {
	public static void main(String[] args) {
		//String a[] = {" ","H","E","A","P","S","O","R","T","E","X","A","M","P","L","E"};	
		Integer a[] = {0, 30, 60, 20, 90, 10, 50, 40, 80, 70}; // 맨 처음에는 sorting이 안되는 dummy 슷자를 넣어주어야 함
		
		System.out.println("=== 힙 정렬 ===");
		System.out.printf("정렬입력: ");
		for (int i=0; i<a.length; i++) {
			System.out.printf(a[i]+"  ");
		}
		System.out.println();
		
		Heap.sort(a);
		
		System.out.printf("정렬결과: ");
		for (int i = 1; i < a.length; i++) {
			System.out.printf(a[i]+"  ");
		}
	}
}
