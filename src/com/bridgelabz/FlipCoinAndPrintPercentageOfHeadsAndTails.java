package com.bridgelabz;
import java.util.Scanner;
import java.util.Random;
public class FlipCoinAndPrintPercentageOfHeadsAndTails {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of times to flip the coin: ");
            int numFlips = scanner.nextInt();
            scanner.close();

            if (numFlips <= 0) {
                System.out.println("Number of flips must be a positive integer.");
                return;
            }

            Random random = new Random();
            int numHeads = 0;
            for (int i = 0; i < numFlips; i++) {
                if (random.nextDouble()< 0.5) {
                    System.out.print("Tails ");
                } else {
                    System.out.print("Heads ");
                    numHeads++;
                }
            }

            System.out.println();
            double percentHeads = (double) numHeads / numFlips * 100;
            double percentTails = 100 - percentHeads;
            System.out.printf("Percentage of Heads: %.2f%%\n", percentHeads);
            System.out.printf("Percentage of Tails: %.2f%%\n", percentTails);
        }
    }