package com.korit.backjoon.test01;

public class Main2 {
    public static void modify(int[] arr) {
        arr[0] = 100;       // 배열 첫 번째 요소 변경
        arr = new int[3];  // arr을 3개짜리 배열로 새로 생성 (지역 참조만 변경)
        arr[0] = 200;      // 새 벼열의 요소 변경
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        modify(numbers);

        System.out.println(numbers[0]); // 100 출력
    }
}
