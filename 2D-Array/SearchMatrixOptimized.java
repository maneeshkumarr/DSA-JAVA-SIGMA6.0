/*
 * Problem: Search a 2D Matrix (LeetCode 240)
 * Condition: Matrix is sorted in rows (left to right) and columns (top to bottom)
 * Approach: Staircase search from top-right corner
 * Time Complexity: O(m + n) → m = number of rows, n = number of columns
 * Space Complexity: O(1)    → constant space
 */

public class SearchMatrixOptimized {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;  // Start at top-right

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                row++; // move down
            } else {
                col--; // move left
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };
        int target = 14;

        /*
         * Dry Run for target = 14
         * Start at matrix[0][3] = 11 → 14 > 11 → move down
         * matrix[1][3] = 12 → 14 > 12 → move down
         * matrix[2][3] = 16 → 14 < 16 → move left
         * matrix[2][2] = 9  → 14 > 9  → move down
         * matrix[3][2] = 14 → target found → return true
         */

        boolean found = searchMatrix(matrix, target);
        System.out.println("Is target found? " + found); // Output: true
    }
}
