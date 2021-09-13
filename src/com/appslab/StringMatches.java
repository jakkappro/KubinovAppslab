package com.appslab;

import java.util.Scanner;

public class StringMatches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.next();
        String compare = scanner.next();

        System.out.println(firstString.endsWith(compare));
    }
}
