package com.appslab;

import java.util.Scanner;

public class CanRookAttack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] splitInput = input.split(" ");
        char[] position1 = splitInput[0].toCharArray();
        char[] position2 = splitInput[1].toCharArray();

        System.out.println(position1[0] == position2[0] || position1[1] == position2[1]);
    }
}
