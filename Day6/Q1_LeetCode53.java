public class Q1_LeetCode53 {
    public int searchInsert(int[] nums, int target) {

        if(nums.length == 1){
            if(target < nums[0] || target == nums[0]){
                return 0;
            }else if(target > nums[0]){
                return 1;
            }
        }

        int l = 0;
        int h = nums.length - 1;
        int re = -1;
        while(l<=h){
            int m = l + (h-l)/2;
            if(target == nums[m]){
                re = m;
                break;
            }else if(target > nums[m]){
                l = m + 1;
            }else if(target < nums[m]){
                h = m - 1;
            }
            if(l > h){
                re = l;
                break;
            }
            if(l == h){
                if(target > nums[l]){
                    re = (l+1);
                }else if(target < nums[l] || target == nums[l]){
                    re = l;
                }

                break;
            }
        }
        return re;
    }
}
