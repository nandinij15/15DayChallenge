package Day7;

import java.util.Stack;

public class Q1_Leetcode_456 {
    public boolean find132pattern(int[] nums) {
    int n = nums.length;
    int third = Integer.MIN_VALUE;
    Stack<Integer> stack = new Stack<>();

    for (int i = n - 1; i >= 0; i--) {
        if (nums[i] < third) return true;
        while (!stack.isEmpty() && nums[i] > stack.peek()) {
            third = stack.pop();  // candidate for nums[k]
        }
        stack.push(nums[i]);
    }
    return false;
    }
}
