package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        boolean x = false;
        for (char c: str.toCharArray()) {
            if (!Character.isDigit(c) && !(c == '.')){
                x = false;
                break;
            }else {
                x = true;
            }
        }
        if (x){
            return Double.parseDouble(str)>0;
        }
        else {
            return false;
        }
    }
}
