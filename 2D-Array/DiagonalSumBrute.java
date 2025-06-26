/*
 * Problem: Matrix Diagonal Sum (LeetCode 1572)
 * Approach 1: Double-loop over every cell.
 * Time Complexity: O(n^2)   (visit all n×n elements)
 * Space Complexity: O(1)    (constant extra space)
 */
public class DiagonalSumBrute {

    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int psum = 0;   // primary diagonal
        int ssum = 0;   // secondary diagonal

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                // 1×1 quick-return guard
                if (n == 1) return mat[0][0];

                if (i == j) {                // primary diagonal
                    psum += mat[i][j];
                } else if (i + j == n - 1) { // secondary diagonal
                    ssum += mat[i][j];
                }
            }
        }
        return psum + ssum;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        /*
         * Dry Run ───────────
         * i=0 j=0  → i==j       → psum = 1
         *      j=2  → i+j==2    → ssum = 3
         * i=1 j=1  → i==j       → psum = 6
         * i=2 j=0  → i+j==2    → ssum = 10
         *      j=2  → i==j       → psum = 15
         * Return psum+ssum = 15+10 = 25
         */
        System.out.println("Diagonal Sum (Brute) = " + diagonalSum(mat)); // 25
    }
}
