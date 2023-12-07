package PerformanceAnalysis;

// 작성자 : Lee SeungHo @ DonggukUniversity
// 날짜 : 2023.11.13.
// 수정 이력
// - 수행시간 측정 메소드 - startTimer(), stopTimer(long startTime)
// - 메모리 사용량 측정 메소드 - startMemoryUsage(), stopMemoryUsage(long startMemory) (아직 구현되지 않음)
// - 큰 수에 컴마를 포함하는 메소드 - formatNumber(long number)

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class S_Measure {
    
    private static long startTime; // LSH : 타이머 시작 시간을 저장하는 정적 변수
    
    // LSH : 생성자
    public S_Measure () {
        // 기본 생성자
    }
    
    // LSH : 현재 시간을 나노초 단위로 가져와서 타이머를 시작하는 메소드
    public static long startTimer() {
        startTime = System.nanoTime(); // 현재 시간을 나노초 단위로 설정
        return startTime; // 시작 시간 반환
    }
    
    // LSH : 타이머를 멈추고, 시작 시간으로부터 경과된 시간을 나노초 단위로 반환하는 메소드
    public static long stopTimer(long startTime) {
        long endTime = System.nanoTime(); // 현재 시간을 나노초 단위로 설정
        return endTime - startTime; // 경과 시간 반환
    }
      
    // LSH : 숫자를 인자로 받아서 콤마가 포함된 문자열로 변환하는 메소드
    public static String formatNumber(long number) {
        DecimalFormat formatter = new DecimalFormat("#,###"); // 숫자 포맷을 정의
        return formatter.format(number); // 숫자를 포맷에 맞게 문자열로 변환하여 반환
    }
}
