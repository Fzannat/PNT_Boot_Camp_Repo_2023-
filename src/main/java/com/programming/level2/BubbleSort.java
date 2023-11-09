package com.programming.level2;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {

        int[] numArray = new int[10];
        Random random = new Random();
        for (int i = 0; i <numArray.length; i++){
            numArray[i] = random.nextInt(1000);
        }
        System.out.println("Before: " + Arrays.toString(numArray));
        bubbleSort(numArray);
        System.out.println("After: " + Arrays.toString(numArray));


    }

    private static void bubbleSort(int[] numArray) {
        boolean swapInteger = true;

        while (swapInteger) {
            swapInteger = false;
            for (int i = 0; i < numArray.length - 1; i++) {
                if (numArray[i] > numArray[i + 1]) {
                    swapInteger = true;
                    int temp = numArray[i];
                    numArray[i] = numArray[i + 1];
                    numArray[i + 1] = temp;
                }
            }
        }
    }
}
