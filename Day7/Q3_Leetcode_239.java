package Day7;

import java.util.Deque;
import java.util.LinkedList;

public class Q3_Leetcode_239{
    public int[] maxSlidingWindow(int[] nums, int k) {
    int n = nums.length;
    int[] res = new int[n - k + 1];
    Deque<Integer> dq = new LinkedList<>();

    for (int i = 0; i < n; i++) {

        if (!dq.isEmpty() && dq.peekFirst() == i - k)
            dq.pollFirst();

        while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i])
            dq.pollLast();

        dq.offerLast(i);

        if (i >= k - 1)
            res[i - k + 1] = nums[dq.peekFirst()];
    }

    return res;
}
}