public class LargestInArray {
    // Method to find the largest element in the array
    public static int findLargest(int[] arr) {
        if (arr.length == 0) throw new IllegalArgumentException("Array is empty");

        int max = arr[0]; // Assume first element is the largest

        for (int num : arr) {
            if (num > max) {
                max = num; // Update max if current num is greater
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {15, 25, 5, 60, 45};

        // Dry Run:
        // max = 15
        // num=25 → 25 > 15 → max=25
        // num=5 → 5 < 25 → no change
        // num=60 → 60 > 25 → max=60
        // num=45 → 45 < 60 → no change
        // Result: 60

        int largest = findLargest(arr);
        System.out.println("Largest element: " + largest);
    }
}
