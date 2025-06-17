// File: MaxSubarrayBruteForce.java

public class MaxSubarrayBruteForce {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -1}; // Sample input array
        int maxSum = Integer.MIN_VALUE;

        // Try all possible subarrays
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                int sum = 0;

                // Calculate sum of subarray from start to end
                for (int k = start; k <= end; k++) {
                    sum += arr[k];
                }

                // 🔎 Dry Run Print: Print current subarray and its sum
                System.out.print("Subarray: ");
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println("=> Sum = " + sum);

                // Check and update maxSum if needed
                if (sum > maxSum) {
                    System.out.println("New maxSum found: " + sum);
                    maxSum = sum;
                }
            }
        }

        // ✅ Final result
        System.out.println("\nMaximum Subarray Sum = " + maxSum);
    }
}




/*Sample_output*/

/*
Subarray: 1 => Sum = 1
New maxSum found: 1
Subarray: 1 -2 => Sum = -1
Subarray: 1 -2 3 => Sum = 2
New maxSum found: 2
Subarray: 1 -2 3 4 => Sum = 6
New maxSum found: 6
Subarray: 1 -2 3 4 -1 => Sum = 5
Subarray: -2 => Sum = -2
Subarray: -2 3 => Sum = 1
Subarray: -2 3 4 => Sum = 5
Subarray: -2 3 4 -1 => Sum = 4
Subarray: 3 => Sum = 3
Subarray: 3 4 => Sum = 7
New maxSum found: 7
Subarray: 3 4 -1 => Sum = 6
Subarray: 4 => Sum = 4
Subarray: 4 -1 => Sum = 3
Subarray: -1 => Sum = -1

Maximum Subarray Sum = 7
 
 */