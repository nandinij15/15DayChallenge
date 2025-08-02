public class Q53_MaxSubArray {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0;i<n;i++){
            if(sum<0){
                sum = 0;
            }
            sum=sum+nums[i];
            maxsum=Math.max(maxsum,sum);
        }
        return maxsum;
    }
}