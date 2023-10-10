package com.programming.level3;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is a simple calculator!!!");
        while (true) {
            System.out.println("Select your option:" + "\n\t1. Enter + for addition" + "\n\t2. Enter - for subtraction" +
                    "\n\t3. Enter * for multiplication" + "\n\t4. Enter / for division" + "\n\t5. Enter q to quit");
            System.out.println("Enter tour option: ");
            char option = scanner.next().charAt(0);
            if (option == 'q') {
                break;
            }
            if (option != '+' && option != '-' && option != '*' && option != '/' && option != 'q') {
                System.out.println("Invalid operator!!!" + "\nEnter a valid option");
                continue;
            }

            System.out.println("Enter two integer: ");

            System.out.println("Enter first integer: ");
            int firstInteger = scanner.nextInt();

            System.out.println("Enter second integer: ");
            int secondInteger = scanner.nextInt();


            double result = 0.0;
            switch (option) {
                case '+':
                    result = firstInteger + secondInteger;
                    break;
                case '-':
                    if (firstInteger < secondInteger) {
                        result = secondInteger - firstInteger;
                    } else {
                        result = firstInteger - secondInteger;
                    }
                    break;
                case '*':
                    result = firstInteger * secondInteger;
                    break;
                case '/':
                    if (secondInteger != 0) {
                        result = firstInteger / secondInteger;
                    } else {
                        System.out.println("Divisor cannot be zero");
                        continue;
                    }
                default:
                    System.out.println("Error: Invalid operation.");
                    continue;
            }
            System.out.println(result);
        }
        System.out.println("Calculator closed");
    }
}