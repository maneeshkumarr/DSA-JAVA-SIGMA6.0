import java.util.*;

public class LargestString {
    public static void main(String[] args) {
        // Sample input
        String[] words = {"apple", "banana", "pineapple", "grape", "strawberry"};

        String largest = findLargestString(words);
        System.out.println("The largest string is: " + largest);
    }

    public static String findLargestString(String[] arr) {
        String largest = "";

        for (String word : arr) {
            if (word.length() > largest.length()) {
                largest = word;
            }
        }

        return largest;
    }
}
