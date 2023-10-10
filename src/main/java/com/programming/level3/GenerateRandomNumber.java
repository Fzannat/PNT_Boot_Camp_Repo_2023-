package com.programming.level3;

import java.util.Random;

public class GenerateRandomNumber {
    public static void main(String[] args) {
        Random random = new Random();

        //when using .nextInt(100) will check between 0 to 99
        int randomNumber = random.nextInt(100) + 1;

        System.out.println("Random Number Between 1 to 100 is: " + randomNumber);
    }

}
