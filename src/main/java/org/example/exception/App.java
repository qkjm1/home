package org.example.exception;

import java.util.Scanner;

public class App {
    private Scanner sc;
    public App(Scanner sc) {
        this.sc = sc;
    }
    public void run() {
        System.out.println("프로그램실행");
        MotivationController controller = new MotivationController(sc);
        controller.test();
        while (true) {
            System.out.print("명령어: ");
            String cmd = sc.nextLine().trim();
            if (cmd.equals("exit")) {
                System.out.println("프로그램 종료");
                break;
            } else if (cmd.equals(" ")) {
                System.out.println("명령어 다시 입력");
                return;
            }
            if (cmd.equals("등록")) {
                controller.add();
            } else if (cmd.equals("목록")) {
                controller.list();
            } else if (cmd.startsWith("수정")) {
                controller.modify(cmd);
            } else if (cmd.startsWith("삭제")) {
                controller.delete(cmd);
            } else if (cmd.startsWith("상세보기")) {
                controller.detail(cmd);
            } else {
                System.out.println("알 수 없음");
            }
        }
    }
}

