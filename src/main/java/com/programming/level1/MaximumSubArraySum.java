package com.programming.level1;

public class MaximumSubArraySum {

    //what is MaximumSubArraySum means?
    //In the context of an array of numbers, a subarray is a contiguous sequence of elements. The maximum subArray sum
    // problem involves finding the sum of the contiguous subarray within an array of numbers that has the largest sum.
    // This is often referred to as the "Maximum Subarray Sum" or "Maximum Sum Subarray."
    //The maxSubarraySum method implements Kadane's algorithm to find the maximum subarray sum.

    //What is Kadane's algorithm?
    //Kadane's algorithm efficiently finds the maximum subarray sum in an array by maintaining two variables,
    // maxEndingHere and maxSoFar. It iterates through the array, updating these variables based on the current
    // element and the running sum. The algorithm has a linear time complexity of O(n) and is widely used for its
    // simplicity and effectiveness in solving the maximum subarray sum problem.

    public static void main(String[] args) {
        int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};

        int maxSum = maxSubArraySum(array);

        System.out.println("Maximum SubArray Sum: " + maxSum);
    }

    public static int maxSubArraySum(int[] array) {
        int maxEndingHere = array[0];
        int maxSoFar = array[0];

        for (int i = 1; i < array.length; i++) {
            maxEndingHere = Math.max(array[i], maxEndingHere + array[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}
