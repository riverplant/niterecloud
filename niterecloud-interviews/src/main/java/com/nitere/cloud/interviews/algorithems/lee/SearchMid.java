package com.nitere.cloud.interviews.algorithems.lee;

/**
 * 陣列已經排序好了，所以可以用二分搜尋。
 *
 * 每一次取中間位置 mid：
 *
 * 如果 nums[mid] == target，直接回傳 mid；
 *
 * 如果 nums[mid] < target，說明目標只可能在 右半邊，就把 left 移到 mid + 1；
 *
 * 如果 nums[mid] > target，目標只可能在 左半邊，就把 right 移到 mid - 1。
 *
 * 持續縮小區間，直到 left > right，表示找不到，回傳 -1。
 *
 * 我們使用 閉區間模板：[left, right]
 * 對應的 while 條件是：while (left <= right)。
 */
public class SearchMid {

    /**
     * Binary Search in a sorted array.
     *
     * @param nums   sorted array of integers
     * @param target value to search for
     * @return index of target if found, otherwise -1
     *
     * Time  : O(log n)
     * Space : O(1)
     */
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1; // we use a closed interval [left, right]

        while (left <= right) {      // interval is not empty
            // avoid overflow: (left + right) / 2
            // int 有最大值 Integer.MAX_VALUE = 2_147_483_647
            // 如果left和right都非常大，直接寫(left + right) / 2可能會最大值溢出，
            // left + (right - left) / 2 可以避免最大值溢出
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;          // found the target
            } else if (nums[mid] < target) {
                // target is in the right half
                left = mid + 1;
            } else {
                // nums[mid] > target, target is in the left half
                right = mid - 1;
            }
        }

        // not found
        return -1;
    }
}
