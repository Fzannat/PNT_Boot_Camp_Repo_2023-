package com.programming.level3;

import java.util.Scanner;

public class ReverseGivenString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String inputString = scanner.nextLine();
        System.out.println("User Entered: " + inputString);
        System.out.println("Reversed String is: " + reverseAString(inputString));


    }

    public static String reverseAString(String str){
        //StringBuilder class has a .reverse method which can easily reverse a String

        //created a instance of a String builder class
        StringBuilder stringBuilder = new StringBuilder();
        //.append(string) add the character of given "str" into the instance of a StringBuilder class
        stringBuilder.append(str);

        //.reverse() method from StringBuilder class will reverse the string
        // here I want to return a String But I have a StringBuilder instance, so calling .toString() allow me to
        // convert StringBuilder instance into a String
        String reversedString = stringBuilder.reverse().toString();
        return reversedString;
    }
}
