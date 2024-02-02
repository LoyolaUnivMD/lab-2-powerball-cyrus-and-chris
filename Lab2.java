// Programmers: Chris & Cyrus
// Course:  CS 212
// Date: Jan 1st
// Lab Assignment: 1
// Problem Statement: Generate lottery tickets for players.
// Data In: Player's name
// Data Out: Lottery ticket, prize amount

import java.util.*;
import java.text.*;

class Lab2 {
    public static void main(String[] args) {
        // Helpful objects.
        Scanner input = new Scanner(System.in);
        DecimalFormat twoCharFormat = new DecimalFormat("00");
        DecimalFormat commaFormat = new DecimalFormat("#,###");

        // Declaring and initializing variables.
        List<Integer> winningNumbers = new ArrayList<>(List.of(3, 5, 16, 58, 59, 11));
        long prizePool = 225938745L;
        double playAmount, winAmount;
        String customerName;

        System.out.println("-----------------\nCS212 - Lab 2 \nThis program generates 10 lottery tickets.\n-----------------");
        
        System.out.print("What's your name? ");
        customerName = input.nextLine();

        System.out.print("What's your play amount? $");
        winAmount = playAmount = input.nextDouble();

        // Generating tickets and updating the winning amount on hits.
        System.out.println("Here are the tickets: \n-----------------");
        int hits = 0;
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 6; j++){
                int rand = (int) (Math.random() * 100);
                if (winningNumbers.contains(rand)) {
                    winAmount = Math.pow(winAmount, 1.75);
                    hits++;
                }
                System.out.print(twoCharFormat.format(rand) + " ");
            }
            System.out.println();
        }

        // Setting a ceiling for winnings based on prize pool.
        winAmount = (winAmount > prizePool)? prizePool : Math.round(winAmount);

        // Results.
        System.out.println("-----------------" +
                           "\nGood luck " + customerName + "!" +
                           "\n-----------------" +
                           "\nYou played: $" + commaFormat.format(playAmount) +
                           "\nPrize pool: $" + commaFormat.format(prizePool) +
                           "\nYour winnings: $" + commaFormat.format(winAmount) + " (" + hits + " hits)" +
                           "\n-----------------");
    }
}
