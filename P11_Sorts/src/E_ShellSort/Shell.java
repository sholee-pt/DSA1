package E_ShellSort;

import java.lang.Comparable;
public class Shell {
	public static void sort(Comparable[] a) {
		int N = a.length;
		int h=4;  // 3x+1 간격: 1, 4, 13, 40, 121,... 중에서 4 와 1만 사용
		while (h >= 1) {		
			for (int i = h; i < N; i++) {  // h-정렬 수행
				for (int j = i; j >= h && isless(a[j], a[j-h]); j -= h) {
					swap(a, j, j-h);
					
					System.out.printf(h + ":" + i + ":" + j + " ");
					for (int k=0; k<a.length; k++) {
						System.out.printf(a[k]+"  ");
					}
					System.out.println();
				}
			}
			h /= 3;
		}
	}
	private static boolean isless(Comparable v, Comparable w) {
		return (v.compareTo(w) < 0);
	}
	private static void swap(Object[] a, int i, int j) {
		Object temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
