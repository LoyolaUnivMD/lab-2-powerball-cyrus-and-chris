// Programmers:  [your names here]
// Course:  CS 212
// Due Date:
// Lab Assignment:
// Problem Statement:
// Data In:
// Data Out:
// Credits: [Is your code based on an example in the book, in class, or something else?
//            Reminder: you should never take code from the Internet or another person

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

        System.out.print("Here is the ticket:");
        for (int i = 1: i <= 10; i++){
            for (int j = 1; i <= 6; j++){
                String rand = df.format((int) (Math.random() * 100));
                System.out.print(rand);
            }
            System.out.println();
        }
        
        System.out.println("-----------------\n Good luck Steve!\n Estimated Jackpot:\n $" + prize + "\n -----------------");
    }
}
