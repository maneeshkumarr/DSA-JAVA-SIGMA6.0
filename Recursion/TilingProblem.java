package Recursion;

// Problem: Tiling Problem - Count the number of ways to tile a 2 x N board using 2 x 1 tiles
// Source: GeeksforGeeks
// Approach: Simple Recursion

public class TilingProblem {

    // Function to count the number of ways to tile a 2 x n board
    public static int countWays(int n) {
        // Base Cases
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recurrence Relation: place tile vertically or horizontally
        return countWays(n - 1) + countWays(n - 2);
    }

    public static void main(String[] args) {
        int n = 4; // Change this value to test different inputs
        System.out.println("Number of ways to tile 2 x " + n + " board: " + countWays(n));
    }
}
