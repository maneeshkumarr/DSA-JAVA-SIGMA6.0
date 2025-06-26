/*
 * Problem: Matrix Diagonal Sum (LeetCode 1572)
 * Approach 2: Single pass using one index.
 * Time Complexity: O(n)     (one visit per row)
 * Space Complexity: O(1)    (constant extra space)
 */
public class DiagonalSumOptimized {

    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += mat[i][i];               // primary
            if (i != n - 1 - i) {           // avoid double-count center
                sum += mat[i][n - 1 - i];   // secondary
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        /*
         * Dry Run ───────────
         * i=0: sum=1 +3 =4
         * i=1: sum+=5        =9   (center element counted once)
         * i=2: sum+=9 +7     =25
         */
        System.out.println("Diagonal Sum (Optimized) = " + diagonalSum(mat)); // 25
    }
}
