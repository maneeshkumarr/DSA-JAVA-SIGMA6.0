// BubbleSort.java
// Java program to perform Bubble Sort with dry run explanation

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 2}; // Initial unsorted array

        int n = arr.length;

        // Bubble Sort Algorithm
        for (int i = 0; i < n - 1; i++) {
            // Each pass moves the largest element to the end
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            // Print the array after each pass (dry run)
            System.out.print("After pass " + (i + 1) + ": ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Final sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


/*Pass 1: [3, 1, 4, 2, 5] → Largest (5) goes to the end
Pass 2: [1, 3, 2, 4, 5]
Pass 3: [1, 2, 3, 4, 5]
Pass 4: [1, 2, 3, 4, 5] → Already sorted
*/