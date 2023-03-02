package com.bridgelabz;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number from 0 to 30: ");
            int n = input.nextInt();
        System.out.println(n);
            if (n >= 0 && n < 31) {
                for (int i = 0; i <= n; i++) {
                    System.out.println("2^" + i + " = " + (int) Math.pow(2, i));
                }
            } else
                System.out.println("Error! Number should be between 0 and 30");
        }
    }
