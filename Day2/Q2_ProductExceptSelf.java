package Day2;

import java.util.Arrays;

public class Q2_ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int zc = 0;
        
        for(int e: nums){
            if(e == 0){
                zc++;
            } else {
                prod *= e;
            }
        }

        if(zc > 1){
            Arrays.fill(nums, 0);
        }
        if(zc == 1){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] != 0){
                    nums[i] = 0;
                } else {
                    nums[i] = prod;
                }
            }
        }
        if(zc == 0){
            for(int i = 0; i < nums.length; i++){
                nums[i] = prod / nums[i];
            }
        }
        return nums;
    }
}
