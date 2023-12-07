package SubjectStudentList;

// import java.io.IOException;
import java.io.*;

public class ReadCSV {

	public void ReadCSV () { // 생성자

	}
	
	// 파일에서 데이터를 읽어 오기
	static void ReadCSV(ArrList<Student> sl, String fname) throws IOException {
					
		// Open student list file
		BufferedReader br = new BufferedReader(new FileReader(fname));
			
		while(true) {
				
			// 한 줄 단위로 읽어 온다.
	        String line = br.readLine();
	        if (line == null) break;  // 더 이상 읽을 라인이 없을 경우 while 문을 빠져나간다.
	        // System.out.println(line);
	            
	        // String 문자열을 구분자 문자열을 기준으로 분리한다.
	        String[] result = line.split(",");  // result는 ","를 구분자로 단어를 분리한다.
	        // System.out.println(result.length);
	            	
	        // 문자열을 정수로 변환하는 코드
	        int number = 0;
	        for (int i=0; i < result.length; i++) {
	        	try {
	        		number = Integer.parseInt(result[i]);
	        		// number = Integer.valueOf(result[i]);
	        		// System.out.println("number = " + number);
	            }
	            catch (NumberFormatException ex) {
	                // 정수형이 아닌 경우 예외처리 메시지를 출력한다.
	                // ex.printStackTrace();
	            }
	        }
    		
    		// Insert a student node into a student array list
    		sl.insertLast(new Student(number, result[1], result[2]));    		
	    }
	    br.close();
	}
}