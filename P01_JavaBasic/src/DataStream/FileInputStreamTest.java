package DataStream;

// import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;


public class FileInputStreamTest {

	public static void FileInputStreamTest () {
		
	}
	
	// File Input Stream Test
	public static void FileCharInput() {
		
		FileInputStream fis = null;
		
		try {
			String fname = "c:\\임시\\input.txt";
			fis = new FileInputStream(fname);
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
