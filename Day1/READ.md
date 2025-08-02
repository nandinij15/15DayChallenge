15 Day DSA Challenge - Nandini

Welcome to my GitHub repository for the 15 Day DSA Challenge! 🚀

This repository will contain 3 solved LeetCode questions per day, along with clear explanations and approaches.

📅 Day 1 - [LeetCode Easy Level]

✅ Q1 - Two Sum

Problem: Given an array of integers nums and an integer target, return the indices of the two numbers such that they add up to target.

Approach:

Use a HashMap to store the numbers and their indices as you iterate.

For each number, calculate complement = target - num.

If the complement exists in the map, return its index and the current index.

Time Complexity: O(n)

Code: Q1_TwoSum.java

✅ Q26 - Remove Duplicates from Sorted Array

Problem: Given a sorted array nums, remove duplicates in-place such that each element appears only once and return the new length.

Approach:

Use two pointers i and j.

Pointer i keeps track of unique elements.

Move j through the array. If nums[i] != nums[j], increment i and set nums[i] = nums[j].

Return i + 1 as the new length.

Time Complexity: O(n)

Code: Q26_RemoveDuplicates.java

✅ Q53 - Maximum Subarray (Kadane's Algorithm)

Problem: Find the contiguous subarray with the largest sum.

Approach:

Initialize max_sum and current_sum to the first element.

Loop through the array from the second element:

Update current_sum = max(num, current_sum + num)

Update max_sum = max(max_sum, current_sum)

Return max_sum

Time Complexity: O(n)

Code: Q53_MaxSubArray.java
