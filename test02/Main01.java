package com.korit.backjoon.test02;

public class Main01 {
    // int를 받아 int를 반환하고 Exception을 던질 수 있는 함수형 인터페이스 F 정의
    static interface F {
        int apply(int x) throws Exception;
    }

    // F 인터페이스의 구현체를 매개변수로 받는 run 메소드
    public static int run (F f) {
        try {
            // 전달받은 f에 항상 3을 인자로 받음
            return f.apply(3);
        } catch (Exception e) {
            // 만약 f.apply(3)실행 중 예외가 발생하면 이 블록이 실행됨
            return 7;
        }
    }

    public static void main(String[] args) {
        // F 인터페이스의 첫 번째 구현체를 변수 f에 할당
        F f = (x) -> {
            if (x > 2) {
                // x가 2보다 크면 예외 발생
                throw new Exception();
            }
            return x *2;
        };
        // 7 + 12로  정답 => 19
        System.out.println(run(f) + run((int n) -> n + 9));
    }
}
