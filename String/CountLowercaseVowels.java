// CountLowercaseVowels.java
// Program to count the number of lowercase vowels in a given string
// Written in Java with Scanner input and for-each loop

import java.util.Scanner;

public class CountLowercaseVowels {
    public static void main(String[] args) {
        // Prompt the user to enter a string
        System.out.println("Enter a String:");

        // Scanner for user input
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // Read the full line
        int count = 0; // To store number of vowels

        // Loop through each character in the string using for-each loop
        for (char ch : str.toCharArray()) {
            // Check if the character is a lowercase vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        // Display the result
        System.out.println("Total number of lowercase vowels: " + count);
        
        sc.close(); // Close the scanner
    }
}
