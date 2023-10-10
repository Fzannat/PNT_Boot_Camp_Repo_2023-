package com.programming.level2;

import java.util.Scanner;

public class StringPalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        if(isPalindrome(inputString)){
            System.out.println(inputString + " is a palindrome number");
        } else {
            System.out.println(inputString + " is not a palindrome number");
        }
        scanner.close();

    }
    public static boolean isPalindrome(String str){
        String cleanedString = str.replaceAll("\\s", "");
        boolean isTheInputStringPalindrome = checkPalindromeWithRecursion(cleanedString, 0, cleanedString.length()-1);
        if(isTheInputStringPalindrome){
            return true;
        }
        return false;
    }

    private static boolean checkPalindromeWithRecursion(String str, int left, int right){
        //here argument left represent the index 0 of a string and right represent the last index character of the input string
        if(left>=right){// base case added If we have compared all characters, it's a palindrome.
            return true;
        }
        if(str.charAt(left) != str.charAt(right)){
            return false;
        }
        boolean isStringAPalindrome = checkPalindromeWithRecursion(str, left+1, right-1);
        return isStringAPalindrome;

    }
}
