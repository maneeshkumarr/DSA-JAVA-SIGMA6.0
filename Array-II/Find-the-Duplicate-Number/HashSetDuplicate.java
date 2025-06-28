// HashSetDuplicate.java
import java.util.HashSet;
import java.util.Set;

public class HashSetDuplicate {
    public static int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) {
                return num;
            }
        }
        return -1; // this line is never expected to run
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println("Duplicate Number: " + findDuplicate(nums));
    }
}
