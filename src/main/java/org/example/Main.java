package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==실행==");
        List<Article>save=new ArrayList<>(); // 조합을 저장

        int lastid = 0;

        while (true) {//exit가 아닐때 반복
            System.out.print("명령어) ");
            String cmd = sc.nextLine().trim();
            if (cmd.length() == 0) {continue;}
            if (cmd.equals("exit")) {break;}
            if (cmd.equals("article write")) {
                System.out.println("게시글을 작성합니다");
                int id = lastid + 1; // 게시글 작성 순서번호
                //입력
                System.out.print("제목: ");
                String title = sc.nextLine().trim();
                System.out.print("내용: ");
                String body = sc.nextLine().trim();
                //저장     저장할 조합(생성자)가 필요
                Article articles = new Article(id, title, body); // 생성자
                save.add(articles); // 조합을 저장

                System.out.printf("%d번 게시글이 생성되었습니다.\n", id);
                lastid = id;
            }
            if (cmd.equals("article list")){
                System.out.println("=======================================");
                if()
                for (Article article : save) { // save가 순회




                }
            }
        }
    }
}
class Article{
    int id;
    String title;
    String body;
    Article(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}