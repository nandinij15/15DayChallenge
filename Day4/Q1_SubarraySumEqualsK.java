package Day4;

import java.util.HashMap;

public class Q1_SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        /*
        Prefix sum - Hashmap
        */
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int prefixsum = 0;
        int count = 0;
        for(int e: nums){
            sum+=e;
            int x = sum - k;
            if(map.containsKey(x)){
                count = count + map.get(x); 
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
