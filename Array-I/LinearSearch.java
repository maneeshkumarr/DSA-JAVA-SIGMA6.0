public class LinearSearch {
    // Method to perform linear search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            // Compare each element with the target
            if (arr[i] == target) return i; // return index if found
        }
        return -1; // return -1 if not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;

        // Dry Run:
        // i=0 → arr[0]=10 ≠ 30
        // i=1 → arr[1]=20 ≠ 30
        // i=2 → arr[2]=30 == 30 → Found at index 2

        int index = linearSearch(arr, target);

        if (index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found");
    }
}
