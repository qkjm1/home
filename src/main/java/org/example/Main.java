package org.example;

// 문제 : 아래가 실행되도록 해주세요.
// 조건 : 배열을 사용할 수 없습니다.

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        사람인력관리소 a사람인력관리소 = new 사람인력관리소();

        a사람인력관리소.add사람("홍길순", 33);
        // 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
        a사람인력관리소.add사람("홍길동", 20);
        // 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
        a사람인력관리소.add사람("임꺽정", 30);
        // 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.

        사람 a사람1 = a사람인력관리소.get사람(1);
        a사람1.자기소개();
        // 저는 1번, 홍길순, 33살 입니다.

        사람 a사람2 = a사람인력관리소.get사람(2);
        a사람2.자기소개();
        // 저는 2번, 홍길동, 20살 입니다.

        사람 a사람3 = a사람인력관리소.get사람(3);
        a사람3.자기소개();
        // 저는 3번, 임꺽정, 30살 입니다.
    }
}
class 사람인력관리소{
    int 마지막_번호;
    List<사람>명단 = new ArrayList<>();

    사람 사람;


    void add사람(String name, int age) {
        int 번호=마지막_번호+1;
        사람 a사람 = new 사람();

        a사람.age=age;
        a사람.name=name;
        a사람.번호=번호;

        명단.add(a사람);

        System.out.printf("나이가 %d살인 %d번째 사람(%s)이 추가되었습니다.\n",age,번호,name);

        마지막_번호++;
    }
    사람 get사람(int 번호){
        return 명단.get(번호-1);
    }
}
class 사람 {
    String name;
    int age;
    int 번호;

    void 자기소개(){
        System.out.printf("저는 %d번, %d, %s입니다.\n",번호,age,name);
    }
}
