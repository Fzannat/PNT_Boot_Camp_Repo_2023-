package com.programming.level2;

import java.util.Arrays;

public class BinarySearch {
    //I have used binary search to find an integer in an sorted array
    public static void main(String[] args) {
        int[] intArray = {1,4,2,7,8,5,20}; // here I have created an array
        insertionSortArray(intArray); // I have sorted My array with insertion sort
        System.out.println(Arrays.toString(intArray));

        System.out.println("Number found in Index of: " + binarySearch(intArray, 20));


    }
    // this my binary search method
    // in binary search what we do is we take two pointer of an array which represent beginning and one less than last
    // index of an array and find the middle pointer of that sorted array and compare that with the number we need to find
    private static int binarySearch(int[] sortedArray, int numToFind){
       int lowPointer = 0;
       int highPointer = sortedArray.length -1;
       while (lowPointer <= highPointer){
           int middleIndex = (lowPointer + highPointer) / 2;
           int middleNum = sortedArray[middleIndex];
           if(sortedArray[middleIndex] == numToFind){
               return middleIndex;
           }
           if(numToFind < middleNum){
               highPointer = middleIndex -1;
           }else{
               lowPointer = middleIndex + 1;
           }
       }
       return -1;

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
}
