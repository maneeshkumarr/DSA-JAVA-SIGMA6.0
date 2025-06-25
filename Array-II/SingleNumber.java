public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num; // XOR cancels duplicate numbers
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};

        /*
        Dry Run using XOR:
        Initial result = 0

        → 0 ^ 4 = 4
        → 4 ^ 1 = 5
        → 5 ^ 2 = 7
        → 7 ^ 1 = 6
        → 6 ^ 2 = 4

        ✅ Final result = 4 (the unique element)
        */

        System.out.println("Single Number: " + singleNumber(nums)); // Output: 4
    }
}
