package com.appslab;

import java.util.Scanner;
import java.util.Arrays;

public class MinMaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] splitInput = input.split(" ");
        int[] intInput = new int[splitInput.length];

        for (int i = 0; i < splitInput.length; i++) {
            intInput[i] = Integer.parseInt(splitInput[i]);
        }

        Arrays.sort(intInput);

        System.out.println(Math.abs(intInput[0] - intInput[intInput.length - 1]));
    }
}
