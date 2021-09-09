package com.appslab;

import java.util.Scanner;

public class IsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a + b > c && a + c > b && b + c > a);
    }
}
