// TrappingRainwaterPrefixSuffix.java

public class TrappingRainwaterPrefixSuffix {

    public static int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Fill left max
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // Fill right max
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        // Calculate trapped water
        int water = 0;
        for (int i = 0; i < n; i++) {
            water += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return water;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Trapped Water = " + trap(height));

        /*
        Dry Run for height = [0,1,0,2,1,0,1,3,2,1,2,1]
        leftMax:  [0,1,1,2,2,2,2,3,3,3,3,3]
        rightMax: [3,3,3,3,3,3,3,3,2,2,2,1]
        min(left,right): [0,1,1,2,2,2,2,3,2,2,2,1]
        trapped: [0,0,1,0,1,2,1,0,0,1,0,0]
        total: 6
        */
    }
}
