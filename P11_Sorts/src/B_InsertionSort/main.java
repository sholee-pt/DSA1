package B_InsertionSort;

public class main {
	public static void main(String[] args) {
		// String a[] = {"I","N","S","E","R","T","I","O","N","S","O","R","T"};
		Integer a[] = {70, 30, 40, 20, 50, 60, 5, 80, 10, 90};
		
		System.out.println("=== 삽입 정렬 ===");
		System.out.printf("정렬입력: ");
		for (int i=0; i<a.length; i++) {
			System.out.printf(a[i]+"  ");
		}
		System.out.println();
		
		Insertion.sort(a);
		
		System.out.printf("정렬결과:  ");
		for (int i = 0; i < a.length; i++) {
			System.out.printf(a[i]+"  ");
		}
	}
}
