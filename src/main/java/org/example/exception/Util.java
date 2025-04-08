package org.example.exception;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Util {

    public static String getlocaldate() {
        LocalDateTime now = LocalDateTime.now();
        String regdate = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(now);
        return regdate;
    }
}
