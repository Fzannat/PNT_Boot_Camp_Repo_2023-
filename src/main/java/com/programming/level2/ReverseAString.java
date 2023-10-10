package com.programming.level2;

public class ReverseAString {
    public static void main(String[] args) {

        String inputString = "Fatema";
        System.out.println("Original string is " + inputString);
        System.out.println("Reversed String is " + reverseString(inputString));

    }
    public static String reverseString(String str){

        //saving the character of input string in an array
        char[] originalChars = str.toCharArray();
        //saving the length of originalChars array in a local variable
        int length = originalChars.length;
        //creating another char array to store the character of reversed array
        char[] reverseCharArray = new char[length];

        //for loop will iterate through the character of the input string in reverse order
        for(int i = 0; i< length; i++){
            reverseCharArray[i] = originalChars[length-1-i];
        }

        String reversedString = new String(reverseCharArray);
        return reversedString;
    }

}
