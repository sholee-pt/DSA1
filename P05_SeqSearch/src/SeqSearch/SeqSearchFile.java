package SeqSearch;

//import java.io.IOException;
import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

//선형검색
class SeqSearchFile {

	//--- 요솟수가 n인 배열 a에서 key와 값이 같은 요소를 선형 검색 ---//
    static int seqSearch(int[] a, int n, int key) {
        int i = 0;

        while (true) {
            if (i == n)
                return -1;            // 검색 실패(-1을 반환)
            if ((char) a[i] == key)
                return i;             // 검색 성공(인덱스를 반환)
            i++;
        }
    }   
    
    public static int[] ReadData(String fname) throws IOException {
    	String str;
    	int val, i = 0;
    	int a[];
    	
		// 데이터 읽어오기
		File inFile = new File(fname);
			
		// Open student list file
		BufferedReader br = new BufferedReader(new FileReader(fname));
		
		// Read Array Length & Initialize array
		String line = br.readLine();
		if (line == null) return null;
		else {
			int num = Integer.parseInt(line);
			a = new int [num];
			System.out.println("Array length = " + num);
		}
	
		System.out.println("Data from the file, " + fname);
		while(true) {
			line = br.readLine();
			if (line == null) break;
			val = Integer.parseInt(line);
			a[i++] = val;
			System.out.println(val);
		}
		return a;
    }
    
    public static void main(String[] args) throws IOException {
    	int num, x[];
    	String dataFile = "c:/임시/arraydata.txt";
    	        
    	x = ReadData(dataFile);
    	num = x.length;
    	
    	Scanner stdIn = new Scanner(System.in);
        System.out.print("\n검색할 값: ");       // 키값을 입력받음
        int ky = stdIn.nextInt();

        int idx = seqSearch(x, num, ky);    // 배열 x에서 값이 ky인 요소를 검색

        if (idx == -1)
            System.out.println("검색 값의 요소가 없습니다.");
        else
            System.out.println("검색 값은 x[" + idx + "]에 있습니다.");
        System.out.println();
    }
}