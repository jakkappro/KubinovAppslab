package com.appslab;

import java.util.Scanner;

public class SnailGoesUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double heightOfStep = scanner.nextDouble();
        double distanceOfNextStep = scanner.nextDouble();
        double towerHeight= scanner.nextDouble();

        System.out.println(towerHeight/heightOfStep * distanceOfNextStep + towerHeight);
    }
}
