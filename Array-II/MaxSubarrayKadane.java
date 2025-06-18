// Problem: Find the maximum subarray sum using Kadane's Algorithm.

public class MaxSubarrayKadane {

    // Function to calculate max subarray sum
    public static int maxSubarraySum(int[] arr) {
        int maxSoFar = arr[0]; // Holds the result
        int currMax = arr[0];  // Holds max sum ending at current index

        for (int i = 1; i < arr.length; i++) {
            // Either extend the previous subarray or start a new one
            currMax = Math.max(arr[i], currMax + arr[i]);

            // Update global max if needed
            maxSoFar = Math.max(maxSoFar, currMax);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        // Example input
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Output resultt
        System.out.println("Maximum Subarray Sum: " + maxSubarraySum(arr));
    }
}

/*
================ DRY RUN ================

Input Array: [-2, 1, -3, 4, -1, 2, 1, -5, 4]

Initialize:
currMax = maxSoFar = -2

i = 1 → arr[i] = 1
currMax = max(1, -2 + 1) = 1
maxSoFar = max(-2, 1) = 1

i = 2 → arr[i] = -3
currMax = max(-3, 1 + (-3)) = -2
maxSoFar = max(1, -2) = 1

i = 3 → arr[i] = 4
currMax = max(4, -2 + 4) = 4
maxSoFar = max(1, 4) = 4

i = 4 → arr[i] = -1
currMax = max(-1, 4 + (-1)) = 3
maxSoFar = max(4, 3) = 4

i = 5 → arr[i] = 2
currMax = max(2, 3 + 2) = 5
maxSoFar = max(4, 5) = 5

i = 6 → arr[i] = 1
currMax = max(1, 5 + 1) = 6
maxSoFar = max(5, 6) = 6

i = 7 → arr[i] = -5
currMax = max(-5, 6 + (-5)) = 1
maxSoFar = max(6, 1) = 6

i = 8 → arr[i] = 4
currMax = max(4, 1 + 4) = 5
maxSoFar = max(6, 5) = 6

Answer: Maximum Subarray Sum = 6

*/
