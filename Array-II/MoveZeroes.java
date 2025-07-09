// File: MoveZeroes.java
// Author: Maneesh Kumar
// Date: 2025-07-09
// Description: Optimized in-place solution for "Move Zeroes to End" problem
// Commit Message: "Added optimized in-place solution for moving zeroes to end with dry run explanation"

public class MoveZeroes {
    // Optimized function to move all 0's to the end of array in-place
    public static void moveZeroes(int[] nums) {
        int j = 0; // Position to place the next non-zero number

        // First pass: move all non-zero values to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

        // Second pass: fill remaining elements with 0
        while (j < nums.length) {
            nums[j++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        System.out.println("Before:");
        printArray(nums);

        moveZeroes(nums);

        System.out.println("\nAfter:");
        printArray(nums);

        /*
        🔍 Dry Run:
        Input: [0, 1, 0, 3, 12]
        Step 1: Move non-zeroes
            i = 0: 0 → skip
            i = 1: 1 → nums[0] = 1
            i = 2: 0 → skip
            i = 3: 3 → nums[1] = 3
            i = 4: 12 → nums[2] = 12

        Array now looks like: [1, 3, 12, 3, 12]
        Step 2: Fill zeroes from j=3
            nums[3] = 0
            nums[4] = 0

        Final output: [1, 3, 12, 0, 0]
        */
    }

    // Utility function to print array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
