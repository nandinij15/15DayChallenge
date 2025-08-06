package Day5;

public class Q3_TrippingWater {
     public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left]; // update left boundary
                } else {
                    water += leftMax - height[left]; // trap water
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right]; // update right boundary
                } else {
                    water += rightMax - height[right]; // trap water
                }
                right--;
            }
        }

        return water;
    }
}
