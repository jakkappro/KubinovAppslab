package com.appslab;

import java.util.Scanner;

public class EqualSlices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSlices = scanner.nextInt();
        int recipients = scanner.nextInt();
        int slicePerRecipient = scanner.nextInt();

        System.out.println(recipients * slicePerRecipient <= totalSlices);
    }
}
