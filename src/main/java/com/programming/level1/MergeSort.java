package com.programming.level1;

import java.util.Arrays;
import java.util.Random;
//define merge sort?
//if there is a random array, Merge Sort is a popular comparison-based sorting algorithm that follows the
// divide-and-conquer paradigm. first you divide the array and conquer the array and than merge them into a single array
//in orderly manner
public class MergeSort {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(100);
        }
        System.out.println("Before");
        printAnArray(numbers);

        mergeSort(numbers);

        System.out.println("After");
        printAnArray(numbers);
    }

    private static void mergeSort(int[] array) {
        //finding out the length of @param array is important because it will be used in future lines
        int lengthOfArray = array.length;
        if(lengthOfArray < 2){ //if length of an array is less than 2, it means there are only one element in that array
            return;            // it means just return the element
        }
        int midIndex = lengthOfArray / 2;// finding out the middle index to divide the @param array in two separate array
        int[] leftArray = new int[midIndex];//creating an integer which
        int[] rightArray = new int[lengthOfArray -midIndex];//length of this array is very important
        //populating both array from the given array
        for(int i = 0; i < midIndex; i++){
            leftArray[i] = array[i];

        }
        //right array indexing is starts from the middle Index, so when populating it should exclude element of leftArray
        for(int i = midIndex; i< lengthOfArray; i++){
            rightArray[i - midIndex] = array[i];

        }
        //calling the recursive method to farther divide the arrays and sort them
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(array, leftArray, rightArray);

    }
    //after dividing we need to conquer them by merging them
    private static void merge(int[] inputArray, int[] leftHalfArray, int[] rightHalfArray){
        int leftArraySize = leftHalfArray.length;
        int rightHalfSize = rightHalfArray.length;
        int  i = 0, j = 0, k = 0;

        while(i < leftArraySize && j < rightHalfSize){
            if(leftHalfArray[i] <= rightHalfArray[j]){
                inputArray[k] = leftHalfArray[i];
                i++;
            }else{
                inputArray[k] = rightHalfArray[j];
                j++;
            }
            k++;
        }
        while (i < leftArraySize){
            inputArray[k] = leftHalfArray[i];
            i++;
            k++;
        }

        while (j < rightHalfSize){
            inputArray[k] = rightHalfArray[j];
            j++;
            k++;
        }
    }

    private static void printAnArray(int[] array) {
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }


}
