package PerformanceAnalysis;

// 작성자 : Lee SeungHo @ DonggukUniversity
// 날짜 : 2023.11.13.
// 수정 이력
// - 알고리즘 성능 측정 (수행시간)
// - 큰 수에 컴마 포함하는 메소드 - m.formatNumber()

import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class Main {
    // LSH : 데이터 셋의 크기를 나타내는 배열
    private static int sizeofData[] = {5, 10, 100, 1000, 10000, 25000, 50000, 75000, 100000};
    
    // LSH : 시간 측정 결과를 저장하기 위한 배열
    private static int index = 0;   // sizeofData의 인덱스를 추적하기 위한 변수
    private static String timeResult[] = {"", "", "", "", "", "", "", "", ""};

    // LSH : 1회 측정 결과를 CSV 파일 형식으로 저장하는 메소드
    public static void writeCSV(String path, String data) throws IOException {
        // LSH : 파일 위치와 데이터를 입력받아 파일을 생성하거나 염.
        File csv = new File(path); // 파일 위치 바탕으로 생성
        BufferedWriter bw = new BufferedWriter(new FileWriter(csv, true));
        // LSH : 파일 쓰기(이어쓰기 설정)
        bw.write(data); // 데이터를 쓰고
        bw.newLine(); // 줄바꿈
        bw.flush();
        bw.close();
    }
    
    // LSH : 측정 결과의 타이틀을 파일에 출력하는 메소드
    public static void writeTitle(String path, String data) throws IOException {
        S_Measure m = new S_Measure();
        // LSH : 데이터 셋 크기에 따른 타이틀을 생성하여 파일에 씀.
        for (int i=0; i < sizeofData.length; i++) {
            data = data + "|" + m.formatNumber(sizeofData[i]);
        }
        writeCSV(path, data);    
    }
    
    // LSH : 전체 시간 측정 결과를 CSV 형식으로 변환하여 파일에 출력하는 메소드
    public static void writeTimeResult(String path, String data) throws IOException {
        // LSH : 각 데이터 셋에 대한 시간 측정 결과를 CSV 형식으로 저장함.
        for (int i=0; i < timeResult.length; i++) {
            data = data + "|" + timeResult[i];
        }
        writeCSV(path, data);    
    }
    
    public static void main(String[] args) throws IOException {
        
        S_Measure m = new S_Measure(); // LSH : 시간 측정을 위한 객체 생성
        SG_GenData g = new SG_GenData(); // LSH : 데이터 생성을 위한 객체 생성
        
        // LSH : 출력 파일 설정
        String testobj = "Quick Sort"; // LSH : 테스트 대상 알고리즘 이름
        String path = "C:\\임시\\paout_" + testobj + ".txt";
        File csv = new File(path); // LSH : 지정된 위치에 파일 객체 생성
        
        // LSH : 출력 파일 초기화 (기존 내용 삭제)
        BufferedWriter bw = new BufferedWriter(new FileWriter(csv, false));
        
        // LSH : 각 데이터 셋 크기에 대해 알고리즘을 실행하고 시간을 측정함.
        for (int k: sizeofData) {            
            // LSH : 데이터 생성
            int direction = 0;  // LSH : 데이터의 정렬 방향을 설정함. (1: 순방향, 0: 랜덤, -1: 역방향)
            SG_IntegerData[] a = g.genIntegerData(k, direction); // LSH : 정수 데이터 생성
            
            int[] d = new int[k];
            int key = d[(int) (Math.random() * k)]; // LSH : 검색 키를 랜덤하게 선택
            
            // LSH : 시간 측정 시작
            long startTime = m.startTimer();
            System.out.println("startTime = "+m.formatNumber(startTime));
        
            // LSH : 분석 대상 알고리즘 실행
            // BinSearch.binSearch(d, k, key);
            //Selection.sort(a);
            //Insertion.sort(a);
            //Shell.sort(a);
            //Heap.sort(a);
            //Merge.sort(a);
            Quick.sort(a);
            
            // LSH : 시간 측정 종료
            long elapsedTime = m.stopTimer(startTime);
            System.out.println("elapsedTimer = "+m.formatNumber(elapsedTime));
            
            // LSH : 측정 결과 처리 및 출력
            timeResult[index] = m.formatNumber(elapsedTime/1000); // LSH : 나노초를 마이크로초로 변환
            
            // LSH : 측정 결과를 화면에 출력
            System.out.println("SizeOfData : " + m.formatNumber(k) + " 개");
            System.out.println("Key : " + key);
            System.out.println("elapsedTime : " + timeResult[index] + " uSec");
            System.out.println("");
            
            index++; // LSH : 인덱스 증가
        }
        // LSH : CSV 파일로 시간 측정 결과 출력
        writeCSV(path, "A.2 " + testobj + " 알고리즘 수행시간 분석");
        writeTitle(path, "구분");
        writeTimeResult(path, "시간");  // LSH : 시간 데이터를 정렬하여 파일에 저장
        writeCSV(path, "------------------------------------------\n");
            
        System.out.println("~~~ 알고리즘 성능분석 완료 ~~~");
    }
}
