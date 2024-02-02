// Programmers: Chris & Cyrus
// Course:  CS 212
// Date: Jan 1st
// Lab Assignment: 1
// Problem Statement: Generate lottery tickets for players.
// Data In: Player's name
// Data Out: Loterry ticket, prize amount

import java.util.*;
import java.text.*;

class Lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");
        
        int[] winningNumbers = new int[]{3, 5, 16, 58, 59, 11};
        long prize = 225938745L;
        double playAmount, winAmount;
        String customerName;

        System.out.println("CS 212 - Lab 2 \nThis program generates 10 lottery tickets.");
        
        System.out.print("What's your name? ");
        customerName = input.nextLine();

        System.out.print("What's your play amount? $");
        winAmount = playAmount = input.nextDouble();

        System.out.println("Great, " + customerName + " wants to play $" + playAmount);

        System.out.println("Here are the tickets: ");
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 6; j++){
                int rand = (int) (Math.random() * 100);
                if (winningNumbers.contains(rand))
                    winAmount = Math.pow(winAmount, 1.75);
                System.out.print(df.format(rand) + " ");
            }
            System.out.println();
        }
        
        System.out.println("-----------------" +
                           "\n Good luck " + customerName + "!" +
                           "\nPotential winnings: $" + prize +
                           "\nYour winnings: $" + winAmount + 
                           "\n -----------------");
    }
}
