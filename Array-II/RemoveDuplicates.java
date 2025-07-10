// Problem: Remove Duplicates from Sorted Array
// Source: LeetCode #26
// Approach: Two Pointers (In-place)

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // slow pointer

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1; // length of array without duplicates
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};
        int k = removeDuplicates(nums);

        System.out.println("Length after removing duplicates: " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
