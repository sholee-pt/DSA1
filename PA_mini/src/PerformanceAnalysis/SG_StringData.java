package PerformanceAnalysis;

// 작성자 : Lee SeungHo @ DonggukUniversity
// 날짜 : 2023.11.13.
// 수정 이력
// - 문자열 데이터를 비교할 수 있는 SG_StringData 클래스

import java.util.Comparator;

public class SG_StringData implements Comparable<SG_StringData> {
    // LSH : Comparator를 정적 멤버로 선언하여 외부에서도 사용 가능하게 함.
    public static final Comparator<SG_StringData> WITH_STRING = new WithString();
    
    String str; // LSH : SG_StringData 객체가 갖는 문자열 값
    
    // LSH : 생성자, 객체 생성 시 문자열을 초기화함.
    public SG_StringData(String strr) {
        this.str = strr;
    }
    
    // LSH : 문자열 값을 반환하는 메소드
    public String get() {
        return this.str;
    }
    
    // LSH : Comparator 인터페이스를 구현하는 내부 클래스
    public static class WithString implements Comparator<SG_StringData> {
        // LSH : 두 SG_StringData 객체를 비교하는 메소드
        public int compare(SG_StringData s1, SG_StringData s2) {
            return s1.str.compareTo(s2.str);
        }
    }
    
    // LSH : Comparable 인터페이스의 메소드를 구현, 두 객체의 문자열을 비교함.
    public int compareTo(SG_StringData o) {
        // LSH : 문자열이 같으면 0, 사전순으로 앞이면 음수, 뒤면 양수를 반환
        return this.str.compareTo(o.str);
    }
}
