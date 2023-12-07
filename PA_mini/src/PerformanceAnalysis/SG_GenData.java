package PerformanceAnalysis;

// 작성자 : Lee SeungHo @ DonggukUniversity
// 날짜 : 2023.11.13.
// 수정 이력
// - GenData 기본 클래스

import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class SG_GenData {
	
    // LSH : 정수 데이터 객체를 생성하는 메소드
	public static SG_IntegerData[] genIntegerData(int num, int direction) {
		SG_IntegerData[] Intdata = new SG_IntegerData[num]; // LSH : 정수 데이터 객체 배열 초기화
		
		// LSH : 객체 배열을 랜덤 값으로 초기화
		int i = 0; int val = 0;
		while (i < num) {
			val = (int)(Math.random() * num); // LSH : 랜덤 값 생성
			
			// LSH : 중복되지 않는 경우에만 배열에 추가
			if (IsnotIndata(Intdata, val)) {
				Intdata[i] = new SG_IntegerData(val);
				i++;
			}
		}
		
		// LSH : 배열을 direction에 따라 정렬 (양수일 경우 오름차순, 음수일 경우 내림차순)
		if (direction > 0) Arrays.sort(Intdata);
        else if (direction < 0) Arrays.sort(Intdata, Collections.reverseOrder());
		
		return Intdata;
	}
	
	// LSH : 배열에 특정 값이 존재하는지 검사하는 메소드
	public static boolean IsnotIndata(SG_IntegerData[] data, int val) {
		for(SG_IntegerData da : data) {
			if (da == null) return true; // LSH : 아직 값이 할당되지 않은 경우
		    if(da.value == val) return false; // LSH : 중복된 값이 있는 경우
		}
		return true;
	}
	
    // LSH : 문자열 데이터 객체를 생성하는 메소드
	public static SG_StringData[] genStringData(int num, int direction) {
		SG_StringData[] strdata = new SG_StringData[num]; // LSH : 문자열 데이터 객체 배열 초기화
		String[] str = new String[num];
		int STRINGSIZE = 10; // LSH : 문자열의 길이를 설정
		
		// LSH : 객체 배열을 랜덤 문자열로 초기화
		int i = 0;
        while (i < num) {
			
			char[] genChar = new char[STRINGSIZE];
			for (int j = 0; j < STRINGSIZE; j++) 
				genChar[j] = getAchar(); // LSH : 랜덤 문자 생성
			String generatedString = new String(genChar);
	 	
            // LSH : 중복되지 않는 경우에만 배열에 추가
			if (!Arrays.asList(str).contains(generatedString))
				str[i++] = generatedString;
		}
        
        // LSH : 생성된 문자열로 문자열 데이터 객체를 초기화
        for (i = 0; i < str.length; i++)
        	strdata[i] = new SG_StringData(str[i]);
		
        // LSH : 배열을 direction에 따라 정렬 (양수일 경우 오름차순, 음수일 경우 내림차순)
        if (direction > 0) Arrays.sort(strdata);
        else if (direction < 0) Arrays.sort(strdata, Collections.reverseOrder());
        
		return strdata;
	}
	
    // LSH : 랜덤 문자를 생성하는 메소드
	public static char getAchar() {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"; // LSH : 사용 가능한 문자 집합
		 
        Random r = new Random();
        char c = alphabet.charAt(r.nextInt(alphabet.length())); // LSH : 문자 집합에서 랜덤한 문자를 선택
        return c;
	}

}
