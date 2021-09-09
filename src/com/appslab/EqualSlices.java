package com.appslab;

import java.util.Scanner;

public class EqualSlices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSlices = scanner.nextInt();
        int recepiants = scanner.nextInt();
        int slicePerRecepiant = scanner.nextInt();

        System.out.println(recepiants * slicePerRecepiant <= totalSlices);
    }
}
