import java.util.*;

public class SingleNumberXOR {
    public static int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num; // XOR operation
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println("Single Number is: " + singleNumber(nums));
    }
}


/*
Input: [4, 1, 2, 1, 2]
Step-by-step XOR:
result = 0
result = 0 ^ 4 = 4
result = 4 ^ 1 = 5
result = 5 ^ 2 = 7
result = 7 ^ 1 = 6
result = 6 ^ 2 = 4

Final result: 4
 */