package StudentList;

import java.io.*;

public class ReadFileData {
// 파일에서 데이터를 읽어 오기
static int[] ReadData(String fname) throws IOExeption {
	int size = 0; //항목 수를 0으로 초기화
	Node rdata = new Node; //최초로 1개의 원소를 가진 배열 생성
	size = 0;
	BufferedReader br = new BufferedReader(new FileReader(fname));
	while(true) {
		// 한 줄 단위로 읽어온다
		String line = br.readLine();
		// 더 이상 읽을 라인이 없을 경우 while 문을 빠져나간다
		if (line == null) break;
		System.out.println(line);
	}
}
}
