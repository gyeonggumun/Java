package com.korit.backjoon.test02;

class Animal {
    void sound() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {
    // 부모의 sound 메소드를 자식 클래스에서 재정의
    @Override
    void sound() {
        System.out.println("Dog");
    }
}

public class Main03 {
    public static void main(String[] args) {
        // 변수 타입은 Animal이지만
        // 실제 heap 메모리에 생성된 인스턴스는 Dog임 (업캐스팅)
        Animal a = new Dog();
        // 오버라이딩된 메소드는 변수 타입이 아닌
        // 실제 인스턴스 타입의 메소드가 호출됨
        // 따라서 Dog클래스의 sound가실행됨
        a.sound();  // Dog 실행
    }
}
