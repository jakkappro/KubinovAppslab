package com.appslab;

import java.util.Scanner;

public class WarOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] splitInput = input.split(" ");
        int[] intInput = new int[splitInput.length];
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < splitInput.length; i++) {
            intInput[i] = Integer.parseInt(splitInput[i]);
        }

        for (int num : intInput) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.println(Math.abs(oddSum - evenSum));
    }
}
