package C_MergeSort;

public class main {
	public static void main(String[] args) {
		//String a[] = {"M","E","R","G","E","S","O","R","T","E","X","A","M","P","L","E"};
		Integer a[] = {70, 30, 40, 20, 50, 60, 5, 80, 10, 90};
		
		System.out.println("=== 합병 정렬 ===");
		System.out.printf("정렬입력: ");
		for (int i=0; i<a.length; i++) {
			System.out.printf(a[i]+"  ");
		}
		System.out.println();
		
		Merge.sort(a);
		
		System.out.print("정렬결과 : ");
		for (int i = 0; i < a.length; i++) {
			System.out.printf(a[i]+"  ");
		}
	}
}
