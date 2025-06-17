import java.util.Arrays;

public class BinarySearch {
    // Method to perform binary search (array must be sorted)
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 20, 30, 40, 50};
        int target = 30;

        // Dry Run:
        // left=0, right=5 → mid=2 → arr[2]=20 < 30 → left = 3
        // left=3, right=5 → mid=4 → arr[4]=40 > 30 → right = 3
        // left=3, right=3 → mid=3 → arr[3]=30 == target → Found at index 3

        int index = binarySearch(arr, target);

        if (index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found");
    }
}
