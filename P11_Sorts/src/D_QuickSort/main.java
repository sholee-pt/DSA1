package D_QuickSort;

public class main {
	public static void main(String[] args) {
		//String a[] = {"Q","U","I","C","K","S","O","R","T","E","X","A","M","P","L","E"};
		Integer a[] = {70, 30, 40, 20, 50, 60, 5, 80, 10, 90};
		
		System.out.println("=== 퀵 정렬 ===");
		System.out.printf("정렬입력: ");
		for (int i=0; i<a.length; i++) {
			System.out.printf(a[i]+"  ");
		}
		System.out.println();
		
		Quick.sort(a);
		
		System.out.print("정렬결과: ");
		for (int i = 0; i < a.length; i++) {
			System.out.printf(a[i]+"  ");
		}
	}
} 	