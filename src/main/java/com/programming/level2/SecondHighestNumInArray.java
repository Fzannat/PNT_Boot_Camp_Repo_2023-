package com.programming.level2;

import java.util.Random;

public class SecondHighestNumInArray {
    public static void main(String[] args) {

        int size = 10;
        int[] randomArray = createAnArray(size);
        System.out.println("Random array: ");
        for(int number: randomArray ){
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("Second highest number of this array is: " + secondHighestNumberInAnArray(randomArray));

    }

    public static int[] createAnArray(int size){
        // creating an integer Array
        int[] randomArray = new int[size];

        //creating object of random array
        Random random = new Random();

        //this for will iterate and fill an array with a random array
        for(int i = 0; i < size; i++){
            randomArray[i] = random.nextInt(10000);// adding bound is crucial for ths program
                                                         //this will create a random array from 0 to 9999;
        }

        return randomArray;
    }
    public static int secondHighestNumberInAnArray(int[] array){
        //intializing both first and second-highest integers to 0 because my array will be randomly between 0 to 9999
        int firstHighestInteger = 0;
        int secondHighestInteger = 0;

        // this loop iterate through the input array
        for(int num: array){
            //this if statement will check if the number from an array is greater than the first highest number
            if(num > firstHighestInteger){
                // if this condition passed replace second-highest integer to firstHighestInteger
                secondHighestInteger = firstHighestInteger;
                //replace firstHighestInteger to number from the array
                firstHighestInteger = num;


            }else if(num > secondHighestInteger && num != firstHighestInteger){
                secondHighestInteger = num;
            }

        }
        return secondHighestInteger;
    }
}
