package PerformanceAnalysis;

// 작성자 : Lee SeungHo @ DonggukUniversity
// 날짜 : 2023.11.13.
// 수정 이력
// - SG_IntegerData 비교 가능 클래스 구현

public class SG_IntegerData implements Comparable<SG_IntegerData> {

		int value; // LSH : SG_IntegerData 객체가 갖는 정수 값
		
		// LSH : 생성자, 객체를 생성할 때 정수 값을 할당함.
		public SG_IntegerData(int value) {
			this.value = value;
		}
		
		// LSH : value 값을 반환하는 메소드
		public int get() {
			return this.value;
		}
		
		// LSH : Comparable 인터페이스의 메소드를 구현, 두 객체를 비교함.
		public int compareTo(SG_IntegerData o) {
			return this.value - o.value; // LSH : 값이 작으면 음수, 같으면 0, 크면 양수를 반환
		}
}
