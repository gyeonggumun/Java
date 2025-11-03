package com.korit.backjoon.test01;

public class Main1 {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        // 기본 타입은 값 복사이므로 원본 변수는 변경되지 않음
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        swap(x, y);

        System.out.println(x + ", " + y); // x와 y값 그대로 10, 20 출력
    }
}
