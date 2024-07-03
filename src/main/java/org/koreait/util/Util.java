package org.koreait.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Util {
    public static String getNow(){
        LocalDateTime now = LocalDateTime.now();
        String formateNow = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        return formateNow;
    }

}
