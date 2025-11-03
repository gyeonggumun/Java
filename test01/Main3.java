package com.korit.backjoon.test01;

public class Main3 {

    public static void concat(String str) {
        str = str + "World";   // 새로운 String 객체 생성 (원본 변경되지 않음)
        // String은 불변 객체이므로 재할당해도 원본에 영향 없음
    }

    public static void main(String[] args) {
        String message = "Hello";

        concat(message);

        System.out.println(message); // 원본 그대로 출력
    }
}
