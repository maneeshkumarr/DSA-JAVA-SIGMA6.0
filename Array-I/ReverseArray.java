public class ReverseArray {

    // Method to reverse the array in-place
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Original array: ");
        printArray(arr);

        // Dry Run:
        // Step 1: start=0, end=4 → swap 10 and 50 → [50, 20, 30, 40, 10]
        // Step 2: start=1, end=3 → swap 20 and 40 → [50, 40, 30, 20, 10]
        // Step 3: start=2, end=2 → stop (middle reached)
        // Final array: [50, 40, 30, 20, 10]

        reverseArray(arr);

        System.out.print("Reversed array: ");
        printArray(arr);
    }
}
