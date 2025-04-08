package org.example.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotivationController {
    private Scanner sc;
    int lastId=3;
    static List<Motivation> motivations = new ArrayList<>();
    public MotivationController(Scanner sc) {
        this.sc = sc;
    }
    public void add(){
        System.out.print("제목: ");
        String head = sc.nextLine();
        System.out.print("내용: ");
        String body = sc.nextLine();
        String nowDate = Util.getlocaldate();
        String newDate = Util.getlocaldate();
        int id = lastId+1;
        lastId++;

        Motivation mt = new Motivation(head, body, nowDate, newDate, id);
        motivations.add(mt);
        System.out.println(id+"번 글이 등록되었습니다");
    }

    public void list(){
        System.out.println("==목록==");
        System.out.println(" id  /   제목   /   내용   ");
        for (Motivation mt : motivations) {
            System.out.printf("  %d   /    %s    /    %s     \n",mt.getId(),mt.getHead(),mt.getBody());
        }
    }

    public void delete(String cmd){
        int id = Integer.parseInt(cmd.split(" ")[1]);
        Motivation findmt = null;

        for (Motivation mt : motivations) {
            if (mt.getId() == id) {
                findmt = mt;
                break;
            }
        }
        if(findmt == null) {
            System.out.println(id+"번 게시글 없음");
            return;
        }
        motivations.remove(findmt);
        System.out.println("삭제가 완료되었습니다");
    }
    public void modify(String cmd){
        int id = Integer.parseInt(cmd.split(" ")[1]);
        Motivation findmt = null;

        for (Motivation mt : motivations) {
            if (mt.getId() == id) {
                findmt = mt;
                break;
            }
        }
        if(findmt == null) {
            System.out.println(id+"번 게시글 없음");
            return;
        }


        System.out.print("수정제목: ");
        String head = sc.nextLine();
        System.out.print("수정내용: ");
        String body = sc.nextLine();
        String newDate = Util.getlocaldate();

        findmt.setHead(head);
        findmt.setBody(body);
        findmt.setNewDate(newDate);

        System.out.println("수정되엇습니다");
    }
    public void detail(String cmd){
        int id = Integer.parseInt(cmd.split(" ")[1]);
        Motivation findmt = null;

        for (Motivation mt : motivations) {
            if (mt.getId() == id) {
                findmt = mt;
                break;
            }else if(findmt == null) {
                System.out.println(id+"번 게시글 없음");
                return;
            }
        }
        System.out.printf("%d:번\n",findmt.getId());
        System.out.printf("제목: %s\n",findmt.getHead());
        System.out.printf("내용: %s\n",findmt.getBody());
        System.out.printf("수정날짜: %s\n",findmt.getNewDate());
        System.out.printf("게시날짜: %s\n",findmt.getNowDate());
    }
    public static void test(){
        motivations.add(new Motivation("test1","test1","2020-20-20 22:22:22","2020-20-20 22:22:22",1));
        motivations.add(new Motivation("test2","test2","2020-20-20 22:22:22","2020-20-20 22:22:22",2));
        motivations.add(new Motivation("test1","test3","2020-20-20 22:22:22","2020-20-20 22:22:22",3));
    }
}
