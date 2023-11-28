package com.programming.level1;
public class RotatedBinarySearch {

    public static void main(String[] args) {
        int[] rotatedArray = {4, 5, 6, 7, 0, 1, 2}; // Example rotated array
        int target = 0; // Target value to search for

        int result = search(rotatedArray, target); // Perform binary search

        // Display the result
        if (result != -1) {
            System.out.println("Target " + target + " found at index " + result);
        } else {
            System.out.println("Target " + target + " not found in the array");
        }
    }

    // Binary search for a target in a rotated sorted array
    public static int search(int[] nums, int target) {
        int low = 0; // Initialize the low index
        int high = nums.length - 1; // Initialize the high index

        // Perform binary search
        while (low <= high) {
            int mid = low + (high - low) / 2; // Calculate the middle index

            if (nums[mid] == target) {
                return mid; // Target found
            }

            // Check which part of the array is sorted
            if (nums[low] <= nums[mid]) { // Left part is sorted
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1; // Search in the left part
                } else {
                    low = mid + 1; // Search in the right part
                }
            } else { // Right part is sorted
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1; // Search in the right part
                } else {
                    high = mid - 1; // Search in the left part
                }
            }
        }

        return -1; // Target not found
    }

}
