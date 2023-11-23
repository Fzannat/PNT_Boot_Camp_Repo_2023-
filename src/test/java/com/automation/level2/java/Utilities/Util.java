package com.automation.level2.java.Utilities;

import java.util.Date;

public class Util {
    public static String generateRandomEmailWithDateStamp(){
        Date date = new Date();
        String timeStamp = date.toString().replace(" ","_").replace(":", "_");
        String uniqueEmail = "LUMA" + timeStamp + "@gmail.com";
        return uniqueEmail;

    }
    public static final int IMPLICIT_WAIT = 20;
    public static final int PAGE_LOAD_TIME = 100;
    public static final int SCRIPT_TIMEOUT = 1000;
}
