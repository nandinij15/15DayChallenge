public class Q2_Leetcode_167 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left, right}; // or {left + 1, right + 1} if 1-based
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{}; 
    }
}
