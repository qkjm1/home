package org.example.exception;

public class Motivation {
    String head;
    String body;
    String nowDate;
    String newDate;
    int id;
    public Motivation(String head, String body, String nowDate, String newDate, int id) {
        this.head = head;
        this.body = body;
        this.nowDate = nowDate;
        this.newDate = newDate;
        this.id = id;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNewDate() {
        return newDate;
    }

    public void setNewDate(String newDate) {
        this.newDate = newDate;
    }

    public String getNowDate() {
        return nowDate;
    }

    public void setNowDate(String nowDate) {
        this.nowDate = nowDate;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
