package com.programming.level1;

public class AverageOfThreeNumbers {
    public static int count = 3;
    public static void main(String[] args) {
        average(34,56,76);
    }
    public static void average(int a, int b, int c){
        int sum = a + b +c;
        int average = sum / count;
        System.out.println("Average of three number is: " + average);
    }
}
