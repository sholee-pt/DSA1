package DataStream;

// import java.io.IOException;
import java.io.*;

public class FileWriterTest {

	public static void FileWriterTest () {
		
	}
	
	// File Input Stream Test
	public static void FileWriter() {
		
		String fname = "c:\\임시\\output.txt";
		
		try (FileWriter fw = new FileWriter(fname)){
			fw.write('A');		// 한 문자 출력
			
			char buf[] = {'B', 'C', 'D', 'E', 'F', 'G', '\n'};
			fw.write(buf);		// 문자 배열 출력
			fw.write(buf, 1, 3);  // 문자 배열 일부 출력
			fw.write("\n안녕하세요?\n화창한 오후입니다.\n");	// 문자열 출력
			fw.write(65);  		// 숫자를 그대로 출력
			fw.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
