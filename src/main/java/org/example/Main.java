package org.example;

import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.age = 20;
        a전사.a무기 = new 활(); // .(클래스가 가지고있는 틀(타입 변수))
        a전사.a무기 = new 칼();
    }
}
class 전사{
    int age;
    String name;
    무기 a무기; // class 전사가 가지고있는 무기타입의 이름이 a인 변수

}
class 무기{

}
class 활 extends 무기{

}
class 칼 extends 무기{

}
