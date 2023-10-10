package com.programming.level2;

import java.util.Scanner;

public class NumberPalindromeCheck {
    //A palindrome is a word, sentence, or number which reads same backward and forward. example: 121
    // this program will check if a number is palindrome or not
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int inputNumber = scanner.nextInt();
        if(isPalindrome(inputNumber)){
            System.out.println(inputNumber + " is a palindrome number");
        } else {
            System.out.println(inputNumber + " is not a palindrome number");
        }
        scanner.close();
    }
    public static boolean isPalindrome(int number){
        int originalNumber = number; // saving the original number in this local variable so that when we reverse it doesnot changes
        int reverseNumber = 0;// initializing reverseNumber variable to store the reversed number

        while(number > 0){ // this while loop will iterate until the condition is true
            int temp = number % 10; // initializing a temporary variable to store the last digit of input number
            reverseNumber = (reverseNumber*10)  + temp; // reverse number will multiply with number 10 and temp value will be added
            number /= 10; // dividing the number by 10 to remove the last digit of input number
        }
        //this if statement will check if the original number and reversed number is same
        //if it is same it will return true else it will return false
        if(originalNumber == reverseNumber){
            return true;
        }else{
            return false;
        }

    }
}
