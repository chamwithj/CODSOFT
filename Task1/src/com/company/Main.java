package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int maxAttempts = 10;
        int score = 0;
        boolean playAgain = true;

        while (playAgain){
            int attempts = 0;

            System.out.println("Welcome to Number Guessing Game");
            int randomNumber = random.nextInt(100) + 1;

            while (attempts < maxAttempts){
                System.out.println("Enter your name between 1 - 100 :"+ randomNumber);
                int playerGuess = scanner.nextInt();
                attempts++;
                score++;

                if(playerGuess == randomNumber){
                    System.out.println("Correct you win !!");
                    break;
                }else if(randomNumber > playerGuess){
                    System.out.println("Too low! try higher number");
                }else {
                    System.out.println("Too high! try lower number");
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();

            if(!playAgainInput.equals("yes")){
                playAgain = false;
            }

        }

        System.out.println("Thanks for playing! Your final score: " + score);
        scanner.close();

    }
}
