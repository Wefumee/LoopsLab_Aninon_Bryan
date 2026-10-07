/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loopslab;

import java.util.Scanner;

public class LoopsLab {

    public static void main(String[] args) {

//Activtiy: Multiplication table Generator
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=== BASIC MATH APP MENU ===");
            System.out.println("1. Multiplication table generator");
            System.out.println("2. Sum of natural numbers");
            System.out.println("3. Factorial calculator");
            System.out.println("4. Even and Odd numbers");
            System.out.println("5. Reverse digits of a number");
            System.out.println("0. Exit option");

            System.out.println("Enter your choice:");

            while (!input.hasNextInt()) {
                System.out.println("Invalid choice. Try again.");
                input.next();
            }

            choice = input.nextInt();
            switch (choice) {

                //No.1 Multiplication table generator (for loop)                
                case 1 -> {
                    System.out.println("Enter a number");

                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Try again.");
                        input.next();
                    }

                    int num = input.nextInt();
                    int i;

                    System.out.println("Multiplication Table of " + num);
                    for (i = 0; i <= 10; i++) {
                        System.out.println(num + " x " + i + " = " + (num * i));
                    }
                }

                //No.2 Sum of natural numbers (while loop)
                case 2 -> {
                    System.out.println("Enter the number N:");
                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Try again.");
                        input.next();
                    }
                    int N = input.nextInt();

                    if (N < 1) {
                        System.out.println("Error! Number N must be at least 1");
                    } else {
                        int sum = 0;
                        int i = 1;

                        while (i <= N) {
                            sum = sum + i;
                            i++;
                        }
                        System.out.println("Answer:" + sum);
                    }
                }

                //No.3 Factorial calculator (do-while loop)
                case 3 -> {
                    System.out.println("Enter a positive whole number:");
                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Try again.");
                        input.next();
                    }
                    int nfact = input.nextInt();

                    if (nfact < 0) {
                        System.out.println("Error: Factorials are undefined an negative whole numbers.");
                    } else {
                        long factorial = 1;
                        int i = 1;

                        do {
                            factorial = factorial * i;
                            i++;
                        } while (i <= nfact);

                        System.out.println("Factorial:" + factorial);
                    }
                }

                //No.4 Even and Odd numbers (for loop)
                case 4 -> {
                    System.out.println("Enter the number:");
                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Try again.");
                        input.next();
                    }
                    int N = input.nextInt();
                    int i;

                    System.out.println("Even Numbers:");
                    for (i = 1; i <= N; i++) {
                        if (i % 2 == 0) {
                            System.out.println(i + "");
                        }
                    }

                    System.out.println("Odd Numbers:");
                    for (i = 1; i <= N; i++) {
                        if (i % 2 != 0) {
                            System.out.println(i + "");
                        }
                    }
                }

                //No.5 Reverse digits of a number (while loop)
                case 5 -> {
                    System.out.println("Enter the number you want in reversed:");
                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Try again.");
                        input.next();
                    }
                    int numb = input.nextInt();
                    int reversed = 0;

                    while (numb != 0) {
                        int lastdigit = numb % 10;
                        reversed = reversed * 10 + lastdigit;
                        numb /= 10;
                    }
                    System.out.println("Reversed:" + reversed);
                }

                //Exit option
                case 0 -> {
                    System.out.println("Thank you for using this math app.");
                    System.out.println("Wishing you a great day ahead!");
                }

                default -> {
                    System.out.println("Invalid choice.");
                }

            }
        } while (choice != 0);
        input.close();

    }

}
