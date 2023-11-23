package com.programming.level1;

import java.util.Scanner;

public class LongestCommonSubsequenceWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first word: ");
        String firstString = scanner.nextLine();
        System.out.println("Enter second Word:");
        String secondString = scanner.nextLine();

        int lengthOfLongestCommonSequence = findLCSLength(firstString, secondString);
        String longestCommonSubsequence = findLCS(firstString, secondString);

        System.out.println("Length of Longest Common Subsequence: " + lengthOfLongestCommonSequence);
        System.out.println("Longest Common Subsequence: " + longestCommonSubsequence);


    }

    // Function to find the length of the Longest Common Subsequence
    public static int findLCSLength(String str1, String str2) {
        //this two local variable will take the user inputted two string and find the length of those string and store t
        //local variable can only be accesses in side the code block it was declared
        int m = str1.length();
        int n = str2.length();
        //This line declares a 2D array length to store the lengths of common subsequences of substrings.
        // The array has dimensions (m + 1) x (n + 1) to accommodate the empty string and substrings of str1 and str2.
        int[][] length = new int[m + 1][n + 1];

        // Building the lengths table in a bottom-up manner
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    length[i][j] = 1 + length[i - 1][j - 1];
                } else {
                    length[i][j] = Math.max(length[i - 1][j], length[i][j - 1]);
                }
            }
        }

        return length[m][n];
    }

    // Function to find the Longest Common Subsequence
    public static String findLCS(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        int[][] length = new int[m + 1][n + 1];

        // Building the dp table in a bottom-up manner
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    length[i][j] = 1 + length[i - 1][j - 1];
                } else {
                   length[i][j] = Math.max(length[i - 1][j], length[i][j - 1]);
                }
            }
        }

        // Reconstructing the Longest Common Subsequence
        int i = m, j = n;
        StringBuilder lcs = new StringBuilder();

        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                lcs.insert(0, str1.charAt(i - 1));
                i--;
                j--;
            } else if (length[i - 1][j] > length[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        return lcs.toString();
    }

}
