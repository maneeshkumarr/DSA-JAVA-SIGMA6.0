// Problem: Find the maximum subarray sum using Prefix Sum approach.

public class MaxSubarrayPrefixsum {

    // Function to calculate max subarray sum
    public static int maxSubarraySum(int[] arr) {
        int n = arr.length;

        // Step 1: Build the prefix sum array
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        int maxSum = arr[0];

        // Step 2: Try all subarrays and find the one with the maximum sum
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int currSum = i == 0 ? prefixSum[j] : prefixSum[j] - prefixSum[i - 1];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        // Example input
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Output result
        System.out.println("Maximum Subarray Sum: " + maxSubarraySum(arr));
    }
}

/*
================ DRY RUN ================

Input Array: [-2, 1, -3, 4, -1, 2, 1, -5, 4]

Step 1: Build Prefix Sum:
prefixSum[0] = -2
prefixSum[1] = -1  (prefixSum[0] + arr[1] = -2 + 1)
prefixSum[2] = -4  (prefixSum[1] + arr[2] = -1 + (-3))
prefixSum[3] = 0   (prefixSum[2] + arr[3] = -4 + 4)
prefixSum[4] = -1
prefixSum[5] = 1
prefixSum[6] = 2
prefixSum[7] = -3
prefixSum[8] = 1

Step 2: Try all subarrays (i to j):
- When i = 3, j = 6 → subarray = [4, -1, 2, 1]
  → prefixSum[6] - prefixSum[2] = 2 - (-4) = 6 → maxSum = 6

Answer: Maximum Subarray Sum = 6

*/
