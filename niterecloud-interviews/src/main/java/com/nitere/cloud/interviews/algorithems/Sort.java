package com.nitere.cloud.interviews.algorithems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 排序算法
 */
public class Sort {
    public static void main(String[] args) {
        int[] arr = {3,2,5,6,4,1,2};
        selectSort(arr);
    }

    // 選擇排序法
    public static void selectSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex])
                    minIndex = j;
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        System.out.print(Arrays.toString(arr));

    }
}
