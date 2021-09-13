package com.appslab;

import java.util.Scanner;

public class IsStringPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();

        System.out.println(input.equals(sb.toString()));
    }
}
