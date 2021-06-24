package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
    public static void main(String[] args) {
        String regexStr = ".*[a-z][0-9][a-z]";//   we said start with anything ,then contol alpha vertical section after that it can be numerique section after any section.
        Pattern pattern = Pattern.compile(regexStr);

        Matcher matcher = pattern.matcher("1324432343aabdadf28373816318");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
