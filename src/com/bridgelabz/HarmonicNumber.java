package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num=sc.nextInt();
            double harmonicNo = 0;
            if (num>0){
                for (int i=1; i<=num; i++) {
                    harmonicNo += (double) 1 / i;
                }
                System.out.println(num+"th harmonic number is "+harmonicNo);
            }
            else
                System.out.println("Invalid number.");
        }
    }
