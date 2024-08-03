package org.example;

import java.util.Scanner;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Declare scanner
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> distinctNumbers = new ArrayList<>();

        // Read ten numbers from the user
        System.out.println("Enter ten numbers:");
        //Use For Loop
        for (int i = 0; i < 10; i++) {
            int number = input.nextInt();
            if (!distinctNumbers.contains(number)) {
                distinctNumbers.add(number);
            }
        }

        // Display the number of distinct numbers
        System.out.println("Number of distinct numbers: " + distinctNumbers.size());

        // Display the distinct numbers
        System.out.print("Distinct numbers: ");
        for (int num : distinctNumbers) {
            System.out.print(num + " ");
        }

        input.close();
    }
}