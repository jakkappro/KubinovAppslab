package com.appslab;

import java.util.Scanner;

public class MultiplyByLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] splitInput = input.split(" ");
        int[] inputInt = new int[splitInput.length];

        for (int i = 0; i < splitInput.length; i++) {
            inputInt[i] = Integer.parseInt(splitInput[i]) * splitInput.length;
        }

        for (int inpt : inputInt) {
            System.out.println(inpt);
        }
    }
}
