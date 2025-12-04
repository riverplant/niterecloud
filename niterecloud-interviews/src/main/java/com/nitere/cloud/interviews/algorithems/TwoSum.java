package com.nitere.cloud.interviews.algorithems;

import java.util.HashMap;
import java.util.Map;

/**
 * 給你一個整數陣列 nums 和一個整數 target，請找出 兩個 元素，使它們的和等於 target，並返回這兩個元素的下標（index）
 */
public class TwoSum {

    /**
     * Two Sum - return indices of the two numbers such that they add up to target.
     *
     * Time  : O(n)
     * Space : O(n)
     */
    public int[] twoSum(int[] nums, int target) {
        // key: number value in array
        // value: index of that number
        //建一個 HashMap<Integer, Integer>，key 是「數值」，value 是「index」
        Map<Integer, Integer> map = new HashMap<>();

        // iterate through the array once
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int need = target - current;  // the value we are looking for

            // if we have already seen the "need" value, we found the answer
            if (map.containsKey(need)) {
                // return indices: index of "need" and current index i
                return new int[] { map.get(need), i };
            }

            // otherwise, record current value and its index
            map.put(current, i);
        }

        // according to the problem we always have exactly one solution,
        // this line is just for completeness
        throw new IllegalArgumentException("No two sum solution");
    }
}
