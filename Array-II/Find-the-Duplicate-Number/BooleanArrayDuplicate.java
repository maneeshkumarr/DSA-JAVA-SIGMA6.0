// BooleanArrayDuplicate.java
public class BooleanArrayDuplicate {
    public static int findDuplicate(int[] nums) {
        boolean[] visited = new boolean[nums.length + 1];
        for (int num : nums) {
            if (visited[num]) {
                return num;
            }
            visited[num] = true;
        }
        return -1; // this line should not be reached
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println("Duplicate Number: " + findDuplicate(nums));
    }
}
