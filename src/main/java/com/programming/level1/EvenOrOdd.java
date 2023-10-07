package com.programming.level1;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println();
        verifyEvenOrOdd(number);
    }
    public static void verifyEvenOrOdd(int num){
        if(num%2==0){
            System.out.println(num +" is a even number");
        } else{
            System.out.println(num + " in an odd number");

        }
    }
}
