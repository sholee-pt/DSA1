package DataStream;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 표준 입출력 테스트
		// SystemInOut sio = new SystemInOut();
		// sio.SystemIn();
		
		// Scanner Class Test
		ScannerTest st = new ScannerTest();
		st.ScannerIn();
		
		// FileInputStream with a character Test
		// FileInputStreamTest fis = new FileInputStreamTest();
		// fis.FileCharInput();
		
		// File Reader Test
		// FileReaderTest fr = new FileReaderTest();
		// fr.FileReader();	
		
		// File Writer Test
		// FileWriterTest fw = new FileWriterTest();
		// fw.FileWriter();	
		
		// Read CSV Data Test
		String fname = "C:\\Users\\LeeSeungHo\\Desktop\\자료\\3학년\\2학기\\자료구조 및 알고리즘1\\DSA1";
		ReadCSVdataTest rcsv = new ReadCSVdataTest();
		try {
			rcsv.ReadCSV(fname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
