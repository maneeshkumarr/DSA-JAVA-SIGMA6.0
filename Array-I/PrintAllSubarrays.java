public class PrintAllSubarrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3}; // Sample array

        System.out.println("All subarrays:");

        // Outer loop sets the start index of subarrays
        for (int start = 0; start < arr.length; start++) {
            // Inner loop sets the end index of subarrays
            for (int end = start; end < arr.length; end++) {
                // Loop to print elements from start to end index
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println(); // Move to next line after printing a subarray
            }
        }

        /*
         * Dry Run for arr = {1, 2, 3}
         *
         * Iteration steps:
         * start = 0, end = 0 => [1]
         * start = 0, end = 1 => [1 2]
         * start = 0, end = 2 => [1 2 3]
         * start = 1, end = 1 => [2]
         * start = 1, end = 2 => [2 3]
         * start = 2, end = 2 => [3]
         *
         * Total subarrays = n(n+1)/2 = 3(4)/2 = 6 subarrays
         */
    }
}
