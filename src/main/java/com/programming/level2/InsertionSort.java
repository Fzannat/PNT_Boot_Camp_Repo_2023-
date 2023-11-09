package com.programming.level2;

import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {

        Random random = new Random();
        int[] randomArray = new int[10];

        for(int i = 0; i <randomArray.length; i++){
            randomArray[i] = random.nextInt(100);
        }

        System.out.println("Before:");
        printArray(randomArray);

        System.out.println();
        insertionSortArray(randomArray);

        System.out.println("After:");
        printArray(randomArray);
    }
    public static void insertionSortArray(int[] randomArray){
        for(int i = 1; i < randomArray.length; i++){
            int currentValue = randomArray[i];

            int j = i - 1;
            while(j>= 0 && randomArray[j] > currentValue){
                randomArray[j+1] = randomArray[j];
                j--;
            }
            randomArray[j+ 1] = currentValue;
        }
    }
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
