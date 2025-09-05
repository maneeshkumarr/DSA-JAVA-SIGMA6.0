package Challenge;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test case for debugging
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);
        
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a map to store the complement and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Debugging: Print current value and its complement
            System.out.println("Checking: " + nums[i] + ", complement: " + complement);
            
            if (map.containsKey(complement)) {
                // Found solution, return indices
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        
        // Return empty array if no solution is found
        return new int[0];
    }
}


//hello world



