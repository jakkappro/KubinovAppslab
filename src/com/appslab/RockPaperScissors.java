package com.appslab;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerOne = scanner.next();
        String playerTwo = scanner.next();

        if (playerOne.equals("rock") && playerTwo.equals("rock") ||
                playerOne.equals("paper") && playerTwo.equals("paper") ||
                playerOne.equals("scissors") && playerTwo.equals("scissors")) {
            System.out.println("TIE");
        } else if (playerOne.equals("rock") && playerTwo.equals("scissors") ||
                playerOne.equals("paper") && playerTwo.equals("rock") ||
                playerOne.equals("scissors") && playerTwo.equals("paper")) {
            System.out.println("Player 1 wins");
        } else if (playerOne.equals("rock") && playerTwo.equals("paper") ||
                playerOne.equals("paper") && playerTwo.equals("scissors") ||
                playerOne.equals("scissors") && playerTwo.equals("rock")) {
            System.out.println("Player 2 wins");
        } else {
            System.out.println("Error! Incorrect input");
        }
    }
}
