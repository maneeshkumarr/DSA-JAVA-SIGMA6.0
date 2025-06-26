/*
 * Problem: Search a 2D Matrix (LeetCode 74 or 240 depending on constraints)
 * Approach: Brute-force check each element
 * Time Complexity: O(m * n)  → m = rows, n = columns
 * Space Complexity: O(1)     → constant extra space
 */

public class SearchMatrixBrute {

    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {                 // loop over rows
            for (int j = 0; j < matrix[0].length; j++) {          // loop over columns
                if (matrix[i][j] == target) {
                    return true;  // target found
                }
            }
        }
        return false; // target not found
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int target = 16;

        /*
         * Dry Run for target = 16:
         * Row 0: [1, 3, 5, 7] → not found
         * Row 1: [10, 11, 16, 20]
         *    → matrix[1][2] == 16 → found → return true
         */

        boolean found = searchMatrix(matrix, target);
        System.out.println("Is target found? " + found); // Output: true
    }
}
