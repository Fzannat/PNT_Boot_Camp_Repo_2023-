package com.programming.level1;

import java.util.Arrays;
import java.util.Random;


/*what is quickSort?
quick sort work as  it finds a random pivot from an array and do the partitioning by putting all the number which is less
than the pivot left side of the pivot and all the number which are greater than the pivot puts right side of the pivot
* */
public class QuickSort {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(100);
        }
        System.out.println("Before");
        printAnArray(numbers);

        quickSort(numbers);

        System.out.println("After");
        printAnArray(numbers);
    }
    //what is method overriding?
    //method overriding is that method has same name but different parameters

    private static void quickSort(int[] array){
        quickSort(array, 0, array.length -1);
    }
    private static void quickSort(int[] numbersArray, int lowIndex, int highIndex) {
        if(lowIndex >= highIndex){
            return;
        }
        int pivotIndex =new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = numbersArray[pivotIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while(leftPointer < rightPointer){//this while will run until left pointer is greater than the rightPointer

            while (numbersArray[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while(numbersArray[rightPointer] >= pivot && rightPointer > leftPointer){
                rightPointer--;
            }
            swap(numbersArray, leftPointer, rightPointer);

        }
        swap(numbersArray, leftPointer, highIndex);
        quickSort(numbersArray, lowIndex, leftPointer-1);
        quickSort(numbersArray, leftPointer+1, highIndex);
    }


    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    private static void printAnArray(int[] array) {
        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
