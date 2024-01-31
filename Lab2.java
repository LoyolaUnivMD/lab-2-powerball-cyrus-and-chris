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
        DecimalFormat df = new DecimalFormat("00");
        Scanner input = new Scanner(System.in);

        long prize = 225938745L;

        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");
        
        System.out.print("What's your name? ");
        String customerName = input.nextLine();

        System.out.println("Here is the ticket: ");
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 6; j++){
                String rand = df.format((int) (Math.random() * 100));
                System.out.print(rand + " ");
            }
            System.out.println();
        }
        
        System.out.println("-----------------\n Good luck " + customerName + "!\n Estimated Jackpot:\n $" + prize + "\n -----------------");
    }
}
