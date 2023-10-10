package com.programming.level1;

import java.util.Scanner;

public class PalindromeCheck {
    //A palindrome is a word, sentence, or number which reads same backward and forward. examole: refer
    // this program will check if a string is palindrome or not
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a palindrome string: ");
        String str = scanner.nextLine();
        if(isPalindrome(str)){
            System.out.println( str + " is a palindrome");
        }else{
            System.out.println(str + " is not a palindrome");
        }
        scanner.close();

    }

    //this method will return true if a string is palindrome
    public static boolean isPalindrome(String str){
        //in this line .replaceAll() will replace all the space if there any and
        // .toLowerCase() will make the string lowercase for example if someone input reFer than it should still
        // return this word as a palindrome
        String appropriateString = str.replaceAll("\\s", " ").toLowerCase();

        //I am using two pointers to check if the string is palindrome
        //initializing pointers for start and end of a string
        int start = 0;
        int end = str.length()-1;

        //this while loop will iterate until start is less than the end pointers
        while(start < end){
            //this if condition will check if each character of the given string is different
            //if it is different there is no point of gong further, and it will return false
            if(appropriateString.charAt(start) != appropriateString.charAt(end))
                return false;

                //increment first pointer to go to the next character , and decrementing second pointer to go to the
                //previous character
                start++;
                end--;


        }
        return true;
    }
}
