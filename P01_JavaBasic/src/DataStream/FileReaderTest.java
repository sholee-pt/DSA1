package DataStream;

// import java.io.IOException;
import java.io.*;

public class FileReaderTest {

	public static void FileReaderTest () {
		
	}
	
	// File Input Stream Test
	public static void FileReader() {
		
		String fname = "c:\\임시\\input.txt";
		
		try (FileReader fr = new FileReader(fname)){
			int i;
			while ((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
			fr.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}
}
