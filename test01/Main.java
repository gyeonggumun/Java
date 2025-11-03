package com.korit.backjoon.test01;

public class Main {

    public static void change(String[] data, String s) {
        data[0] = s;   // 배열의 첫 번째 요소를 s로 변경 (참조 타입이므로 원본 배열 수정됨)
        s = "Z";  // String은 불변이므로 원본 변수에 여향 없음
    }

    public static void main(String[] args) {
        String data[] = { "A" };
        String s = "B";

        change(data, s);  //호출 후 dsta[0]에 s에 들어있는 문자열 B 전달 s도 똑같이 B를 전달

        // data[0]는 change 메서드를 호출하여 B추가, change의 s는 불변임으로 원본에 영향을 주지 않아 B유지
        System.out.println(data[0] + s);  // BB출력
    }
}
