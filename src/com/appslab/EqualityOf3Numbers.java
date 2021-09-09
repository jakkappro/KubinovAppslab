package com.appslab;

import java.util.Scanner;

public class EqualityOf3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 == num2 && num1 == num3) {
            System.out.println(3);
        } else if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }
    }

}
