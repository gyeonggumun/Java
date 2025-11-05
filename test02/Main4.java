package com.korit.backjoon.test02;

interface MyInterface {
    // default 메소드 : 인터페이스가 기본 구현을 가질 수 있게 함
    default void print() {
        System.out.println("Default");
    }
}

class MyClass implements MyInterface {
    // 인터페이스의 default 메소드를 구현 클래스에서
    // 오버라이딩 함
    public void print() {
        System.out.println("Class");
    }
}

public class Main4 {
    public static void main(String[] args) {
        // 타입은 인터페이스 이지만
        // 실제 인스턴스는 MyClass임(업캐스팅)
        MyInterface obj = new MyClass();
        // default 메소드가 오버라이딩되었기 때문에
        // 항상 실제 인스턴스의 오버라이딩된 메소드가 호출됨
        obj.print();

    }
}
