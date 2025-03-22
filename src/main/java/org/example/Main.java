package org.example;

import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        String name = "칸";
        a전사.name = name; // 클래스 안 변수들은 이름이 겹쳐도 괜찮음
        a전사.age = 20;
        a전사.자기소개();

        a전사.age++;
        a전사.자기소개();

        a전사.age = 30;
        a전사.name = "카니";
        a전사.자기소개();

        a전사.a무기 = new 활();
        a전사.공격();
        // 출력 : 카니가 활로 공격합니다.

        a전사.a무기 = new 칼();
        a전사.공격();
        // 출력 : 카니가 칼로 공격합니다.
    }
}
class 전사{
    int age;
    String name;
    무기 a무기; // class 전사가 가지고있는 무기타입의 이름이 a인 변수

    void 공격(){
        a무기.작동(); //변수 타입이 가지고있는 메서드 실행
    }
    void 자기소개(){
        System.out.println("안녕하세요 저는 "+this.age+"살 "+this.name+"입니다.");
    }
}
class 무기{
    void 작동(){

    }

}
class 활 extends 무기{
    void 작동(){
        System.out.println("카니가 활로 공격합니다.");
    }
}
class 칼 extends 무기{
    void 작동(){
        System.out.println("카니가 칼로 공격합니다.");
    }
}
