// ReverseString.java
// Problem: Reverse a string
// Method: Two-pointer approach

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Convert to character array
        char[] arr = input.toCharArray();

        // Two-pointer approach to reverse
        int left = 0, right = arr.length - 1;
        while (left < right) {
            // swap characters
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        // Print reversed string
        System.out.println("Reversed string: " + new String(arr));
    }
}


/*

Initial:  ['h','e','l','l','o']
left = 0, right = 4 → swap 'h' and 'o' → ['o','e','l','l','h']
left = 1, right = 3 → swap 'e' and 'l' → ['o','l','l','e','h']
left = 2, right = 2 → stop

Output: "olleh"

 */