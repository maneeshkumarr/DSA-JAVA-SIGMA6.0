// CheckAnagram.java
// Program to check if two strings are anagrams using Arrays.sort() and Arrays.equals()

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter first String:");
        String str1 = sc.nextLine();
        System.out.println("Enter second String:");
        String str2 = sc.nextLine();

        // Convert both strings to lowercase to make comparison case-insensitive
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Check length first to optimize
        if (str1.length() != str2.length()) {
            System.out.println("Not anagram (lengths are different)");
        } else {
            // Convert to char arrays
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            // Sort both arrays
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Compare sorted arrays
            if (Arrays.equals(arr1, arr2)) {
                System.out.println("Strings are anagram");
            } else {
                System.out.println("Not anagram");
            }
        }

        sc.close();
    }
}
