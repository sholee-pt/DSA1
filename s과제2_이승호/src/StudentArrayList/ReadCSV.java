package StudentArrayList;

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
	         
	        // LSH : Array의 제일 처음에는 id, 4번째에는 성적을 input
	        int id = Integer.parseInt(result[0]);
	        int grade = Integer.parseInt(result[3]);
	        // number = Integer.valueOf(result[i]);
    		
	        // LSH : 각 학생에 대한 정보를 Array 내에 삽입한다.
    		// Insert a student node into a student array list
    		sl.insertLast(new Student(id, result[1], result[2], grade, result[4]));    		
	    }
	    br.close();
	}
}