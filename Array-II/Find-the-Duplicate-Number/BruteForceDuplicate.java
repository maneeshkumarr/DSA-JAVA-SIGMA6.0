// BruteForceDuplicate.java
public class BruteForceDuplicate {
    public static int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return -1; // as per constraints, this line shouldn't be reached
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println("Duplicate Number: " + findDuplicate(nums));
    }
}
