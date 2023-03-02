package com.bridgelabz;

import java.util.Scanner;
    public class TwoDimentionalArray {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter rows and columns for 2D array: ");
            int row= input.nextInt();
            int column= input.nextInt();
            int arr[][] = new int[row][column];
            System.out.println("Enter " + row * column + " elements of array: ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    arr[i][j] = input.nextInt();
                }
            }
            System.out.println("The 2D array values are ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }