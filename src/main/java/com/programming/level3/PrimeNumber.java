package com.programming.level3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println();
        if(primeCheck(number)){
            System.out.println(number + " is a prime number");
        }else{
            System.out.println(number + " is not a prime number");
        }

    }
    public static boolean primeCheck(int num){
        if(num <= 1){
          return false;
       }
        for(int i = 2; i <= Math.sqrt(num); i++){
                if(num % i == 0){
                    return false;
                }
            }
        return true;
    }
}
