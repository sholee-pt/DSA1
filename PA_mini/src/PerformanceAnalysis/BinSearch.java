package PerformanceAnalysis;
// 이진 검색

import java.util.Scanner;
import java.lang.Comparable;

class BinSearch {
    //--- 요솟수가 n개인 배열 a에서 key와 같은 요소를 이진 검색 ---//
    static int binSearch(int [] a, int n, int key) {
        int pl = 0;            // 검색 범위의 첫 인덱스
        int pr = n - 1;        // 검색 범위의 끝 인덱스

        do {
            int pc = (pl + pr) / 2;     // 중앙 요소 인덱스
            if (a[pc] == key)
                return pc;              // 검색 성공!
            else if (a[pc] < key)
                pl = pc + 1;            // 검색 범위를 뒤쪽 절반으로 좁힘
            else
                pr = pc - 1;            // 검색 범위를 앞쪽 절반으로 좁힘
        } while (pl <= pr);

        return -1;                      // 검색 실패
    }
}