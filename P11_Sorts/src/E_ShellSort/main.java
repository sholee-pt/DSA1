package E_ShellSort;

public class main {
	public static void main(String[] args) {
	//String a[] = {"S","H","E","L","L","S","O","R","T","E","X","A","M","P","L","E"};	
    
	Integer a[] = {30, 60, 20, 90, 10, 50, 40, 80, 70};
		
	System.out.println("=== 쉘 정렬 ===");
	System.out.printf("정렬입력: ");
	for (int i=0; i<a.length; i++) {
		System.out.printf(a[i]+"  ");
	}
	System.out.println();
		
	Shell.sort(a);
	System.out.printf("정렬결과:  ");
	for (int i = 0; i < a.length; i++) {
		System.out.printf(a[i]+"  ");
	}
   }
}
