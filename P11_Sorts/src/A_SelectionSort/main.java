package A_SelectionSort;

public class main {
	public static void main(String[] args) {
		// String a[] = {"S","E","L","E","C","T","I","O","N","S","O","R","T"};
		Integer a[] = {70, 30, 40, 20, 50, 60, 5, 80, 10, 90};
		
		System.out.println("=== 선택 정렬 ===");
		System.out.printf("정렬입력: ");
		for (int i = 0; i < a.length; i++) {
			System.out.printf(a[i]+"  ");
		}
		System.out.println();
		
		Selection.sort(a);
		
		System.out.printf("정렬결과: ");
		for (int i = 0; i < a.length; i++) {
			System.out.printf(a[i]+"  ");
		}
	}
}
