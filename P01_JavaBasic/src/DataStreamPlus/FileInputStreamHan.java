package DataStreamPlus;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;


public class FileInputStreamHan {

	public static void main(String[] args) throws IOException{
		
		String curdir = "c:/임시";
		
		// 1. C 드라이브 내에 temp 폴더가 없을 때 생성
		File tempDir = new File(curdir);
		if (!tempDir.exists())
			tempDir.mkdir();
		System.out.println(tempDir.exists());
		
		// 2. 파일 객체 생성 (실제 파일 생성)
		File inFile = new File(curdir + "/testdata.txt");
		if (!inFile.exists())
			inFile.createNewFile();
		System.out.println(inFile.exists());
		System.out.println();
				
		// 3. n-byte 단위 읽기
		InputStream is1 = new FileInputStream(inFile);
		byte[] byteArray1 = new byte[6];
		int count1;
		while ((count1 = is1.read(byteArray1)) != -1) {
			String str = new String(byteArray1, 0, count1, Charset.forName("UTF-8"));
			System.out.print(str);
			System.out.println(": count = " + count1);
		}
		is1.close();
		System.out.println();
		System.out.println();
		
		// 4. n-byte 단위 읽기 (앞에서 length만큼 읽어 byte[] offset 위치에 넣기)
		InputStream is2 = new FileInputStream(inFile);
		byte[] byteArray2 = new byte[9];
		int offset = 3;
		int length = 6;
		int count2 = is2.read(byteArray2, offset, length);
		String str = new String(byteArray2, 0, offset+count2, Charset.defaultCharset());
		String str1 = new String(byteArray2, offset, count2, Charset.defaultCharset());
		System.out.println(str);
		System.out.println(str1);
		is2.close();
		
		// 5. 파일 전체를 읽어오기
		InputStream is3 = new FileInputStream(inFile);
		byte byteArray3[] = new byte[is3.available()];
		
		while (is3.read(byteArray3) != -1);
		System.out.println("[1] 텍스트 파일 읽기 : "+new String(byteArray3,"UTF-8"));
		is3.close();
	}
}
