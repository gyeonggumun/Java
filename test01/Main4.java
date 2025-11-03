package com.korit.backjoon.test01;

public class Main4 {

    public static void update(int[] arr, int idx) {
        arr[idx] = arr[idx] *2;  // 배열의 idx 위치 값을 2배로 (원본 수정)
        idx = 0;   // idx 변수만 0으로 변경 (원본 변수에 지장없음)
    }

    public static void main(String[] args) {
        int[] data = {5, 10, 15};
        int index = 1;

        update(data, index);

        System.out.println(data[1] + index);  // 21 출력
    }
}
