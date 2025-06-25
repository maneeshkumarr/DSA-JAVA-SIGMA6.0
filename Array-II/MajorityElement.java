import java.util.*;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int count = 0, candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 2};

        /*
        Dry Run:
        Array: [2, 2, 1, 1, 2]
        Initial: candidate = 0, count = 0

        → num = 2 → count = 0 → candidate = 2, count = 1
        → num = 2 → count = 2
        → num = 1 → count = 1
        → num = 1 → count = 0
        → num = 2 → count = 0 → candidate = 2, count = 1

        ✅ Final candidate = 2 (appears more than n/2 times)
        */

        System.out.println("Majority Element: " + majorityElement(nums)); // Output: 2
    }
}
