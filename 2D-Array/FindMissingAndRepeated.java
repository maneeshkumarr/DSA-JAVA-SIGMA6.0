public class FindMissingAndRepeated {

    public static int[] findMissingAndRepeatedValues(int[][] grid) {

        int l = grid.length; // l = 2 for a 2x2 grid
        int n = l * l;       // n = 4 (numbers from 1 to 4 should be present)

        int[] countArr = new int[n + 1]; // To count occurrences of each number (1-based indexing)
        int[] result = new int[2];       // result[0] = repeated, result[1] = missing

        // Step 1: Count frequency of each number in the grid
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                countArr[grid[i][j]]++;
            }
        }

        // countArr now holds how many times each number from 1 to n appears
        // Example: for grid = [[1, 2], [2, 3]]
        // countArr = [0, 1, 2, 1, 0] → Index 0 is unused

        // Step 2: Find repeated and missing numbers
        for (int i = 1; i <= n; i++) {
            if (countArr[i] == 2) {
                result[0] = i; // repeated value
            } else if (countArr[i] == 0) {
                result[1] = i; // missing value
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 2},
            {2, 3}
        };

        /*
        Dry Run:
        Grid = [[1, 2], [2, 3]]
        l = 2 → n = 4 → numbers should be 1 to 4

        Counting step:
        - grid[0][0] = 1 → countArr[1]++
        - grid[0][1] = 2 → countArr[2]++
        - grid[1][0] = 2 → countArr[2]++
        - grid[1][1] = 3 → countArr[3]++

        Final countArr = [0, 1, 2, 1, 0]
                        index: 0  1  2  3  4
        → countArr[2] = 2 → repeated = 2
        → countArr[4] = 0 → missing = 4
        */

        int[] res = findMissingAndRepeatedValues(grid);
        System.out.println("Repeated: " + res[0]); // Output: 2
        System.out.println("Missing: " + res[1]);  // Output: 4
    }
}
