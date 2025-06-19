// TrappingRainwaterTwoPointer.java

public class TrappingRainwaterTwoPointer {

    public static int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0, water = 0;

        while (left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }

        return water;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Trapped Water = " + trap(height));

        /*
        Dry Run Summary:
        LeftMax and RightMax track the tallest bars from both ends.
        Water is added when the current bar is lower than the max seen so far.
        This avoids needing extra space for arrays.

        Example Flow:
        - left = 0, right = 11
        - compare height[left] and height[right]
        - move the pointer with the smaller height
        - accumulate water by (max so far - current height)
        - total water = 6
        */
    }
}
