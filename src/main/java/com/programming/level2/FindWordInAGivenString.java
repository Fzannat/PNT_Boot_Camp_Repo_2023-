package com.programming.level2;

import java.util.Scanner;

public class FindWordInAGivenString {
    public static void main(String[] args) {

        System.out.println("Enter a sentence: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println("Words found in user input string is: " + wordsInAInputString(userInput));


    }

    private static int wordsInAInputString(String inputString){
        if(inputString == null || inputString.isEmpty()){
            return 0;
        }

        String[] words = inputString.split("\\s");
        return words.length;
    }
}
