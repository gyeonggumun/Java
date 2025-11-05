package com.korit.backjoon.test02;
// int 2개를 받아 int를 반환하는 run 메소드를 가진 인터페이스
interface Calc {
    int run(int a, int b);
}

public class Main02 {
    public static void main(String[] args) {
        // 5와 3을 받아와 x와 y자리에 넣고 결과 수행
        Calc c = (x, y) -> x + y;
        // 5 + 3 = 8
        System.out.println(c.run(5, 3));
    }
}
