package com.programming.level2;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        Random random = new Random();
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = random.nextInt(1000);
        }
        System.out.println("Before: " + Arrays.toString(intArray));
        selectionSort(intArray);
        System.out.println("After: " + Arrays.toString(intArray));
    }

    private static void selectionSort(int[] numArray) {

        int length = numArray.length;

        for(int i = 0; i <length-1; i++){
            int minArray = numArray[i];
            int indexOfMin = i;

            for(int j =  i+1; j<length; j++ ){
                if(numArray[j] < minArray){
                    minArray = numArray[j];
                    indexOfMin = j;
                }
            }
            swap(numArray, i, indexOfMin);
        }
    }

    private static void swap(int[] numArray, int a, int b) {
        int tempValue = numArray[a];
        numArray[a] = numArray[b];
        numArray[b] = tempValue;
    }
}
