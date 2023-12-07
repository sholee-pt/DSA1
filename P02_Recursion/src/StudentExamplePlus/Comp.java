package StudentExamplePlus;

import java.util.Comparator;

public class Comp {
	
	public Comp() { // 생성자
		
	}
	
	public int CompInt (int n1, int n2) {
		if (n1 > n2) { return 1; }
		else { return 0; }	
	}
	
	public int CompStr (String s1, String s2) {
		return s1.compareTo(s2);
	}

}
